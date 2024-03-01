package orienteObjet;

public enum Bourse {
    DEMI(30000),
    ENTIER(60000);
    private int montant;
    private Bourse(int number) {
        this.montant = number;
    }

    public int getMontant() {
        return montant;
    }
}

