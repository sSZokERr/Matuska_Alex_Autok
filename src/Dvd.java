public class Dvd implements Kolcsonozheto, Comparable<Dvd>{
    private String cim;
    private int hossz;

    public String getCim() {
        return cim;
    }

    public int getHossz() {
        return hossz;
    }

    public Dvd(String cim, int hossz) {
        this.cim = cim;
        this.hossz = hossz;
    }

    @Override
    public String megjelenitheto() {
        return String.format("%s (%d perc", this.cim, this.hossz);
    }

    @Override
    public int meddigkolcsonozheto() {
        return 0;
    }

    @Override
    public int compareTo(Dvd masikDvd) {
        return this.hossz - masikDvd.hossz;
    }
}
