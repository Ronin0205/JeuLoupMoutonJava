package iteration3;


import iteration3.Environnement;
import iteration3.Loup;
import iteration3.Mouton;
import iteration3.VueConsole;

public class Lancement2 {

	public static void main(String [] args){
		iteration3.Environnement e = new Environnement(50, 50);
		e.ajouter(new iteration3.Mouton(2,1,e));
		e.ajouter(new Mouton(6,2,e));
		e.ajouter(new iteration3.Loup(4,2,e));
		e.ajouter(new Loup(2,8,e));
		iteration3.VueConsole vue= new VueConsole(e);
		for (int i = 0; i < 10; i++) {
			System.out.println();
			vue.afficher(vue.tableauEnv());
			e.unTour();
			System.out.println();
			vue.afficher(vue.tableauEnv());
		}
	}
}
