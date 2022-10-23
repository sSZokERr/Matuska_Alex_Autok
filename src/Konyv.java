public class Konyv implements Kolcsonozheto{


    private String cim, szerzo, isbn;

    public String getCim() {
        return cim;
    }

    public String getSzerzo() {
        return szerzo;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String megjelenitheto() {
        return String.format("%s - %s", this.szerzo, this.cim);
    }

    public Konyv(String cim, String szerzo, String isbn) {
        this.cim = cim;
        this.szerzo = szerzo;
        this.isbn = isbn;
    }

    @Override
    public int meddigkolcsonozheto() {
        return 0;
    }
}
