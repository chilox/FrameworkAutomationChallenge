@ignore @browser
Feature: Alta de nuevo usuario
  como nuevo usuario quiero generar un perfil para ingresar a la web

  Scenario Outline: Crear un usuario
    Given El usuario se encuentra en al pagina principal de demoblaze.com
    When El usuario presiona el boton Sign up
    And ingresa un <username> username
    And ingresa un <password> password
    And presiona el boton Sign up
    Then Se crea el usuario de manera correcta

    Examples:
      | username | password   |
      | ilich12  | i123456789 |

