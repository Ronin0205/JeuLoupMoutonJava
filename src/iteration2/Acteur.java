package iteration2;

import java.util.Random;

public abstract class Acteur {

    private int x;
    private int y;
    private static int compteur = 0;
    private String id;
    private int pv;

    public Acteur (Environnement e, int pv){
        Random rand = new Random();
        this.id = "" + compteur;
        this.pv = pv;
        int x = rand.nextInt() * e.getWidth();
        int y = rand.nextInt() * e.getHeight();
        this.x = x;
        this.y = y;
        compteur++;
    }

    public Acteur (int x, int y, Environnement e, int pv){
        this.x = x;
        this.y = y;
        this.id = "" + compteur;
        this.pv = pv;
        compteur ++;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void decrementerPv(int n){
        this.pv -= n;
        if (this.pv <= 0){
            this.meurt();
        }
    }

    public void incrementerPv(int n){
        this.pv += n;
    }

    public boolean estVivant(){
        return this.pv > 0;
    }

    public void meurt(){
        this.pv = 0;
    }

    public abstract void agit(Environnement env);

    public String toString(){
        return "Acteur " + this.id + " Pv : " + this.pv;
    }

    public String getId(){
        return this.id;
    }

    public int getPv(){
        return this.pv;
    }
}
