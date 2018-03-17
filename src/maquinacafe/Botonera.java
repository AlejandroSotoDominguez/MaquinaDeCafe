
package maquinacafe;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Botonera {
    Monedero mon = new Monedero();
    int cantidadAzucar;
    int opcion; 
    float dinero;
    DecimalFormat df = new DecimalFormat("0.00");
    
    public void menu(ArrayList<Producto> listaProductos){

        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1. Café  Precio: 0.80\n"
                    + "2. Té  Precio: 1.00\n"
                    + "3. Chocolate  Precio: 0.90\n")); 
        }while(opcion<=0 || opcion>=4);
        
        do{
            dinero = Float.parseFloat(JOptionPane.showInputDialog("Introduce el dinero"));
            mon.setCredito(dinero);
 
        }while(mon.getCredito()<listaProductos.get(opcion-1).getPrecio());
        
        mon.setCambio(dinero-listaProductos.get(opcion-1).getPrecio());

        int posicion = opcion-1;    

        do{ 
        opcion = Integer.parseInt(JOptionPane.showInputDialog(""
                + "1. Cantidad azúcar\n"
                + "2. Preparar producto"));
        
        switch(opcion){
     
            case 1:
                do{
                int cantidadAzucar = Integer.parseInt(JOptionPane.showInputDialog("Introduce una cantidad de azúcar entre 1 y 5"));
                }while(cantidadAzucar>=1 && cantidadAzucar<=5);
                
                Producto prod = new Producto();
                prod.setAzucar(cantidadAzucar);
                break;
        
            case 2:
                JOptionPane.showMessageDialog(null,"Preparando "+listaProductos.get(posicion).getNombre());
                JOptionPane.showMessageDialog(null,listaProductos.get(posicion).getNombre()+" listo.\n"+"Vuelta: "+df.format(mon.getCambio()));
                opcion=0;
                
            case 0:
                System.exit(opcion);
                
            default:
                JOptionPane.showMessageDialog(null,"Opción no válida");
                break; 
            }
        
        }while(opcion!=0);
        
    }
    
}
