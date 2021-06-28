
/**
 * Producto
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    private boolean esPromocional; 

    public Producto(String nombre, double precio, int stock ,boolean esPromocional){
        this.nombre        = nombre;
        this.precio        = precio;
        this.stock         = stock;
        this.esPromocional = esPromocional;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock(){
        return this.stock;
    }
    public boolean getPromocional(){
        return this.esPromocional;
    }
}