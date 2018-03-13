
package testheroesvillanos;

/**
 * 
 * @author Yaki's
 */

public class Personaje extends Enfrentable {

    //private String nombre;
    private float fuerza;
    //private String bando;

    public Personaje(String nombre, float fuerza /*String bando*/) {
        super.Enfrentable(nombre);
        this.fuerza = fuerza;
    }

        @Override
    public float getFuerza() {
        return this.fuerza;
    }
    
    /*
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }

    public String getBando() {
        return this.bando;
    }

    public void setBando(String bando) {
        this.bando = bando;
    }
    */

}
