@ignore
Feature: Navegar en la funcionalidades de Webview

  Scenario Outline: Realizar una busqueda en la sección
    Given Ingresar a la sección Webview
    When Seleccionar la casilla de busqueda
    Then Realizar la busqueda <valorBusqueda>

    Examples:
      | valorBusqueda |
      |browser        |

  Scenario: Navegar por las opciones del Menu
    Given Ingresar a la sección Webview
    When  Abrir el menu
    Then  Navegar por las opciones

