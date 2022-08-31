@api
Feature: Put mascota

  @service @put
   Scenario Outline: Modificar una mascota existente
     * def jsonResponse = read('../validatorSchema/schema.json')
    Given url "https://petstore.swagger.io/v2/pet/"
    And request
     """
    {
  "id": <Vid>,
  "category": {
    "id": 0,
    "name": "string"
  },
  "name": "<Vname>",
  "photoUrls": [
    "string"
  ],
  "tags": [
    {
      "id": 0,
      "name": "string"
    }
  ],
  "status": "<Vstatus>"

}
    """
    When method PUT
    Then status <status>
    And match $ == jsonResponse

    Examples:
      | Vid | Vname | Vstatus   | status |
      | 127 | ruri  | available | 200    |