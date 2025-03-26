package iteration1;

public class Mouton extends Acteur{

    public Mouton(){
        super(40);
    }

    public void agit(){
        this.decrementerPv(1);
        if (!this.estVivant()){
            this.meurt();
        }
    }

    public String toString(){
        return "Mouton " + super.getId() + " Pv : " + super.getPv();
    }
}
