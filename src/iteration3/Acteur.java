package iteration3;

import java.util.Random;

public abstract class Acteur {

    private int x;
    private int y;
    private int v;
    private int dx;
    private int dy;
    private static int compteur = 0;
    private String id;
    private int pv;
    private Environnement env;

    public Acteur (int v, Environnement e, int pv){
        Random rand = new Random();
        this.id = "" + compteur;
        this.pv = pv;
        int x = rand.nextInt() * e.getWidth();
        int y = rand.nextInt() * e.getHeight();
        this.x = x;
        this.y = y;
        this.v = v;
        this.env = e;

        int ran = rand.nextInt(3);
        if (ran == 0){
            this.dx = 1;
        } else if (ran == 1) {
            this.dx = -1;
        }else{
            this.dx = 0;
        }
        ran = rand.nextInt(3);
        if (ran == 0){
            this.dy = 1;
        } else if (ran == 1) {
            this.dy = -1;
        }else{
            this.dy = 0;
        }

        compteur++;
    }

    public Acteur (int x, int y,int v, Environnement e, int pv){
        this.x = x;
        this.y = y;
        this.id = "" + compteur;
        this.pv = pv;
        this.v = v;
        this.env = e;
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

    public void seDeplace() {
        if (this.dx == 1 && this.dy == 0) {
            if (this.env.dansTerrain(this.x + this.v, this.y)) {
                this.x += this.v;
                System.out.println("Vers la droite : " + this.x);
            }
        }
        if (this.dx == 1 && this.dy == 1) {
            if (this.env.dansTerrain(this.x + this.v, this.y + this.v)) {
                this.x += this.v;
                this.y += this.v;
                System.out.println("Vers la droite en bas: " + this.x + " : " + this.y);
            }
        }
        if (this.dx == 1 && this.dy == -1) {
            if (this.env.dansTerrain(this.x + this.v, this.y - this.v)) {
                this.x += this.v;
                this.y -= this.v;
                System.out.println("Vers la droite en haut: " + this.x + " : " + this.y);
            }
        }
        if (this.dx == 0 && this.dy == 1) {
            if (this.env.dansTerrain(this.x, this.y + this.v)) {
                this.y += this.v;
                System.out.println("Vers le bas: " + this.y);
            }
        }
        if (this.dx == 0 && this.dy == -1) {
            if (this.env.dansTerrain(this.x, this.y - this.v)) {
                this.y -= this.v;
                System.out.println("Vers le haut: " + this.y);
            }
        }
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

    public Environnement getEnv(){
        return this.env;
    }
}
