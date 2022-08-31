@api
Feature: Get elementos de la api

  @service @get
  Scenario Outline: Obtener mascota existente por medio del Id
    * def jsonResponse = read('../validatorSchema/schema.json')
    Given url "https://petstore.swagger.io/v2/pet/<ID>"
    When method GET
    Then status <status>
    And match response.id == <ID>
    And match $ == jsonResponse


    Examples:
      | ID                  | status |
      | 9223372036854265543 | 200    |

  @api
  Scenario Outline: Obtener mascota existente por medio del status
    * def jsonResponse = read('../validatorSchema/schema.json')
    Given url "https://petstore.swagger.io/v2/pet/<path>"
    And params {"status":"<Vstatus>"}
    When method GET
    Then status <statusCode>



    Examples:
      | ID  | statusCode | path          | Vstatus   |
      | 127 | 200        | findByStatus/ | available |