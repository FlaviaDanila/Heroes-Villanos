package testheroesvillanos;

/**
 * @author Yaki's
 */

public class TestHeroesVillanos {

    public static void main(String[] args) {
        
        Enfrentable theAvengers = new Liga("The Avengers");
        Enfrentable capitanAmerica = new Personaje("Capitán América", 3);
        Enfrentable mole = new Personaje("Mole", 4);
        
        theAvengers.addEnfrentable(capitanAmerica);
        theAvengers.addEnfrentable(mole);
        
        Enfrentable caballeroOscuridad = new Liga("Caballero de la Oscuridad");
        Enfrentable batman = new Personaje("Batmam", 10);
        
        caballeroOscuridad.addEnfrentable(theAvengers);
        caballeroOscuridad.addEnfrentable(batman);
        
        //aca estuvo juanito
        //Nare estuvo aquí
        //NareLovers ♥ ahre

    }

}
