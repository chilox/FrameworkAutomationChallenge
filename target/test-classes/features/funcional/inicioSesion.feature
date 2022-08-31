@ignore

Feature: Logueo de usuario

  Scenario Outline: Iniciar sesion
    Given Usuario con usuario valido para ingresar
    When El usuario presiona el boton Log in
    And Ingresar el <username> usuario
    And ingresar la <password> contraseña
    And presionar el boton login
    Then el usuario se loguea de manera correcta <username>

    Examples:
      |username|  password   |
      |ilich12 |  i123456789 |