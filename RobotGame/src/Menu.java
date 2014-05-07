
public class Menu 
{
	private static final boolean DEFAUT_EST_OUVERT = false;
	
	private boolean estOuvert;
	
	public Menu()
	{
		this.estOuvert = DEFAUT_EST_OUVERT;
	}
	
	public void ouvrir()
	{
		this.estOuvert = true;
	}
	
	public void fermer()
	{
		this.estOuvert = false;
	}
	
	public boolean obtenirOuvertureStatus()
	{
		return this.estOuvert;
	}
}
