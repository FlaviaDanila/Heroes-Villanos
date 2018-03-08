
package testheroesvillanos;

import java.util.List;

/**
 * @author Yaki's
 */

public class Liga extends Enfrentable {

    /*
    private List<Personaje> personajes;
    private List<Liga> ligas;
    private String nombre;
    private float fuerza;
    */
    private List<Enfrentable> enfrentables;
    
    public Liga(String nombre) {
        
    }

    @Override
    public float getFuerza() {
    float suma = 0;
    for(Enfrentable e : enfrentables)
        suma += e.getFuerza();
        return suma/(float)enfrentables.size();
    }
    
    public void addEnfrentable(Enfrentable e) {
        enfrentables.add(e);
    }
    
            
//    public void addPersonaje(Personaje p) {
//        personajes.add(p);
//    }
//
//    public void addLiga(Liga l) {
//        ligas.add(l);
//    }
    
}
