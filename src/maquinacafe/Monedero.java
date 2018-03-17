
package maquinacafe;

public class Monedero {
    private float credito;
    private float cambio;

    public Monedero() {
    }

    public Monedero(float credito, float cambio) {
        this.credito = credito;
        this.cambio = cambio;
    }
    
    public void pedirDinero(){
        
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public float getCambio() {
        return cambio;
    }

    public void setCambio(float cambio) {
        this.cambio = cambio;
    }
    
    
}
