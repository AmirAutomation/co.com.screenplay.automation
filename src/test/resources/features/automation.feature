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
  Escenario: El usuario realiza un login Fallido
    Cuando ingresa el correo "amirssac@gmail.com" y contraseña "Amir1ss" erroneamente
    Entonces se visualizara una alerta con el mensaje de error "Authentication failed."

  @loginSuccefull
  Escenario: El usuario realiza un login Exitoso
    Cuando ingresa el correo "amirr10c@gmail.com" y contraseña "Amir123456789" correctamente
    Entonces visualizaremos el home de la tienda de compra

  @fieldEmailRequired
  Escenario: validar el campo email address como requerido
    Cuando ingresa el correo "" y contraseña "Amir123456789" correctamente
    Entonces se visualizara una alerta con el mensaje de error "An email address required."

  @fieldPasswordRequired
  Escenario: validar el campo password como requerido
    Cuando ingresa el correo "amirr10c@gmail.com" y contraseña "" correctamente
    Entonces se visualizara una alerta con el mensaje de error "Password is required."