import Exceptions.OutOfRangeException;


public class Environnement 
{
	/* Constantes */
	private static final int DEFAUT_CARTE_LARGEUR = 20;
	private static final int DEFAUT_CARTE_HAUTEUR = 20;
	
	/* Attributs carte de jeu */
	private int largeurCarte;
	private int hauteurCarte;
	
	/* Tableaux de données */
	private int[][] carte;
	private int[] obstacles;
	
	public Environnement()
	{
		this.largeurCarte = DEFAUT_CARTE_LARGEUR;
		this.hauteurCarte = DEFAUT_CARTE_HAUTEUR;
		
		this.carte = new int[largeurCarte][hauteurCarte];
		this.obstacles = new int[] { 0 };
	}
	
	/**
	 * Savoir si la position dans la carte est un obstacle
	 * @param position La position dans la carte
	 * @return Vrai si la position est considérée comme obstacle
	 * @throws OutOfRangeException En dehors de la carte de jeu
	 */
	public boolean estObstacle(Position position) throws OutOfRangeException
	{
		if(position.X() < 0 || position.X() > this.largeurCarte ||
		   position.Y() < 0 || position.Y() > this.hauteurCarte)
			throw new OutOfRangeException("La position est en dehors de la carte");
		
		int indicePositionCarte = this.carte[position.X()][position.Y()];
		
		for(int indiceCourantObstacle : this.obstacles)
			if(indiceCourantObstacle == indicePositionCarte)
				return true;
		
		return false;
	}
}
