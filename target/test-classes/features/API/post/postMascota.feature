@post
Feature: Post pet

  Scenario Outline: Agregar una mascota nueva
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

    When method POST
    Then status <status>
    And match $ == jsonResponse

    Examples:
      | Vid | Vname    | Vstatus   | status |
      | 127 | firulais | available | 200    |