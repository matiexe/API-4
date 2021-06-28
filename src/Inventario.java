import java.util.ArrayList;
import java.util.List;

public class Inventario {
    List<Producto> listaProductos;
    public Inventario(){
        this.listaProductos = new ArrayList<>();
    }
    public void agregarProducto(Producto producto) {
       this.listaProductos.add(producto); 
    }
    public void informarPrecios(){
        for (Producto producto : this.listaProductos) {
            System.out.println(
                "Precio de venta para "+ producto.getNombre() +" :$"+ calcularPrecioVenta(producto.getPrecio(), producto.getStock()));
        }
    }
    private double calcularPrecioVenta(double precioCompra, int stock){
        double precioFinal;
        double ganancia;
        double iva;

        iva = precioCompra*0.21;
        if((precioCompra>1500 && stock<1500) || stock <50){
            ganancia = precioCompra*0.15;
        }
        else{
            ganancia = precioCompra*0.20;
        }
        precioFinal = precioCompra+ganancia+iva;

        return precioFinal;
    }
}
