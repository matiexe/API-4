public class Aplicacion {
    public static void main(String[] args){
        Producto gaseosaProducto = new Producto("Gaseosa", 100, 40);
        Producto arrozProducto   = new Producto("Arroz", 50, 80);
        Producto cervezaProducto = new Producto("cerveza", 120, 40);


        Inventario inventario = new Inventario();
        inventario.agregarProducto(gaseosaProducto);
        inventario.agregarProducto(arrozProducto);
        inventario.agregarProducto(cervezaProducto);

        inventario.informarPrecios();

    }



}
