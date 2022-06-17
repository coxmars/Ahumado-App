
package Model;


public class Factura extends Persona {
    // atributos
    private String cantidad, precio;
    
    // constructor
    public Factura(String nombre,String cantidad,String precio) {
        super();
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
    // Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    // Here we overwrite the toString method to show the correct data
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
