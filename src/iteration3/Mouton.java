package iteration3;

public class Mouton extends Acteur {

    public Mouton(Environnement env){
        super(env,40);
    }

    public Mouton(int x, int y, Environnement env){
        super(x,y,env,40);
    }

    public void agit(Environnement env){
        this.decrementerPv(1);
        if (!this.estVivant()){
            this.meurt();
        }
    }

    public String toString(){
        return "Mouton " + super.getId() + " Pv : " + super.getPv();
    }
}
