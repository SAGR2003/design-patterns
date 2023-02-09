<h1 align="center">Integrantes</h1><h2 align="center"> Daniela Cortés Méndez <br> Sergio Andrés González Róa <br> Kareen Alejandra Latorre Martínez</h2>

# Problemas a resolver con patrones de diseño:

***Patron estructural: Decorator*** <br>
Imagine que la Universidad busca montar un nuevo puesto de comida, se le pide crear el menú base de Empanadas para que sea más sencillo implementar el sistema de facturación en caso de que el negocio prospere. Los clientes pueden pedir empanadas de carne o de pollo, contando también la posibilidad de agregar adiciones a su pedido como: queso extra, gaseosa y/o guacamole, teniendo estas un costo adicional. En este caso, es posible utilizar el patrón de diseño “Decorator” para modelar los extras y su costo adicional mediante la creación de una clase base para las empanadas y luego crear clases decoradoras que representen los extras y su precio. Así al agregarle un extra, se crea una nueva instancia de una clase decoradora y al calcular el costo total, se sumará el costo adicional y muestra el precio de los productos ofrecidos.

***Patron creacional: Abstract Factory*** <br>
Supongamos que estamos desarrollando un juego en línea que tiene diferentes entornos jugables como WorldWar, DeadWar y MagicWar. Cada entorno tiene diferentes tipos de personajes y objetos, como guerreros, magos, zombies y armas.<br>
El problema surge cuando queremos agregar nuevos entornos y nuevos objetos, ya que el código existente que crea los personajes y objetos no es flexible ni escalable. Por esta razón podemos usar el patrón de diseño "Abstract Factory", con el cual podemos crear una interfaz llamada "FabricaDePersonaje" que se encargue de crear los objetos relacionados con el personaje en cada entorno. Luego, podemos crear clases concretas específicas para cada entorno, como "FabricaDePersonajeMagicWar", "FabricaDePersonajeDeadWar" y "FabricaDePersonajeWorldWar", que implementen la interfaz abstracta.
De esta manera, si queremos agregar un nuevo entorno o un nuevo objeto, solo tenemos que crear una nueva clase concreta sin tener que modificar el código existente. Además, esta solución es flexible y escalable, lo que significa que podemos crear objetos personalizados para cada entorno sin tener que modificar el código existente.

***Patron de comportamiento: Template Method*** <br>
Suponga que se necesita crear un  programa que diseñe los distintos menús para 3 días de la semana, (viernes, sábado y domingo) dicho menú, se va a desplegar a la entrada del restaurante, y cuenta con la siguiente estructua: <br>
-Saludo.<br>
-Sopa.<br>
-Proteina.<br>
-Harina.<br>
-Jugo.<br>
-Despedida.<br>
Por normas del restaurante, ofrece siempre el mismo saludo, sopa y despedida, más sin embargo las demás partes, varían dependiendo del día, esto nos muestra que a pesar de que tienen algoritmos casi idénticos, tienen diferencias dependiendo del día, es por ello que el mejor patrón a aplicar es el Template Method, dejando como "plantilla" la clase abstracta "MenuDelDia" donde se crea el método plantilla, que se declara como "final", para evitar que lo sobreescriban, y se crean las respectivas clases concretas (días), de tal forma que si el restaurante expande su menú para el resto de días, sencillamente se cree otra clase concreta para el día respectivo, pero conservando la misma plantilla que tiene el restaurante. Al momento de ejecutar este ejemplo, podemos ver cómo por defecto está el menú del domingo, pero si se cambia a cualquier otro día, podemos ver cómo el menú cambia, sin afectar la estructura brindada por la plantilla, pero aún realizando los cambios necesarios.
