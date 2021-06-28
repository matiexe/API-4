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
        for (Producto producto : listaProductos) {
            System.out.println(producto);
        }
    }
}