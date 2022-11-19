public class Fraction {
    private int numerator, denominator;

    Fraction(){

    }

     Fraction(int numerator, int denominator) {


        this.numerator = numerator;
        this.denominator = denominator;


    }

    public int getNumerator() {
        return numerator;

    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public String toString() {
        return   numerator + "/" + denominator;
    }

    public void add(Fraction f2) {
        int p = this.denominator * f2.denominator;
        int sum = (this.denominator * f2.numerator + this.numerator * f2.denominator) ;
        System.out.println("The addition is ="+sum+"/"+p);

    }

    public void sub(Fraction f2) {
        int p = this.denominator * f2.denominator;
        int sum = ( this.numerator * f2.denominator - this.denominator * f2.numerator );
        System.out.println("The subtraction is "+sum + "/" + p);

    }
    public void multiplication(Fraction f2) {
        int p = this.denominator * f2.denominator;
        int q = (this.numerator * f2.numerator);
        System.out.println("The multiplication is " + q + "/" +p);
    }
    public void division(Fraction f2) {
        int p = this.denominator * f2.numerator;
        int q = (this.numerator * f2.denominator);
        System.out.println("The divison is " + q + "/" + p);
    }
}
