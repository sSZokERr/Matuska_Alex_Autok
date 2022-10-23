import java.util.Random;

public class Tesla implements Auto{

    private double sebesseg;

    @Override
    public void gyorsul() {
        Random rnd = new Random();
        sebesseg += 5 + (rnd.nextDouble() * 15 - 5);
    }

    @Override
    public double getSebesseg() {
        Random rnd = new Random();
        sebesseg = rnd.nextDouble() * 60;
        return sebesseg;
    }
}
