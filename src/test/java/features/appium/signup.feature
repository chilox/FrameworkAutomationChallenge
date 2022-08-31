@appium
Feature: Alta de usuario

  @mobile
  Scenario Outline: Dar de alta un usuario
    Given Ingresar en la sección Login / sign up
    When llenar todos los campos requeridos y presionar el boton "<email>" "<password>" "<confirmPassword>"
    Then Validar el alta del usuario

    Examples:
      | email          | password  | confirmPassword |
      | test@gmail.com | 123456789 | 123456789       |