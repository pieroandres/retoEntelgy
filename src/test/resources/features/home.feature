@solicitarTarjeta
Feature: Funcionalidad de Solicitud de Tarjeta de Crédito

  @solicitarTarjetaOk
  Scenario Outline: solicitar tarjeta de credito aprobado
    Given que la web esta operativa
    When ingreso mi dni "<dni>", fecha de nacimiento "<fechaNacimiento>" y celular "<celular>"
    And doy click en el boton DESCUBRELA
    Then se visualiza el mensaje "<texto>"
    Examples:
      | dni      | fechaNacimiento | celular   | texto                                                                |
      | 44579795 | 12/05/1990      | 999444555 | ¡Felicitaciones! Tenemos para ti una Tarjeta de Crédito con Garantía |