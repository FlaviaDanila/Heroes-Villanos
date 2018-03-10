package testheroesvillanos;

/**
 * @author Yaki's
 */
public class TestHeroesVillanos {

    public static void main(String[] args) {

        Enfrentable dosFantasticos = new Liga("Los Dos Fantásticos");
        Enfrentable mole = new Personaje("Mole", 4);
        Enfrentable hombreInvisible = new Personaje("El Hombre Invisible", 3);

        dosFantasticos.addEnfrentable(mole);
        dosFantasticos.addEnfrentable(hombreInvisible);

        Enfrentable ligaJusticia = new Liga("Liga de la Justicia");
        Enfrentable batman = new Personaje("Batman", 10);

        ligaJusticia.addEnfrentable(dosFantasticos);
        ligaJusticia.addEnfrentable(batman);

    }

}
