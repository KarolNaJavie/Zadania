public enum Kraj {
    POLSKA(0.23), NIEMCY(0.19), HOLANDIA(0.12);
    private double tax;

    Kraj(double tax) {
        this.tax = tax;
    }

    public static double netto(String kraj, double brutto) {
        Kraj k = Kraj.valueOf(kraj.toUpperCase());
        return (brutto - (brutto * k.tax));
    }

}

