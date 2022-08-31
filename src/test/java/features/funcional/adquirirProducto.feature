@funcional
Feature: Agregar un producto

  @browser
  Scenario: Se agrega una Laptop al carro de compras
    Given El usuario se encuentra en al pagina principal
    When el usuario seleciona la seccion Laptos
    When el usuario selecciona un producto
    When presionar el boton Add to cart
    When Ingresar a la seccion Cart
    Then Validar que se agregara de manera correcta al carro de compras
