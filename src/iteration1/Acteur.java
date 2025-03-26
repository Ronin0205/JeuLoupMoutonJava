package iteration1;

public abstract class Acteur {

    private static int compteur = 0;
    private String id;
    private int pv;

    public Acteur (int pv){
        this.id = "" + compteur;
        this.pv = pv;
        compteur++;
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

    public abstract void agit();

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
