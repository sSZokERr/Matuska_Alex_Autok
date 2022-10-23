public class Ujsag implements Kolcsonozheto{
    public String getCim() {
        return cim;
    }

    public int getKiadasEv() {
        return kiadasEv;
    }

    public int getKiadasHet() {
        return kiadasHet;
    }

    private String cim;
    private int kiadasEv, kiadasHet;

    public Ujsag(String cim, int kiadasEv, int kiadasHet) {
        this.cim = cim;
        this.kiadasEv = kiadasEv;
        this.kiadasHet = kiadasHet;
    }

    @Override
    public String megjelenitheto() {
        return String.format("%s %d/%d",this.cim, this.kiadasEv, this.kiadasHet);
    }

    @Override
    public int meddigkolcsonozheto() {
        return 0;
    }
}
