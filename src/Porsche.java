public class Porsche implements Auto{
    private double sebesseg = 10;

    public void setSebesseg(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public Porsche(double sebesseg) {
        this.sebesseg = sebesseg;
    }

    public void gyorsul(){
        sebesseg+= 10;
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }


}
