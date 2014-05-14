
public class Environnement 
{
	private static final int DEFAUT_CARTE_LARGEUR = 20;
	private static final int DEFAUT_CARTE_HAUTEUR = 20;
	
	private int largeurCarte;
	private int hauteurCarte;
	
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
		if(position.obtenirX() < 0 || position.obtenirX() > this.largeurCarte ||
		   position.obtenirY() < 0 || position.obtenirY() > this.hauteurCarte)
			throw new OutOfRangeException("La position est en dehors de la carte");
		
		int indicePositionCarte = this.carte[position.obtenirX()][position.obtenirY()];
		
		for(int indiceCourantObstacle : this.obstacles)
			if(indiceCourantObstacle == indicePositionCarte)
				return true;
		
		return false;
	}
}
