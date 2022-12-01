package bibliotheque;

public class Livre {

	private String Titre;
	private String Auteur;
	private String Genre;
	private int NbrPages;
	private int NbrExemplaire;
	
	
	//constructeur
	public Livre(final String Titre,final String Auteur,final String Genre,final int NbrPages,final int NbrExemplaire) {
		this.Titre = Titre;
		this.Auteur = Auteur;
		this.Genre = Genre;
		this.NbrPages = NbrPages;
		this.NbrExemplaire = NbrExemplaire;
		
	}
	
	//getter et setter
	public String getTitre() {
		return Titre;
	}

	public void setTitre(String titre) {
		Titre = titre;
	}

	public String getAuteur() {
		return Auteur;
	}

	public void setAuteur(String auteur) {
		Auteur = auteur;
	}

	public String getGenre() {
		return Genre;
	}

	public void setGenre(String genre) {
		Genre = genre;
	}

	public int getNbrPages() {
		return NbrPages;
	}

	public void setNbrPages(int nbrPages) {
		NbrPages = nbrPages;
	}

	public int getNbrExemplaire() {
		return NbrExemplaire;
	}

	public void setNbrExemplaire(int nbrExemplaire) {
		NbrExemplaire = nbrExemplaire;
	}
	
	
}
