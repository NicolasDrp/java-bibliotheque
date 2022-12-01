package bibliotheque;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bibliotheque {

	private ArrayList<Livre> liste = new ArrayList<Livre>();
	private Livre livre;
	private File file = new File("liste.csv");
	private ArrayList<String> listeStr = new ArrayList<String>();
	

	//TODO regler le probleme des majuscule en entrée
	 
	//ajouter un livre a la liste
	public void ajout (Livre livre) {
		liste.add(livre);
	}
	
	
	//creer ou modifier le fichier .csv
	public void ecrireFichier() {
        String DELIMITER = ";";

        try {
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter sortie = new BufferedWriter(fw);
            for (Livre listelivre : liste) {
                sortie.append(listelivre.getTitre());
                sortie.append(DELIMITER);
                sortie.append(listelivre.getAuteur());
                sortie.append(DELIMITER);
                sortie.append(listelivre.getGenre());
                sortie.append(DELIMITER);
                sortie.append(listelivre.getNbrPages() + DELIMITER);
                sortie.append(listelivre.getNbrExemplaire() + "\n");
            }
            System.out.println("livre ajouter");
            sortie.close();
        } catch (IOException e) {
        	System.out.println("livre pas ajouter , réessayez");
            e.printStackTrace();
        }

    }
	
	//lire le fichier
	public void lire() {
		try {
			FileReader lecture = new FileReader(file);
			BufferedReader br = new BufferedReader(lecture);
			
			String ligne;
			while((ligne = br.readLine()) !=null) {
				listeStr.add(ligne);
			}	
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("fichier pas trouvé");
		}catch (IOException e) {
			System.out.println("impossible de lire le contenu");
		}
	}
	
	
	//rechercher dans le fichier
	public void recherche(String valeur) {
		lire();
		ArrayList<String> cherche = new ArrayList<>();
        for (String i : listeStr) {
            if (i.contains(valeur)) {
                cherche.add(i);      
            }
            else {
				System.out.println("Nous n'avons pas ce livre");
				System.exit(0);
			}
       }
        //convertir la liste en chaine de caractere
        String str = "";
		for (String chercheStr : cherche) {
			str+= chercheStr+",";
		}
		//split puis afficher les valeurs
		str.split(";");
		String[] info = str.split(";");
		System.out.println("le titre du livre est "+info[0]+" ,il est écrit par "+info[1]+" ,c'est un livre du genre : "+info[2]+" ,il a "+info[3]+" pages .Le nombre d'exemplaire disponnible est de  "+info[4]);
	}
	
	
	//pas se connecter au fichier 
	//csv >liste /liste>csv

	
	//methode pour ajouter un livre 
	public void creer(Livre livre) {
		liste.add(livre);
	}
	
	//prendre un livre dans la liste
	public Livre sortir() {
		return livre;
	}
	
	
	//afficher la liste des livres
	public void listeLivre() {
		String line;
		try (BufferedReader buffread = new BufferedReader(new FileReader(file))) {
			buffread.readLine();
			while ((line = buffread.readLine()) != null) {
				String[] split = line.split(";");
				StringBuilder infoLivre = new StringBuilder();
				infoLivre.append("Le titre du livre est : ");
				infoLivre.append(split[0] + "\n");
				infoLivre.append("L'auteur est : ");
				infoLivre.append(split[1] + "\n");
				infoLivre.append("C'est un livre de : ");
				infoLivre.append(split[2] + "\n");
				infoLivre.append("Il y a  : ");
				infoLivre.append(split[3] + " pages \n");
				infoLivre.append("Nous l'avons en : ");
				infoLivre.append(split[4] + " exemplaire \n \n \n");
				System.out.println(infoLivre);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//modifier un livre
	public void modifier() {
		
		
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//getter et setter
	public ArrayList<Livre> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Livre> liste) {
		this.liste = liste;
	}

	
	
	
	
	
}
