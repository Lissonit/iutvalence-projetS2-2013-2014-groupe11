
public class Position 
{
	/* Constantes */
	private static final int DEFAULT_COORDINATE_X = 0;
	private static final int DEFAULT_COORDINATE_Y = 0;
	
	/* Attributs */
	private int coordinate_X;
	private int coordinate_Y;
	
	/* Méthodes */
	/**
	 * Création d'une nouvelle position en 2 dimensions avec les coordonnées par défaut
	 */
	public Position()
	{
		this.coordinate_X = DEFAULT_COORDINATE_X;
		this.coordinate_Y = DEFAULT_COORDINATE_Y;
	}
	
	/**
	 * Création d'une nouvelle position en 2 dimensions avec les coordonées données
	 * @param X La coordonnée X
	 * @param Y La coordonnée Y
	 */
	public Position(int X, int Y)
	{
		this.coordinate_X = X;
		this.coordinate_Y = Y;
	}

	/**
	 * @return La coordonnée X
	 */
	public int obtenirX() {
		return coordinate_X;
	}

	/**
	 * @param X La coordonées X à modifier
	 */
	public void modifierX(int X) {
		this.coordinate_X = X;
	}

	/**
	 * @return La coordonnée Y
	 */
	public int obtenirY() {
		return coordinate_Y;
	}

	/**
	 * @param Y La coordonées Y à modifier
	 */
	public void modifierY(int Y) {
		this.coordinate_Y = Y;
	}

	/**
	 * Retourne la chaîne de caractères representant la position
	 */
	public String toString() {
		return "{ X = " + coordinate_X + ", Y = " + coordinate_Y + "}";
	}
}
