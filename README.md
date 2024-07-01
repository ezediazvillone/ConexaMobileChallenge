## ConexaMobileChallenge ##

**Espero que les guste mi trabajo. ¡Muchas gracias por la oportunidad! Atte: Ezequiel Diaz Villone**

El proyecto cuenta con:

* 100% Kotlin
* Arquitectura MVVM
* Clean Architecture
* Navigation Components
* Diseño UI (adaptable a cualquier pantalla) (solo vertical)
* Inyección de dependencias con Dagger Hilt
* Glide
* Retrofit.
* Unit Test.

## MainActivity ##

* Activity con unicamente el contenedor de fragments (nav host fragment).

## MainFragment ##

* Fragment principal donde mostramos todas las noticias en un recycler view, un buscador de noticias
  y el accesso al apartado de usuarios.

* Se recuperan las noticias mediante un use case y se listan en un recycler view. Las mismas se
  recuperan desde la API pública JSONPlaceholder. El use case tiene unit test asociados.

* En caso de pulsar una noticia, navegaremos hacia la pantalla de detalle de la noticia enviando su
  id como parametro.

* Si ultizamos el buscador de noticias se llamara a un use case donde se filtraran las noticias cuyo
  titulo contenga nuestra busqueda realizada. El use case tiene unit test asociados.

* En caso de pulsar el logo del usuario, navegaremos hacia la pantalla de usuarios.

## DetailFragment ##

* Fragment de detalle de la noticia seleccionada. Se recupera el id enviado como parametro y
  mediante un use case obtenemos la noticia que coincida con nuestro id. El use case tiene unit test
  asociados.

* Mostramos una foto de la noticia.

* Mostramos el detalle de la noticia.

## UserFragment ##

* Fragment de usuarios donde recuperamos todos los usuarios mediante un use case y los mostramos en
  pantalla con un recycler view. Los mismos se recuperan desde la API pública JSONPlaceholder. El
  use case tiene unit test asociados.

* En caso de pulsar sobre un usuario, se abrira Google Maps con la dirección del usuario
  seleccionado.

## todo ##

* En la pantalla de detalle de novedades se podria mostrar mas datos de las noticias (publishedAt,
  category, url, etc...) pero decidi enfocarme mas en aspecto técnicos y no tanto visuales. Lo marco
  porque sería una buena mejora que note testeando la app.

* Se podria mejorar notoriamente el manejo de errores. Quise concentrarme en los "caminos felices" y
  simplemente si hay un error por cualquier motivo se retorna una lista vacía. Esto a mí no me
  gusta, no me parece una buena experiencia para el usuario ver un recycler vacío en caso de error.
  Tengo un proyecto personal donde tengo un ejemplo claro de la mejor manera de implementar esta
  pegadas a una api / firebase y manejar los errores correctamente, e informarselo al usuario con un
  dialog de error. Encantado de mostrarles mi proyecto personal en caso de que gusten.

* Para filtrar la lista de noticias por busqueda del usuario tuve que recuperar toda la lista de
  novedades y filtrarlo en mi use case. Esto a mí no me convence, en mi opinion la API debería tener
  una pegada en donde vos puedas mandarle la busqueda que realizo el usuario (un string) y ya te
  devuelva la lista filtrada.

* La app funciona con el modo oscuro, pero no lo podes habilitar desde la propia app. Me hubiera
  encantado hacer una pantalla de configuración donde puedas setear este dato y guardarlo en shared,
  pero no llegue con el tiempo.