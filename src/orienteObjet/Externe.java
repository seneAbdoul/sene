package orienteObjet;

import java.time.LocalDate;

public class Externe extends Etudiant{
  private String adresse;
    public static final int aide = 100000;

    public Externe(String matricule, String nomComplet, LocalDate dateNaissance, String telephone, String adresse) {
        super(matricule, nomComplet, dateNaissance, telephone);
        this.adresse = adresse;
    }

    public Externe() {
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public static int getAide() {
        return aide;
    }

    @Override
    public String toString() {
        return "["+super.toString()+" / "+adresse+"]";
    }

}
