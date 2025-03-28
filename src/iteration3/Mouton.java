package iteration3;

public class Mouton extends Acteur {

    private int tourNaissance;

    public Mouton(Environnement env){
        super(5,env,40);
        this.tourNaissance = this.getEnv().getNbTours();
    }

    public Mouton(int x, int y, Environnement env){
        super(x,y,5,env,40);
        this.tourNaissance = this.getEnv().getNbTours();
    }

    public void agit(){
        this.decrementerPv(1);
        if (!this.estVivant()){
            this.meurt();
        }

        if (this.getEnv().getNbTours() % 2 == 0){
            seDeplace();
        }

    }

    public String toString(){
        return "Mouton " + super.getId() + " Pv : " + super.getPv();
    }
}
