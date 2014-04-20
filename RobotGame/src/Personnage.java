
public class Personnage 
{
	/* Constantes */
	private static final Position DEFAULT_POSITION = new Position();
	private static final Direction DEFAULT_DIRECTION = Direction.BAS;
	
	/* Attributs */
	private Position posPersonnage;
	private Direction dirPersonnage;
	
	/* Méthodes */
	/**
	 * Création d'un personnage avec une direction et une position par défaut
	 */
	public Personnage()
	{
		this.modifierPosPersonnage(DEFAULT_POSITION);
		this.modifierDirPersonnage(DEFAULT_DIRECTION);
	}

	/**
	 * @return Obtention de la direction du personnage
	 */
	public Direction obtenirDirPersonnage() 
	{
		return dirPersonnage;
	}

	/**
	 * @param dirPersonnage Modification de la direction du personnage
	 */
	public void modifierDirPersonnage(Direction dirPersonnage) 
	{
		this.dirPersonnage = dirPersonnage;
	}

	/**
	 * @return Obtention de la position actuelle du personnage
	 */
	public Position obtenirPosPersonnage() 
	{
		return posPersonnage;
	}

	/**
	 * @param posPersonnage Modification de la position actuelle du personnage
	 */
	public void modifierPosPersonnage(Position posPersonnage) 
	{
		this.posPersonnage = posPersonnage;
	}
}
