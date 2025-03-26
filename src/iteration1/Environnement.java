package iteration1;

import java.util.ArrayList;

public class Environnement {

    private int width;
    private int height;
    private ArrayList<Acteur> acteurs;

    public Environnement(int width,int height){
        this.width = width;
        this.height = height;
        this.acteurs = new ArrayList<>();
    }

    public void ajouter(Acteur acteur){
        this.acteurs.add(acteur);
    }

    public void unTour(){
        for (int i = acteurs.size()-1; i >= 0; i--) {
            acteurs.get(i).agit();
            if (!acteurs.get(i).estVivant()){
                acteurs.remove(acteurs.get(i));
            }
        }
    }

    public String toString(){
        return this.acteurs.toString();
    }

}
