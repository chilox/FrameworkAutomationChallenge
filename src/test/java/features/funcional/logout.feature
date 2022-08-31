@funcional
Feature: logout de usuario

  @browser @ignore
  Scenario Outline: El usuario cierra la sesion
    Given Iniciar session con <username> y <password>
    When pesiona el boton log out
    Then en usuario cierra la sesion correctamente

    Examples:
      | username | password   |
      | ilich12  | i123456789 |