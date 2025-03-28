package iteration3;

public class Loup extends Acteur {

    public Loup(int x, int y, Environnement env){
        super(x,y,10,env,80);
    }

    public Loup(Environnement env){
        super(10,env,80);
    }

    public void agit(){
        this.decrementerPv(1);

        Acteur mouton = essaieCapturerMouton();
        if (mouton != null){
            mouton.meurt();
        }
        else {
            decrementerPv(2);
        }
        if (!this.estVivant()){
            this.meurt();
        }
        seDeplace();
    }

    public Acteur essaieCapturerMouton(){
        for (int i = 0; i < super.getEnv().getActeurs().size(); i++) {
            if (((super.getEnv().getActeurs().get(i).getX() - getX() <= 5 || super.getEnv().getActeurs().get(i).getX() - getX() >= 5) && (super.getEnv().getActeurs().get(i).getY() - getY() <= 5 || super.getEnv().getActeurs().get(i).getY() - getY() >= 5)) && super.getEnv().getActeurs().get(i) instanceof Mouton){
                return super.getEnv().getActeurs().get(i);
            }
        }
        return null;
    }

    public String toString(){
        return "Loup " + super.getId() + " Pv : " + super.getPv();
    }
}
