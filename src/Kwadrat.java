public class Kwadrat implements Figura {
    private final double bok;
    private final String kolor;
    private final int Katy;

    public Kwadrat(double bok, String kolor, int katy) {
        this.bok = bok;
        this.kolor = kolor;
        Katy = katy;
    }

    @Override
    public double obliczPole() {
        return bok * bok;
    }

    @Override
    public double obliczObwod() {
        return bok * 4;
    }

    public double getBok() {
        return bok;
    }

    public String getKolor() {
        return kolor;
    }

    public int getKaty() {
        return Katy;
    }
}
