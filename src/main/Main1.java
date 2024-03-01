package main;

import orienteObjet.Bourse;
import orienteObjet.Etudiant;
import orienteObjet.Externe;
import orienteObjet.Interne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Etudiant> listeEtudiants = new ArrayList<>();
        List<Etudiant> listeEtudiantInternes = new ArrayList<>();
        List<Etudiant> listeEtudiantExternes = new ArrayList<>();
        Externe externe2 = new Externe();
        Interne interne2 = new Interne();
        int SommeAide = 0;
        int SommeBourse = 0;
        for (int i = 0; i < 2; i++) {
            Random random = new Random();
            int nombreAleatoire = random.nextInt(2);
            if (nombreAleatoire == 0) {
                SommeAide = SommeAide + Externe.getAide() ;
                System.out.println();
                System.out.println("Voulez-vous saisir l'externe avec le contructor avec argument ou sans argument ? (oui/non)");
                   String choix = scanner.nextLine();

                if (choix.equalsIgnoreCase("oui")){
                    System.out.println("Entrez le matricule de l'externe : ");
                    String matricule = scanner.nextLine();

                    System.out.println("Entrez le nom complet de l'externe : ");
                    String nomComplet = scanner.nextLine();

                    System.out.println("Entrez la date de naissance de l'externe (format dd/MM/yyyy) : ");
                    String dateNaissanceStr = scanner.nextLine();
                    LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    System.out.println("Entrez le numéro de téléphone de l'externe : ");
                    String telephone = scanner.nextLine();

                    System.out.println("Entrez l'adresse de l'externe : ");
                    String adresse = scanner.nextLine();

                    Externe externe1 = new Externe(matricule, nomComplet, dateNaissance, telephone, adresse);
                    listeEtudiants.add(externe1);
                    listeEtudiantExternes.add(externe1);
                }else if (choix.equalsIgnoreCase("non")){
                    System.out.println("Entrez le matricule de l'externe en utilisant set : ");
                    String matricule = scanner.nextLine();
                    externe2.setMatricule(matricule);

                    System.out.println("Entrez le nom complet de l'externe en utilisant set : ");
                    String nomComplet = scanner.nextLine();
                           externe2.setNomComplet(nomComplet);
                    System.out.println("Entrez la date de naissance de l'externe (format dd/MM/yyyy) : en utilisant set ");
                    String dateNaissanceStr = scanner.nextLine();
                    LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                           externe2.setDateNaissance(dateNaissance);
                    System.out.println("Entrez le numéro de téléphone de l'externe : en utilisant set");
                    String telephone = scanner.nextLine();
                             externe2.setTelephone(telephone);
                    System.out.println("Entrez l'adresse de l'externe : en utilisant set");
                    String adresse = scanner.nextLine();
                                externe2.setAdresse(adresse);
                    listeEtudiants.add(externe2);
                    listeEtudiantExternes.add(externe2);
                     }

             } else {
                System.out.println();
                System.out.println("Voulez-vous saisir l'interne avec le contructor avec argument ou sans argument ? (oui/non)");
                  String choix = scanner.nextLine();
                if (choix.equalsIgnoreCase("oui")){
                    System.out.println("Entrez le matricule de l'interne : ");
                    String matricule = scanner.nextLine();

                    System.out.println();

                    System.out.println("Entrez le nom complet de l'interne : ");
                    String nomComplet = scanner.nextLine();

                    System.out.println("Entrez la date de naissance de l'interne (format dd/MM/yyyy) : ");
                    String dateNaissanceStr = scanner.nextLine();
                    LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                    System.out.println("Entrez le numéro de téléphone de l'interne : ");
                    String telephone = scanner.nextLine();


                    System.out.println("Entrez le numero du batiment : ");
                    String numeroBatiment = scanner.nextLine();

                    System.out.println("Entrez le numero de chambre : ");
                    String numeroChambre = scanner.nextLine();

                    System.out.println("Entrer le type de bourse? (entier/demi)");
                    String typeBourseStr = scanner.nextLine().toLowerCase();
                    Bourse typeBourse = null;
                    if (typeBourseStr.equals("entier")) {
                        typeBourse = Bourse.ENTIER;
                        SommeBourse = SommeBourse + typeBourse.getMontant();
                    } else if (typeBourseStr.equals("demi")) {
                        typeBourse = Bourse.DEMI;
                        SommeBourse = SommeBourse + typeBourse.getMontant();
                    } else {
                        System.out.println("Type de bourse invalide !");
                        // Gérer l'erreur ou quitter le programme selon le cas
                    }

                    Interne interne1 = new Interne(matricule, nomComplet, dateNaissance, telephone,numeroBatiment,numeroChambre,typeBourse);
                    listeEtudiants.add(interne1);
                    listeEtudiantInternes.add(interne1);
                } else if (choix.equalsIgnoreCase("non")){
                    System.out.println("Entrez le matricule de l'interne : ");
                    String matricule = scanner.nextLine();
                             interne2.setMatricule(matricule);
                    System.out.println();

                    System.out.println("Entrez le nom complet de l'interne : ");
                    String nomComplet = scanner.nextLine();
                              interne2.setNomComplet(nomComplet);
                    System.out.println("Entrez la date de naissance de l'interne (format dd/MM/yyyy) : ");
                    String dateNaissanceStr = scanner.nextLine();
                    LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                  interne2.setDateNaissance(dateNaissance);
                    System.out.println("Entrez le numéro de téléphone de l'interne : ");
                    String telephone = scanner.nextLine();
                                 interne2.setTelephone(telephone);

                    System.out.println("Entrez le numero du batiment : ");
                    String numeroBatiment = scanner.nextLine();
                                 interne2.setNumeroBatiment(numeroBatiment);
                    System.out.println("Entrez le numero de chambre : ");
                    String numeroChambre = scanner.nextLine();
                                  interne2.setNumeroChambre(numeroChambre);
                    System.out.println("Entrer le type de bourse? (entier/demi)");
                    String typeBourseStr = scanner.nextLine().toLowerCase();
                    Bourse typeBourse = null;
                    if (typeBourseStr.equals("entier")) {
                        typeBourse = Bourse.ENTIER;
                        interne2.setTypeBourse(typeBourse);
                        SommeBourse = SommeBourse + typeBourse.getMontant();
                    } else if (typeBourseStr.equals("demi")) {
                        typeBourse = Bourse.DEMI;
                        interne2.setTypeBourse(typeBourse);
                        SommeBourse = SommeBourse + typeBourse.getMontant();
                    } else {
                        System.out.println("Type de bourse invalide !");
                        // Gérer l'erreur ou quitter le programme selon le cas
                    }

                    listeEtudiants.add(interne2);
                    listeEtudiantInternes.add(interne2);
                }

            }

        }


        //Affichage de la liste des etudiants
        System.out.println("Affichage de la liste des etudiants");
        for (Etudiant etudiant : listeEtudiants){
            System.out.println(etudiant);
        }

        System.out.println("Affichage de la liste des etudiants externes");
        for (Etudiant etudiant : listeEtudiantExternes) {
            System.out.println(etudiant);
        }


        System.out.println("Affichage de la somme  des aides");
        System.out.println("la somme des aides est : " + SommeAide);

        System.out.println("Affichage de la liste des etudiants internes");
        for (Etudiant etudiant : listeEtudiantInternes) {
            System.out.println(etudiant);
        }

        System.out.println("Affichage de la somme  des bourses");
        System.out.println("la somme des aides est : " + SommeBourse);


        /*Etudiant etudiant1 = new Externe("1","sene",LocalDate.parse("29/09/2000",
                DateTimeFormatter.ofPattern("dd/MM/yyyy")),"778354663","ngoundiane","10000frcfa");
                  listeEtudiants.add(etudiant1);



        // Parcourir la liste des étudiants
           for (Etudiant etudiant : listeEtudiants) {
                System.out.println(etudiant);
            }

         */
       /*

        e1.setMatricule("0001");
        e1.setNomComplet("Breukh Sene");
        e1.setTelephone("770000000");
        e1.setDateNaissance(LocalDate.parse("29/09/2000", DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(e1);
        Exo
        NB: utiliser les contructeurs avec ou sans arguments
        créer une liste d'etudiant contenant des internes et des externes
        si la machine donne 0 on ajoute un interne
        si elle donne 1 on ajoute un externe
        Poser la question a l'utilisateur s'il veut creer cet objet avec un contructeur avec ou sans arguments
        Afficher tous les etudiants
        Afficher tous les externes
        Afficher la somme des bourses et la somme des aides

         */


    }
}
