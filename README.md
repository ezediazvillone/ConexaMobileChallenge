## ConexaMobileChallenge ##

**Espero que les guste mi trabajo. ¡Muchas gracias por la oportunidad! Atte: Ezequiel Diaz Villone**

El proyecto cuenta con:

* 100% Kotlin
* Arquitectura MVVM
* Clean Architecture
* Navigation Components
* Diseño UI
* Inyección de dependencias con Dagger Hilt
* Glide

Pendientes:

* Implementar Retrofit.
* Implementar Unit Test.

## MainActivity ##

* Activity que contiene el contenedor de fragments (nav host fragment)

## MainFragment ##

* Fragment principal donde mostramos todas las noticias en un recycler view, un buscador de noticias
  y el accesso al apartado de usuarios.

* Se recuperan las noticias mediante un use case y se listan en un recycler view. En principio es
  una lista de noticias harcodeada en el use case pero en un futuro cuando revise la API que
  contiene el challenge quizas podamos recuperar estas noticias de esa misma API mediante retrofit.

* En caso de pulsar una noticia, navegaremos hacia la pantalla de detalle de la noticia enviando su
  id como parametro.

* Si ultizamos el buscador de noticias se llamara a un use case donde unicamente se mantendran las
  noticias cuyo titulo contenga nuestra busqueda realizada.

* En caso de pulsar el logo del usuario, navegaremos hacia la pantalla de usuarios.

## DetailFragment ##

* Fragment de detalle de la noticia seleccionada. Se recupera el id enviado como parametro y
  mediante un use case buscamos en la lista de noticias la que coincida con nuestro id recuperado.

* Mostramos una foto de la noticia.

* Mostramos el detalle de la noticia (scroleable).

## UserFragment ##

* Fragment de usuarios donde recuperamos todos los usuarios mediante un use case y los mostramos en
  pantalla con un recycler view. En principio la lista de usuarios es una lista harcodeada en el use
  case pero en un futuro cuando revise la API que contiene el challenge quizas podamos recuperar
  estos usuarios de esa misma API mediante retrofit.

* En caso de pulsar sobre un usuario, se nos abrira Google Maps con la dirección del usuario
  seleccionado.