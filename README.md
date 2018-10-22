# Practica1
Práctica de Java.

En primer lugar empezaré comentando como la evolución este programa y el resultado final, seguidamente diré que realizan mis diferentes funciones y por último las dudas que tuve a la hora de realizarlo.

Primero de todo, empecé creando las clases comentadas en clase, por ejemplo Product, User, Books, UserList etc... , haciendo geters y seters de todos los atributos que tenía en las clases,
y también los constructores. Mi primera idea fue hacerlos sin listas simplemete con un "System.out.println();" pero me dí cuenta que no podía asociar por ejemplo los productos a los usuarios
o los productos a las categorias, después me informé sobre como funcionan y como se usan las listas e implenté mi primera lista de categorias y productos , posteriormente creé otra para el usuario
y otra para el userProduct.
Primeramente el usuario tiene que introducir su nombre , contraseña y correo, y si introduce algo mal, sale un mensaje de error e introducirá todo de nuevo, después el programa le pregunta si quiere ser premium y si quiere serlo debe introducir el número de la tarjeta de crédito. 
Seguidamente le saldrá por pantalla un menú con 6 opciones, que serían : buscar producto, buscar categoría, comprar, enseñar catalogo, enseñar mi carrito y cerrar.Si elige la opción de buscar categoría , introducirá la categoría deseada y el programa te enseñara los productos que exiten dentro de esta categoría.
si elige buscar producto, tendrá que introducir la categoría , posteriormente le saldrán los productos de esta categoría y tendrá que seleccionar un de ellos, además le saldrá información útil sobre el producto. En la opción comprar después de introducir la categoría y el producto
deseado le preguntará si quiere comprarlo, aunque no le dejara comprarlo si no hay stock, y seguidamente si quiere cambiar de moneda ya que se puede subir un producto en euros, dolares o libras. La opción mostrar catalogo únicamente muestra todas las categorías creadas. 
la opción de mostrar carrito te enseña el producto que haya comprado y si no ha comprado nada sale un mensaje diciendo que esta vacío. La última opción es salir del programa.

Finalmente he eliminado varias de las clases primeras y únicamente quedaron las 6 siguientes :Main, User, Category, Product, Menu y Test.

Pasamos al segundo punto.

-Main: sólo creo las categorías y los productos, también llamo a la funcion sign_up que se encuentra en User y start que está en Menu.
-User: creo las dos listas users y productUsers. La clase tiene varios atributos como : email, name, password, login, premium, credit.
La funcion sign_up lo que hace es pedirte el correo, contraseña, nombre por teclado y además te pregunta si quieres ser premium, si quiere entonces tendrá que introducir el número de crédito.
Si introduce un nombre o contraseña con una longitud menor a siete o la contraseña le falte el "@" o la tarjeta de crédito tiene una longitud menor a 10 le sale un mensaje de error y tiene que volver a introducir todos los datos.
Otra de las funciones dentro de User es buy en la que le resta uno al stock total del producto y le sale el resumen de la compra, además te pregunta si quiere un cambio de moneda , llamando a la función changeMoney que se encuentra en la clase Product, dentro de esta función usamos 
"System.out.printf("%.2f", product.price);" para que te salgan sólo dos decimales, también llamamos a la función getmny que se encuentra en la clase Product pata que salga el símbolo de la moneda($,€,£).
La función final_price hace que si eres premium no te suma los gastos de envío en cambio si no lo eres hace una llamada a la función mailPlus que se encuentra en la clase Product. 
Por último está la función printUserList en la que si tienes elementos comprados sale por pantalla el nombre del producto,pero si aún no has comprado nada aparece un mensaje diciendo que tu carrito esta vacío.
-Category: sólo tiene el atributo nombre y las listas de productos y de categorías, existen las funciones printProducts que te imprime la lista de productos lo mismo que la función de printCategories.
después comentamos la función searchCategory en la que busca la categoría en la lista, esta función devuelve una categoría que posteriormente usaremos. Por último dentro de la clase Category está la función searchProduct 
dónde busca el producto dentro de la lista, se hace un comprobación , si lo que ha introducido existe o no, si existe nos lleva a la función stats de la clase Producto y si no existe, te enseña un mensaje por pantalla y también devuelve un Product que usaremos en la clase Menu.
-Product: existen atributos como el nombre, precio, stock, id de producto y enum para los tipos de moneda que serían euro, dolar o libra.
Las funciones creadas son getMny, imprime el icono dependiendo de la moneda. changeMoney en la que dependiendo de la moneda que elijas te cambia el precio. La función mailPlus sirve para calcular los gastos de envío, si el producto cuesta menos de 30 los gastos de envío son gratis para todos 
pero si no es así entonces se calcula el 10% del precio y eso serían los gastos de envío y por último la función stats en la que salen los datos del producto como el nombre , precio en esta función también ponemos la limitación a dos decimales y se incluye el símbolo de la moneda con la función 
getMney. Se hace una comprobación para saber si hay stock o no hay stock. 
-Menu: hay un switch con las opciones buscar categoría, buscar producto, comprar, enseñar catalogo , enseñar lista de productos y salir.
Llamamos cada una de las funciones para cada opción, y hacemos que se repita cada vez que termine la función deseada.
-Test: aquí probamos algunas funciones que no sean void por ejemplo mailPlus.

Dudas:
1- No sabía como realizar el test, sabía que no se podían usar con funciones que no fueran void y tengo muy pocas funciones con otro tipo diferente a void.
2- No sabía implementar las listas y tuve que buscar información adicional.
3- No sabía subirlo a GitHub y un compañero de clase me ayudó.
