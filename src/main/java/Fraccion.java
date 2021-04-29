public class Fraccion {
    private int numerator;
    private int denominator;

    public Fraccion(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int suma() {
        int suma;
        suma = numerator + denominator;
        return suma;
    }
    public int resta() {
        int resta;
        resta = numerator - denominator;
        return resta;
    }
    public String inversa() {
        String numerador = String.valueOf(denominator);
        String denominador = String.valueOf(numerator);
        String inversa = numerador + "/" + denominador;
        return inversa;
    }
    public int multiplicacion() {
        int multiplicacion;
        multiplicacion = numerator * denominator;
        return multiplicacion;
    }
}