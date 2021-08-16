# language: es

@Cucumber
Característica: Realiza compra de un camiseta

  esta feature se trata de primero registrarse en la pagina web automationpractice con sus datos personales,
  luego de eso agrega la compra del producto al carrito, seguidamente verifica la compra con sus datos registrados,
  seguidamente muestra en un caja de texto si desea agregar un comentario sobre su pedido, continua con la compra,
  luego valida si esta de acuerdo con los términos de servicio y si los cumplirá incondicionalmente, seguidamente
  procesa la orden por cheque y por ultimo confirma la orden del pedido visualizando un mensaje que tu orden en mi
  tienda esta completa.


  @Regresion
  Escenario: Realiza una compra de una camiseta
    Dado El usuario registrado ingresa a la pagina automationpractice
    Cuando El usuario comienza a realizar una compra de una camiseta en automationpractice
    Entonces El usuario puede realizar su orden del pedido correctamente mediante un pago por cheque

  Esquema del escenario: Verificar que los datos del usuario y el pedido este correctamente para el pago
    Dado El usuario registrado ingresa a la pagina automationpractice
    Cuando EL usuario realiza la compra de un producto en la categoría de camisetas de manga corta descolorida
    Entonces El usuario deberia ver los campos diligenciados y seleccionados para realizar la compra de su pedido
    Ejemplos:
      | crear una cuenta con un correo                  | Ingresa a la pagina con su correo y clave registrada        |
      | Selecciona la categoría T-Shirts                | Escoge producto de camiseta manga corta descoloridas        |
      | Agrega al carrito la orden del pedido           | Muestra en un mensaje que la compra fue agregada al carrito |
      | Visualiza un resumen de compra y valida proceso | Puede agregar otra dirección y un comentario si requiere    |
      | Valida si esta de acuerdo con términos servicio | Realiza pago por cheque y confirma orden del pedido         |