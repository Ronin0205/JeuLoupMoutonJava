package iteration1;

public class Loup extends Acteur{

    public Loup(){
        super(80);
    }

    public void agit(){
        this.decrementerPv(1);
        if (!this.estVivant()){
            this.meurt();
        }
    }

    public String toString(){
        return "Loup " + super.getId() + " Pv : " + super.getPv();
    }
}
