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
        double precioVenta;
        double listaPreciosVentas[];
        listaPreciosVentas = new double[listaProductos.size()];
        for (Producto producto : this.listaProductos) {
            precioVenta = calcularPrecioVenta(producto.getPrecio(), producto.getStock(),producto.getPromocional());
            listaPreciosVentas[this.listaProductos.indexOf(producto)] = precioVenta;
            System.out.println("Precio de venta para "+ producto.getNombre() +" :$"+ precioVenta);
        }
        System.out.println("Total de precio de compras: $"+ sumatoriaPreciosCompra());
        System.out.println("Total de precio de ventas : $"+ sumatoriaPreciosVenta(listaPreciosVentas));
    }
    private double calcularPrecioVenta(double precioCompra, int stock ,boolean promocion){
        double precioFinal;
        double ganancia;
        double iva;

        iva = precioCompra*0.21;
        if (promocion){
            precioFinal=precioCompra+iva;
        }
        else{
            if((precioCompra>1500 && stock<1500) || stock <50){
                ganancia = precioCompra*0.15;
            }
            else{
                ganancia = precioCompra*0.20;
            }
            precioFinal = precioCompra+ganancia+iva;
        }
        

        return precioFinal;
    }

    private double sumatoriaPreciosCompra(){
        double sumatoria = 0;
        for (Producto producto : listaProductos) {
            sumatoria = sumatoria + producto.getPrecio();
        }
        return sumatoria;
    }
    private double sumatoriaPreciosVenta(double listaPreciosVentas[]){
        double sumatoria = 0;
        for (int i = 0; i < listaPreciosVentas.length; i++) {
            sumatoria = sumatoria + listaPreciosVentas[i]; 
        }
        return sumatoria;
    }
}
