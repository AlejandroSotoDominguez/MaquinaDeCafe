
package maquinacafe;

import java.util.ArrayList;

public class MaquinaCafe {

    public static void main(String[] args) {
        
        ArrayList<Producto> listaProductos = new ArrayList();
        Producto prod1 = new Producto(0.80f,"Café",1);
        Producto prod2 = new Producto(1.00f,"Té",1);
        Producto prod3 = new Producto(0.90f,"Chocolate",1);
        listaProductos.add(prod1);
        listaProductos.add(prod2);
        listaProductos.add(prod3);
   
        Botonera b = new Botonera();
        b.menu(listaProductos);
  
    }
    
}
