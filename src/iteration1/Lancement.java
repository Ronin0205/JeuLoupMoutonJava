package iteration1;

public class Lancement {

    public static void main(String[] args) {
        Acteur a1 = new Loup();
        Acteur a2 = new Mouton();
        Acteur a3 = new Loup();

        Environnement e = new Environnement(40,40);
        e.ajouter(a1);
        e.ajouter(a2);
        e.ajouter(a3);

        System.out.println(e.toString());

        for (int i = 0; i < 40; i++) {
            e.unTour();
        }

        System.out.println(e.toString());
    }
}
