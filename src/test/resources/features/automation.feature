#author: Amir RC
#language: es
@Regresion
Característica: Login en la pagina your company

  Yo como usuario
  Quiero realizar un login
  Para validar los distintos escearios que se le pueden presentar a los usuarios

  Antecedentes:
    Dado que el actor abre el navegador en la pagina de your company
    Y ingresa al modulo Sign in

  @loginFailed
  Escenario: Realizar un login Fallido
    Cuando ingresa el correo "amirssac@gmail.com" y contraseña "Amir1ss" erroneamente
    Entonces visualizaremos una alerta de error en la autenticacion

  @loginSuccefull
  Escenario: Realizar un login Exitoso
    Cuando ingresa el correo "amirr10c@gmail.com" y contraseña "Amir123456789" correctamente
    Entonces visualizaremos el home de la tienda de compra
