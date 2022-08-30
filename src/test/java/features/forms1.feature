@ignore
  Feature: Sección Forms

    Scenario Outline: Activar un formulario
      Given Ingresar en la sección Forms
      When llenar todos los campos requeridos "<texto>"
      Then Validar la activación del form

    Examples:
      | texto   |
      | Esto es un texto de prueba|