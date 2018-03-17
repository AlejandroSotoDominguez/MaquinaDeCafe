
package maquinacafe;

import java.util.ArrayList;

public class Producto {
    private float precio;
    private String nombre;
    private int azucar;
    
    public Producto() {
    }

    public Producto(float precio, String nombre, int azucar) {
        this.precio = precio;
        this.nombre = nombre;
        this.azucar = azucar;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }


    @Override
    public String toString() {
        return "Producto{" + "precio=" + precio + ", nombre=" + nombre + ", azucar=" + azucar;
    }

    
    
    
}
