
public class Application {

	public static void main(String[] args) 
	{
		System.out.println("Création de l'instance de jeu");
		IHMJoueur jeu = new IHMJoueur();
		System.out.println("Lancement de la partie");
		jeu.lancer();
		System.out.println("Fin de la partie");
	}

}
