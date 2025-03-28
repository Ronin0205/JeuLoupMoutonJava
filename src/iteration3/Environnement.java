package iteration3;

import java.util.ArrayList;

public class Environnement {

    private int width;
    private int height;
    private int nbTours;
    private ArrayList<Acteur> acteurs;


    public Environnement(int width,int height){
        this.width = width;
        this.height = height;
        this.acteurs = new ArrayList<>();
        this.nbTours = 0;
    }

    public int getNbTours(){
        return this.nbTours;
    }

    public int getWidth(){
        return this.width;
    }

    public int getHeight(){
        return this.height;
    }

    public ArrayList<Acteur> getActeurs(){
        return this.acteurs;
    }

    public void ajouter(Acteur acteur){
        this.acteurs.add(acteur);
    }

    public boolean dansTerrain(int x, int y){
        if ((x >= 0 && x <= width) && (y >= 0 && y <= height)){
            return true;
        }
        else {
            return false;
        }
    }

    public void unTour(){
        for (int i = acteurs.size()-1; i >= 0; i--) {
            acteurs.get(i).agit();
            if (!acteurs.get(i).estVivant()){
                acteurs.remove(acteurs.get(i));
            }
        }
        this.nbTours ++;
    }


    public String toString(){
        return this.acteurs.toString();
    }

}
