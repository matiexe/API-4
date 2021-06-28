
## Consignas API 4

1.	Creá un proyecto Java con el IDE Eclipse y, en el mismo, construí tres clases para desarrollar la funcionalidad de cálculo de precio de venta. 
Las clases deberán ser:
    - Producto: que deberá tener los atributos privados “nombre”, “precio” y “stock”; un constructor que permita crear objetos recibiendo los tres datos como parámetros y tres métodos públicos para informar el valor de cada uno de los atributos.
    -	Inventario: deberá tener un único atributo privado, que será una lista de objetos de tipo “producto”; un constructor sin parámetros de entrada que inicialice la lista (vacía por el momento). Además, deberá contar con dos métodos públicos: “agregarProducto”, que reciba como parámetro de entrada un objeto de tipo producto y lo agregue a la lista e “informarPrecios”, que deberá recorrer la lista e imprimir los precios de compra de cada producto.
    •	Aplicación: la cual usarás para probar las funcionalidades, por lo que deberá contar con un método “main”. Al ejecutar esta clase, se deberán ver por consola los precios de venta calculados para cada uno de los productos.

2.	En este desarrollo deberás agregar la funcionalidad que diferencia a los productos “promocionales” del resto. Para estos productos, tal como ya lo diseñaste, no se deberá sumar el porcentaje de la ganancia. 
Para esto, el analista de tu equipo te indica que la clase “producto” tendrá un nuevo atributo privado de tipo “boolean” que será “esPromocional”. Cuando este atributo sea “true” no se deberá sumar el porcentaje de ganancia y cuando sea “false” sí se deberá sumar.

3.	Finalmente, tenés que agregar al informe de precios las sumas de los precios de compra y los precios de venta. Por lo tanto, deberás modificar el método “informarPrecios” para reflejar estos nuevos datos.
