package bibliotheque;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Bibliotheque {

	private ArrayList<Livre> liste = new ArrayList<Livre>();
	private Livre livre;
	public File file = new File("liste.csv");

	
	 public Bibliotheque() {
		 liste.add(new Livre("jean", "con", "fiction", 34, 44));
	}
	
	
	
	
	
	public void ecrireFichier() {
        String DELIMITER = ",";

        try {
            FileWriter fstream = new FileWriter(file, true);
            BufferedWriter out = new BufferedWriter(fstream);
            for (Livre livreS : liste) {
                out.append(livreS.getTitre());
                out.append(DELIMITER);
                out.append(livreS.getAuteur());
                out.append(DELIMITER);
                out.append(livreS.getGenre());
                out.append(DELIMITER);
                out.append(livreS.getNbrPages() + ",");
                out.append(livreS.getNbrExemplaire() + "\n");
            }
            out.close();
            System.out.println("écrit");
        } catch (IOException e) {
        	System.out.println("pas écrit");
            e.printStackTrace();
        }

    }

	
	
	
	//methode pour ajouter un livre 
	public void creer(Livre livre) {
		liste.add(livre);
	}
	
	//prendre un livre dans la liste
	public Livre sortir() {
		return livre;
	}
	
	
	
	
	//getter et setter
	public ArrayList<Livre> getListe() {
		return liste;
	}

	public void setListe(ArrayList<Livre> liste) {
		this.liste = liste;
	}

	
	
	
	
	
}
