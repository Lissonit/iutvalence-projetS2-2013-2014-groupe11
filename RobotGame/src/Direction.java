/* Enumération directions */
public enum Direction 
{
	HAUT(0, -1),
	BAS(0, 1),
	GAUCHE(-1, 0),
	DROITE(1, 0);
	
	/*  Attributs  */
	private int X;
	private int Y;
	
	/**
	 * Nouvelle direction
	 * @param x coordonnée x de la direction
	 * @param y coordonnée y de la direction
	 */
	Direction(int x, int y)
	{
		this.X = x;
		this.Y = y;
	}
	 
	/**
	 * Obtention de la coordonnée X de la dirction
	 * @return La coordonnée X (Horizontale)
	 */
	public int obtenirX() {
		return X;
	}

	/**
	 * Obtention de la coordonnée Y de la dirction
	 * @return La coordonnée Y (Verticale)
	 */
	public int obtenirY() {
		return Y;
	}
};
