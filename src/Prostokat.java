public class Prostokat implements Figura {
    private final double bok1;
    private final double bok2;
    private final String kolor;
    private final int katy;

    public Prostokat(double bok1, double bok2, String kolor, int katy) {
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.kolor = kolor;
        this.katy = katy;
    }

    @Override
    public double obliczPole() {
        return bok1 * bok2;
    }

    @Override
    public double obliczObwod() {
        return (2 * bok1) + (2 * bok2);
    }

    public double getBok1() {
        return bok1;
    }

    public double getBok2() {
        return bok2;
    }

    public String getKolor() {
        return kolor;
    }

    public int getKaty() {
        return katy;
    }
}
