package bibliotheque;

public class Livre {

	private String Titre;
	private String Auteur;
	private String Genre;
	private int NbrPages;
	private int NbrExemplaire;
	
	public Livre(String Titre,String Auteur,String Genre,int NbrPages,int NbrExemplaire) {
		this.Titre = Titre;
		this.Auteur = Auteur;
		this.Genre = Genre;
		this.NbrPages = NbrPages;
		this.NbrExemplaire = NbrExemplaire;
		
	}
	
	
	//information du livre
	public String info() {
		return "le titre du livre est "+this.Titre+" ,il est écrit par "+this.Auteur+" ,c'est un livre de "+this.Genre+" ,il a "+this.NbrPages+" pages et est disponnible en "+this.NbrExemplaire+" exemplaire";
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
