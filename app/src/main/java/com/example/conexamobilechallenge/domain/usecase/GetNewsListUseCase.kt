package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.model.News
import javax.inject.Inject

class GetNewsListUseCase @Inject constructor() {

    operator fun invoke(): List<News> {
        return listOf(
            News(
                id = 1,
                title = "¿Paredes a Arabia?",
                description = "Leandro Paredes, que este 29 de junio cumplirá 30 años, actualmente se encuentra abocado a la búsqueda del bicampeonato de la Copa América con la selección argentina. Sin embargo, un llamado que recibió en los últimos días cambió un poco el escenario y provocó varios interrogantes en su futuro.\n Según reveló Corriere dello Sport, los dos argentinos que militan en Roma recibieron ofertas para dejar el conjunto de la capital italiana y trasladarse a Arabia Saudita. Si bien Paulo Dybala rechazó de cuajo el ofrecimiento (también cuenta con sondeos del Manchester United de Inglaterra), el periódico italiano advierte que las cifras que están sobre la mesa generaron dudas en Leandro Paredes.\n El volante central, que se transformó en una pieza clave para el director técnico Daniele De Rossi en la Loba, habría recibido el contacto desde sus agentes para presentarle esta propuesta, pero pidió tiempo para analizar la situación por una razón obvia: su cabeza está enfocada en la defensa del título con Argentina. “Estas son las propuestas clásicas que no se pueden rechazar. Esas que pasan una vez en la vida y que a los 29 años merecen la pena tener en cuenta”, fue la reflexión del periodista Jacopo Aliprandi en el reconocido diario europeo.\n Aunque la temporada de los Giallorossi tuvo altibajos al culminar en la sexta colocación en la Serie A con 63 unidades –31 menos que el campeón Inter–, llegando a semifinales de la Europa League y siendo eliminado en cuartos de final de la Copa Italia a manos de su clásico rival Lazio, el mediocampista albiceleste fue uno de los puntales del equipo. En su regreso al club tras sus pasos por Zenit de Rusia, Paris Saint-Germain de Francia y Juventus de Italia, el futbolista redondeó la temporada con 5 goles y 7 asistencias en 49 presentaciones.\n Esta impactante oferta, según el mencionado medio, también le generó una disyuntiva a Leandro Paredes con respecto a un posible regreso a Boca Juniors, club del cual es hincha y en el que inició sus primeros pasos en el fútbol y debutó como profesional. “¿Quedarse un año más en la Roma y luego regresar a Boca libre, o pasar un par de años en Arabia antes de terminar su carrera en la Bombonera? Un verdadero dilema, un nudo que probablemente se resolverá en los próximos días, también para darle a la Roma la oportunidad de encontrarle un sustituto”, remarcaron en el artículo.\n Hay que tener en cuenta que el argentino había dado una entrevista días antes de la Copa América y fue claro sobre su futuro: “Estoy muy bien, todavía tengo 29 años, tengo contrato con mi club. Vivo mi carrera día a día. No le prometí nada a Román, él fue muy claro conmigo, yo también. Ni yo voy a empujar para ir, ni él me va a llamar para volver. Sabemos que el fútbol es así, vamos viendo cómo se van dando las cosas y, cuando se tenga que dar, se dará. No tengo dudas de que se dará. Mis ganas siempre son de querer volver”.\n Mientras tanto desde Italia, incluso, ya hablan de posibles reemplazantes en caso de que decida emigrar rumbo a Arabia Saudita. El flamante director deportivo Florent Ghisolfi baraja como alternativa al mediocampista estadounidense del Real Betis de España Johnny Cardoso, mientras que en la cabeza de Daniele De Rossi está la idea de alguien similar a Matteo Prati, que tras una buena temporada en Spal recaló en Cagliari. “El caso es que ahora la Roma y Leandro se encuentran ante una encrucijada y tendrán que hablar si el centrocampista sigue tentado”, advirtieron.\n Mientras tanto, Leandro Paredes busca ganarse un lugar en la zona media de la selección campeona del mundo en la Copa América Estados Unidos 2024. El ex Chievo Verona fue titular en el triunfo en el debut ante Canadá y no sumó minutos en la agónica victoria ante Chile. Con el boleto a los cuartos de final ya asegurado, la Albiceleste culminará su participación dentro del Grupo A enfrentando a Perú este sábado en Miami.",
                image = "https://www.infobae.com/new-resizer/jGqphVycTVtTK-VQp3nP9R7USfg=/768x432/filters:format(webp):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/UQJJORN77FBJREZY2JFXMNXL4U"
            ),News(
                id = 2,
                title = "Argentina dolarizada",
                description = "Los economistas Alfredo Romano y Emilio Ocampo, quien fue candidato del Milei a presidir el BCRA, escribieron el libro “Argentina dolarizada” (Galerna), que se presenta hoy. Hablaron con Infobae sobre la marcha de la economía en los primeros seis meses del gobierno de La Libertad Avanza.\n Emilio Ocampo esquiva cualquier pregunta relacionada con su polémica y frustrada llegada a la presidencia del Banco Central. “Sin comentarios”, dice el “halcón dolarizador” local, uno de los primeros funcionarios que Javier Milei confirmó durante la campaña electoral del año pasado. Era un académico casi desconocido a nivel mediático masivo y se convirtió de un día para el otro en el ingeniero de la estrategia para adoptar rápido la moneda de EEUU y cerrar el BCRA que abrazó el ahora Presidente. Su posicionamiento no prosperó y su plan, a priori, tampoco.\n Ocampo y Alfredo Romano, otro impulsor y defensor a ultranza de la dolarización, acaban de publicar “Argentina dolarizada. Perspectivas para una nueva economía” (Galerna).\n Romano es licenciado en Administración de Empresas, magíster en Finanzas (Universidad de San Andrés) y en Políticas Públicas (Universidad de Columbia), preside Romano Group y dirige la Licenciatura en Economía Empresarial y la Diplomatura de Mercado de Capitales de la Universidad Austral. El libro será presentado esta tarde por los empresarios Alec Oxenford y Eduardo Bastitta, ambos integrantes del Consejo de Asesores Económicos de Milei, y Sergio Berenstein.\n Infobae dialogó con ambos autores sobre la obra conjunta y sobre cómo ven al Gobierno, de las chances aún vigentes de implementar una dolarización, de la salida del cepo y de la gestión de Luis Caputo al frente del Palacio de Hacienda.\n Ocampo: Es imposible que una economía crezca con una inflación alta, persistente y volátil. La adicción al populismo le ha costado muy cara a la Argentina y ha empujado al país a una situación subóptima. Somos el único país de América Latina que tuvo una hiperinflación en el siglo XX y volvió a las andanzas en el siglo XXI. No hemos logrado transformar la experiencia en enseñanza. Según un informe reciente del Banco Mundial, desde 1960 la Argentina no sólo tuvo la mayor tasa de inflación promedio del mundo, sino que además fue el país que estuvo mayor cantidad de años en recesión. La dolarización no es una panacea. No va a resolver todos los problemas que enfrenta la economía argentina, pero resuelve de manera muy contundente uno muy importante: la inflación. Y eliminar la inflación es condición necesaria, tanto en el plano político como económico, para resolver muchos otros problemas. Agregaría que la cantidad de dólares que tienen los argentinos al menos quintuplica la cantidad de pesos que circulan en la economía. Darle curso legal al dólar tiene enorme sentido porque reduciría los costos de transacción para la economía.\n Romano: Nuestra historia de indisciplina fiscal y monetaria nos pone en un lugar distinto al de Perú y Uruguay en los comienzos de los ‘90, cuando avanzaron en sus planes de estabilización. En nuestro libro dedique un apartado extensivo a evaluar dichas economías para que podamos sincerarnos y entender que Perú y Uruguay no son la Argentina y que los desafíos monetarios de nuestra economía son mayores. Por ende, el bimonetarismo legalizado sería un error costoso para nuestro país, y la dolarización puede resultar ser un ancla potente para estabilizar definitivamente nuestra macro.",
                image = "https://www.infobae.com/new-resizer/fJV4uc6vZfFsyTW3hvJLftyTkH8=/768x432/filters:format(webp):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/4UIJUQFKKJDORCQ4672AHFANK4.jpg"
            ),News(
                id = 3,
                title = "Hito Cultural",
                description = "Hito cultural es un nuevo impulso para desarrollar una comunidad de jóvenes artistas, creado por Hit Group, liderado por Alejandro Gawianski, seleccionó 20 creadores que trabajan, se forman y reciben dinero mensual para producir sus obras en un espacio de Parque Patricios.\n Con un encuentro de artistas, galeristas y gestores culturales, fue presentado en Parque Patricios el espacio Hito Cultural, destinado a estimular la tarea creativa de jóvenes artistas y desarrollar una comunidad de mecenas, coleccionistas y amantes del arte. Este proyecto del arquitecto y emprendedor Alejandro Gawianski impulsa un nuevo polo cultural en el sur de la ciudad de Buenos Aires. La reunión en la fría noche del miércoles tuvo lugar en la sede de los talleres de la Fundación HIT, cuya directora ejecutiva es Alex Gasparutti.\n “HIT GROUP a través de su fundación aporta este espacio a los artistas para desarrollar sus actividades. Parque Patricios es uno de los tantos hermosos barrios de esta ciudad, ligado al Hit Group desde hace muchos años. Y nos parece el lugar ideal para crear una comunidad”, expresó Gawianski. “Tenemos la certeza de que a través de encuentros y diálogos. los amantes del arte, mecenas y a aquellos que se sienten atraídos por el arte y desean empezar a coleccionar, se sentirán comprometidos y entusiasmados. La ambición de la fundación es que finalmente los artistas tengan suficiente visibilidad para poder disfrutar y vivir de su talento y alcanzar reconocimiento social y cultural por su obra”, concluyó.\n La fundación Hit realizó una convocatoria y designó a un jurado integrado por Laura Buccellato, Gachi Prieto, Fabiana Barreda, Florencia Battiti, Rodrigo Alonso y Pablo Caligaris. Ellos fueron los encargados de seleccionar a los siguientes artistas: Carlos Gutiérrez, Carolina Favre, Carrie Bencardino, Dani Raggio, Diego Gelatti, Federico Roldán Vukonich, Juan Ignacio Cabruja, Julia Padilla, Julio Hilger, Lucila Sancineti, Luisa Lerman, María Emilia Hendreich, Marina Daiez, Mateo Amaral, Nana Schelz, Natalia Forcada, Nicolás Rodríguez, Penny di Roma, Sofía Kauer, Nicolás Licera y Victoria Barca.\n Además se otorgaron diez menciones a artistas digitales y tecnológicos para que puedan usar el espacio e interactuar con los demás artistas. Este es el listado: Rodrigo Alcón Quintanilha, Joaquín Moreno, Gabriel Rud, Belén Romero Gunset, Eva Cafiero, Florentina González, Gonzalo Silva, Faktor, Gabriela Munguía, Abril Carissimo.\n Desde el pasado 2 de mayo, los 20 seleccionados ocuparon sus talleres y empezaron a producir en un amplio espacio, ubicado muy cerca del estadio de Huracán, un lugar clave del barrio.\n Los artistas seleccionados pueden disponer del taller, participar de diversos cursos de formación a cargo de los jurados e invitados. Reciben además 500 dólares mensuales para compra de materiales y gastos de producción. La duración de la beca será de ocho meses, hasta el 31 de diciembre. En diciembre, los interesados en postularse para ser seleccionados podrán aplicar a la nueva convocatoria 2025.",
                image = "https://www.infobae.com/new-resizer/Pl1w-LFYxKkZBzS3I5c3uhC8fK4=/768x432/filters:format(webp):quality(85)/cloudfront-us-east-1.images.arcpublishing.com/infobae/UZAKWWQISFH2JP45MTWA7NHSD4.jpg"
            )
        )
    }

}