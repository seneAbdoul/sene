package orienteObjet;

import java.time.LocalDate;
import java.time.Period;

public abstract class Etudiant {

    protected String matricule;
    private String nomComplet;
    private LocalDate dateNaissance;
    private String telephone;
    private int age;

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
        calculAge();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getAge() {
        return age;
    }

    public void calculAge(){
        age = Period.between(dateNaissance , LocalDate.now()).getYears();
    }


    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public Etudiant(String matricule, String nomComplet, LocalDate dateNaissance, String telephone) {
        this.matricule = matricule;
        this.nomComplet = nomComplet;
        this.dateNaissance = dateNaissance;
        this.telephone = telephone;
        calculAge();
    }

    public Etudiant(){

    }

    public String toString(){
        return "[" +matricule + " / " + nomComplet + " / " + dateNaissance + " / " + telephone + " / " + age + "]";
    }
}


