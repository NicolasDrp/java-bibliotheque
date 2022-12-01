package bibliotheque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Que voulez vous faire ?"+"\n \n"+"afficher la liste des livres :  tapez 1"+"\n"+"rechercher un livre :  tapez 2"+"\n"+"saisir un nouveau livre :  tapez 3"+"\n"+"en modifier un existant :  tapez 4"+"\n"+"annuler :  tapez 5");
			String saisiUtilisateur  = scan.nextLine();
			while (!saisiUtilisateur.equals("1") && !saisiUtilisateur.equals("2") && !saisiUtilisateur.equals("3") && !saisiUtilisateur.equals("4") && !saisiUtilisateur.equals("5") ) {
				System.out.println("saisi incorrect,"+"\n"+"Que voulez vous faire ?"+"\n \n"+"afficher la liste des livres :  tapez 1"+"\n"+"rechercher un livre :  tapez 2"+"\n"+"saisir un nouveau livre :  tapez 3"+"\n"+"en modifier un existant :  tapez 4"+"\n"+"annuler :  tapez 5");
				saisiUtilisateur  = scan.nextLine();
			}
			
			Bibliotheque bibliotheque = new Bibliotheque();
			
			if (saisiUtilisateur.equals("1")) {
				//afficher liste des livre
				bibliotheque.listeLivre();
			}
			else if (saisiUtilisateur.equals("2")) {
				//rechercher un livre
				System.out.println("Quel livre cherchez vous ?");
				String valeur = scan.nextLine();
				bibliotheque.recherche(valeur);
				
			}
			else if (saisiUtilisateur.equals("3")) {
				//si l'utilisateur veut creer un nouveau livre    saisi = 3
				System.out.println("Quel est le titre du livre");
				String titre = scan.nextLine();
				while (titre.length()<2) {
					System.out.println("Entrée invalide"+"\n"+"Quel est le titre du livre");
					titre = scan.nextLine();
				}
				System.out.println("Qui est l'auteur du livre");
				String nom = scan.nextLine();
				while (nom.length()<2) {
					System.out.println("Entrée invalide"+"\n"+"Qui est l'auteur du livre");
					nom = scan.nextLine();
				}
				System.out.println("Quel est le genre du livre");
				String genre = scan.nextLine();
				while (genre.length()<2) {
					System.out.println("Entrée invalide"+"\n"+"Qui est l'auteur du livre");
					genre = scan.nextLine();
				}
				System.out.println("Combien d'exemplaire de ce livre avons nous");
				//etre sur que ce soit un nombre qui soit entré
			    boolean bool = false;
			    int Nbrexemplaire = 1;
			    while(!bool)
			    {
			        try
			        {
			            Nbrexemplaire = scan.nextInt();
			            bool = true;
			        }
			        catch(InputMismatchException e)
			        {
			            System.out.println("Veuillez saisir un chiffre");
			            bool = false;
			            scan.nextLine();
			        }
			    }
				System.out.println("Combien de pages contient t-il ?");
				//etre sur que ce soit un nombre qui soit entré
			    boolean bool2 = false;
			    int Nbrpages = -1;
			    while(!bool2)
			    {
			        try
			        {
			            Nbrpages = scan.nextInt();
			            bool2 = true;
			        }
			        catch(InputMismatchException e)
			        {
			            System.out.println("Veuillez saisir un chiffre");
			            bool2 = false;
			           scan.nextLine();
			        }
			    }			
				//creation du livre
				Livre livre = new Livre(titre, nom, genre, Nbrpages, Nbrexemplaire);
				
				//ajout d'un livre
				bibliotheque.ajout(livre);
				
				//ajooute les livres dans le csv
				bibliotheque.ecrireFichier();
			}
			else if (saisiUtilisateur.equals("4")) {
				//modifier un livre existant
				System.out.println("Quel livre voulez vous modifier ?");
				
			}
			else {
				System.exit(0);
			}
			
			
			
			scan.close();
		}

}
