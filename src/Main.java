public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(1, 4);
        Fraction f2 = new Fraction(3, 5);
        System.out.println("First fraction is = "+f.toString());

        System.out.println("The second fraction is = "+f2.toString());
        f.add(f2);
        f.sub(f2);
        f.multiplication(f2);
        f.division(f2);

    }


}