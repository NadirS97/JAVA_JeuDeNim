
import java.util.Scanner;

public class Jeu {
    static Scanner in = new Scanner (System.in);

    public static void main (String  [] args){
        int nbrA=20 + (int)(Math.random() * ((30 - 20) + 1));
        int typePartie;
        int niveauDifficulte;
        String Joueur, premierJoueur, deuxiemeJoueur;
        System.out.println("<*******************{Bienvenue au jeu de NIM}******************>");
        do {
            System.out.println("]<====================={ MENU DE JEU }======================>[");
            System.out.println();
            System.out.println("1]-Pour jouer a 2 joueurs tapez sur -----------------------[1]");
            System.out.println("2]-Pour jouer contre une IA tapez sur ---------------------[2]");
            System.out.println();
            System.out.print("Votre choix: ");
            typePartie = in.nextInt();
        } while (typePartie != 2 && typePartie != 1);
        //le cas ou le joueur joue contre une IA
        if(typePartie==2) {
            do {
                System.out.println("Vous avez choisis de jouer contre une IA.");
                System.out.println();
                System.out.println("]<===================={ MENU DE L'IA }=====================>[");
                System.out.println("           Veuillez selectionner une difficulte:");
                System.out.println();
                System.out.println("0]-IA: niveau Debutant tapez sur -------------------------[0]");
                System.out.println("1]-IA: niveau Intermediaire tapez sur --------------------[1]");
                System.out.println("2]-IA: niveau Expert tapez sur ---------------------------[2]");
                System.out.println();

                System.out.print("Votre choix: ");
                niveauDifficulte=in.nextInt();
            } while(niveauDifficulte!=0 && niveauDifficulte!=1 && niveauDifficulte!=2);

            //le joueur joue contre une IA debutant
            if(niveauDifficulte==0) {
                System.out.println("Vous avez choisis de jouer contre une IA de niveau Debutant.");
                System.out.println("]<===================={ Humain vs IA }=====================>[");
                System.out.println();

                JeuAll j=new JeuAll(nbrA);
                int n =j.niveauDebutant(new Debutant(),nbrA);
                System.out.print("Veuillez entrer votre nom: ");
                Joueur=in.next();
                Homme j1= new Homme(Joueur,nbrA);
                boolean joueur=true;
                int nouveauCoup=0;
                do {
                    if(joueur){
                        System.out.println("C'est a "+j1.getName()+" de jouer");
                    }else{
                        System.out.println("C'est a l'IA de jouer");
                    }
                    System.out.println("Il reste :"+ nbrA +" allumettes");

                    if(joueur) {
                        System.out.println("Vous pouvez tirer 1 / 2 / 3 allumettes");
                        System.out.println("Quel est votre choix ?");
                        System.out.print("Votre choix: ");
                        nouveauCoup=in.nextInt();
                    }else {
                        System.out.println("L'IA a choisis de retirer " +n+" allumettes");
                        nouveauCoup=n;
                    }
                    if(nouveauCoup>3 || nouveauCoup<0 || nouveauCoup>=nbrA){
                        System.out.println("Coup impossible, veuillez rentrer une valeur valide");
                    }else{
                        nbrA=nbrA-nouveauCoup;
                        j1.setNbAll(nbrA);
                        joueur=!joueur;
                        System.out.println("]<===================={ Partie en cours }=====================>[");
                        System.out.println();

                    }
                }while(nbrA>1);
                System.out.println("FIN du jeu. Bravo !");
                if(nbrA==1) {
                    if(joueur){
                        System.out.println("l'IA a gagner.");
                    }else{
                        System.out.println(j1.getName()+" a gagner.");
                    }
                }

            }

            //Le joueur joue contre une IA Intermediaire
            if(niveauDifficulte==1) {
                System.out.println("Vous avez choisis de jouer contre une IA de niveau Intermediaire.");
                System.out.println("]<===================={ Humain vs IA }=====================>[");
                System.out.println();
                JeuAll j=new JeuAll(nbrA);
                int n =j.niveauIntermediaire(new Intermediaire(),nbrA);
                System.out.print("Veuillez entrer votre nom: ");
                Joueur=in.next();
                Homme j1= new Homme(Joueur,nbrA);
                boolean joueur=true;
                int nouveauCoup=0;
                do {
                    if(joueur){
                        System.out.println("C'est a "+j1.getName()+" de jouer");
                    }else{
                        System.out.println("C'est a l'IA de jouer");
                    }
                    System.out.println("Il reste :"+ nbrA +" allumettes");


                    if(joueur) {
                        System.out.println("Vous pouvez tirer 1 / 2 / 3 allumettes");
                        System.out.println("Quel est votre choix ?");
                        System.out.print("Votre choix: ");
                        nouveauCoup=in.nextInt();
                    }else {
                        System.out.println("L'IA a choisis de retirer " +n+" allumettes");
                        nouveauCoup=n;
                    }
                    if(nouveauCoup>3 || nouveauCoup<0 || nouveauCoup>=nbrA){
                        System.out.println("Coup impossible, veuillez rentrer une valeur valide");
                    }else{
                        nbrA=nbrA-nouveauCoup;
                        j1.setNbAll(nbrA);
                        joueur=!joueur;
                        System.out.println("]<===================={ Partie en cours }=====================>[");

                    }
                }while(nbrA>1);
                System.out.println("FIN du jeu. Bravo !");
                if(nbrA==1) {
                    if(joueur){
                        System.out.println("l'IA a gagner.");
                    }else{
                        System.out.println(j1.getName()+" a gagner.");
                    }
                }
            }

            //Le joueur joue contre une IA Expert
            if(niveauDifficulte==2) {
                System.out.println("Vous avez choisis de jouer contre une IA de niveau Expert.");
                System.out.println("]<===================={ Humain vs IA }=====================>[");
                System.out.println();
                JeuAll j=new JeuAll(nbrA);
                int n =j.niveauExpert(new Expert(),nbrA);
                System.out.print("Veuillez entrer votre nom: ");
                Joueur=in.next();
                Homme j1= new Homme(Joueur,nbrA);
                boolean joueur=true;
                int nouveauCoup=0;
                do {
                    if(joueur){
                        System.out.println("C'est a "+j1.getName()+" de jouer");
                    }else{
                        System.out.println("C'est a l'IA de jouer");
                    }
                    System.out.println("Il reste :"+ nbrA +" allumettes");

                    if(joueur) {
                        System.out.println("Vous pouvez tirer 1 / 2 / 3 allumettes");
                        System.out.println("Quel est votre choix ?");
                        System.out.print("Votre choix: ");
                        nouveauCoup=in.nextInt();
                    }else {
                        System.out.println("L'IA a choisis de retirer " +n+" allumettes");
                        nouveauCoup=n;
                    }
                    if(nouveauCoup>3 || nouveauCoup<0 || nouveauCoup>=nbrA){
                        System.out.println("Coup impossible, veuillez rentrer une valeur valide");
                    }else{
                        nbrA=nbrA-nouveauCoup;
                        j1.setNbAll(nbrA);
                        joueur=!joueur;
                        System.out.println("]<===================={ Partie en cours }=====================>[");
                    }
                }while(nbrA>1);
                System.out.println("]<===================={ FIN du jeu. Bravo ! }=====================>[");

                if(nbrA==1) {
                    if(joueur){
                        System.out.println("L'IA a gagner.");
                    }else{
                        System.out.println(j1.getName()+" a gagner.");
                    }
                }
            }
        }

        //Le cas ou le joueur joue contre un autre joueur
        if (typePartie==1) {
            System.out.println("Vous avez choisis de jouer contre un joueur");
            System.out.println();
            System.out.println("]<===================={ MENU DE JvsJ }=====================>[");
            System.out.print("Veuillez entrer le nom du joueur 1: ");
            premierJoueur=in.next();
            System.out.print("Veuillez entrer le nom du joueur 2: ");
            deuxiemeJoueur=in.next();
            Homme j1= new Homme(premierJoueur,nbrA);
            Homme j2= new Homme(deuxiemeJoueur,nbrA);
            boolean joueur=true;
            int nouveauCoup=0;
            do {
                if(joueur){
                    System.out.println("C'est a "+j1.getName()+" de jouer");
                }else{
                    System.out.println("C'est a "+j2.getName()+" de jouer");
                }
                System.out.println("Il reste :"+ nbrA +" allumettes");
                System.out.println("Vous pouvez tirer 1 / 2 / 3 allumettes");
                System.out.println("Quel est votre choix ?");
                System.out.print("Votre choix: ");
                nouveauCoup=in.nextInt();
                if(nouveauCoup>3 || nouveauCoup<0 || nouveauCoup>=nbrA){
                    System.out.println("Coup impossible, veuillez rentrer une valeur valide");
                }else{
                    nbrA=nbrA-nouveauCoup;
                    j1.setNbAll(nbrA);
                    j2.setNbAll(nbrA);
                    joueur=!joueur;
                    System.out.println("]<===================={ Partie en cours }=====================>[");

                }
            }while(nbrA>1);
            System.out.println("]<===================={ FIN du jeu. Bravo ! }=====================>[");
            if(nbrA==1) {
                if(joueur){
                    System.out.println("Bravo "+j2.getName()+" a gagner.");
                }else{
                    System.out.println("Bravo "+j1.getName()+" a gagner.");
                }
            }

        }

    }
}
