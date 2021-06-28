public class Aplicacion {
    public static void main(String[] args){
        Producto gaseosaProducto = new Producto("Gaseosa", 100, 40,true);
        Producto arrozProducto   = new Producto("Arroz", 50, 80,false);
        Producto cervezaProducto = new Producto("cerveza", 120, 40,true);


        Inventario inventario = new Inventario();
        inventario.agregarProducto(gaseosaProducto);
        inventario.agregarProducto(arrozProducto);
        inventario.agregarProducto(cervezaProducto);

        inventario.informarPrecios();

    }



}
