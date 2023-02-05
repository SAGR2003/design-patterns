# Problemas a resolver con patrones de diseño:

Patron estructural: Decorator
Imagine que estamos creando un sistema de facturación más eficiente para un local de empanadas de la Universidad. Los clientes pueden pedir diferentes tipos de empanadas con precios variados, teniendo también la posibilidad de agregar adiciones a sus platos como: queso extra, gaseosa y/o guacamole, teniendo estas un costo adicional. En este caso, es posible utilizar el patrón de diseño “Decorator” para modelar los extras y su costo adicional mediante la creación de una clase base para las empanadas y luego crear clases decoradoras que representen los extras y su precio. Así al agregarle un extra, se crea una nueva instancia de una clase decoradora y al calcular el costo total, se sumará el costo adicional y muestra el precio de los productos ofrecidos.

