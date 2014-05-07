
public class Joueur extends Personnage
{
	private static final String DEFAUT_NOM = "Inconnu";
	
	private String nom;
	
	public Joueur()
	{
		this.modifierNom(DEFAUT_NOM);
	}
	
	/**
	 * @param nom Le nom du joueur
	 */
	public Joueur(String nom)
	{
		this.modifierNom(nom);
	}

	/**
	 * Obtention du nom du joueur
	 * @return Le nom du joueur
	 */
	public String obtenirNom() {
		return nom;
	}

	/**
	 * Modifier le nom du joueur
	 * @param nom Le nom du joueur
	 */
	public void modifierNom(String nom) {
		this.nom = nom;
	}
}
