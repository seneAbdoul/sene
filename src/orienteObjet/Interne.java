package orienteObjet;

import java.time.LocalDate;

public class Interne extends Etudiant {
    private String numeroBatiment;
    private String numeroChambre;
    private Bourse typeBourse;
    private static int nbBoursiers = 0;

    public Interne(String matricule, String nomComplet, LocalDate dateNaissance, String telephone, String numeroBatiment, String numeroChambre, Bourse typeBourse) {
        super(matricule, nomComplet, dateNaissance, telephone);
        this.numeroBatiment = numeroBatiment;
        this.numeroChambre = numeroChambre;
        this.typeBourse = typeBourse;
        nbBoursiers++;
    }

    public Interne() {
        nbBoursiers++;

    }

    public static int getNbBoursiers() {
        return nbBoursiers;
    }

    public String getNumeroBatiment() {
        return numeroBatiment;
    }

    public void setNumeroBatiment(String numeroBatiment) {
        this.numeroBatiment = numeroBatiment;
    }

    public String getNumeroChambre() {
        return numeroChambre;
    }

    public void setNumeroChambre(String numeroChambre) {
        this.numeroChambre = numeroChambre;
    }

    public Bourse getTypeBourse() {
        return typeBourse;
    }

    public void setTypeBourse(Bourse typeBourse) {
        this.typeBourse = typeBourse;
    }

    @Override
    public String toString() {
        return "["+super.toString()+" / "+numeroBatiment+" / "+numeroChambre+" / "+typeBourse.name()+" / "+typeBourse.getMontant()+"]";
    }
}

