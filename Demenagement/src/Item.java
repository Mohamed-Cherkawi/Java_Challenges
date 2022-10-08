public class Item {
    private String nom;
    private String type;

    public Item(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return " Item Name : " + getNom() + " || Type : " + getType();
    }
}
