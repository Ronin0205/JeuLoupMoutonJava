package iteration2;

public class Loup extends Acteur {

    public Loup(Environnement env){
        super(env,80);
    }

    public Loup(int x, int y, Environnement env){
        super(x,y,env,80);
    }

    public void agit(Environnement env){
        this.decrementerPv(1);

        Acteur mouton = essaieCapturerMouton(env);
        if (mouton != null){
            mouton.meurt();
        }
        else {
            decrementerPv(2);
        }
        if (!this.estVivant()){
            this.meurt();
        }
    }

    public Acteur essaieCapturerMouton(Environnement env){
        for (int i = 0; i < env.getActeurs().size(); i++) {
            if (((env.getActeurs().get(i).getX() - getX() <= 5 || env.getActeurs().get(i).getX() - getX() >= 5) && (env.getActeurs().get(i).getY() - getY() <= 5 || env.getActeurs().get(i).getY() - getY() >= 5)) && env.getActeurs().get(i) instanceof Mouton){
                return env.getActeurs().get(i);
            }
        }
        return null;
    }

    public String toString(){
        return "Loup " + super.getId() + " Pv : " + super.getPv();
    }
}
