@ignore
Feature: Pagina Login

  Scenario Outline: Realizar Login
    Given Ingresar a la sección Login
    When Ingresar email y password y presionar el boton Login "<email>" "<pass>"
    Then Validar el Login

    Examples:
      | email          | pass      |
      | test@gmail.com | 123456789 |