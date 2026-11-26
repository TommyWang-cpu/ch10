public class FractionDriver {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        System.out.println("f1 = " + f1); 

        f1.reduce();
        System.out.println("f1 reduced = " + f1); 
        System.out.println("f1 as double = " + f1.toDouble()); 

        Fraction f2 = new Fraction("100/3");
        System.out.println("f2 from String = " + f2);

        Fraction copy = new Fraction(f1);
        System.out.println("copy of f1 = " + copy);

        Fraction f3 = new Fraction(1, 3);
        System.out.println("getNum/getDenom: " + f3.getNum() + " / " + f3.getDenom());

        f3.setNum(5);
        f3.setDenom(6);
        System.out.println("after setters: " + f3);

        System.out.println("add: " + Fraction.add(new Fraction(1, 2), new Fraction(1, 3)));
        System.out.println("subtract: " + Fraction.subtract(new Fraction(1, 2), new Fraction(1, 3)));
        System.out.println("multiply: " + Fraction.multiply(new Fraction(1, 2), new Fraction(1, 3)));
        System.out.println("divide: " + Fraction.divide(new Fraction(1, 2), new Fraction(1, 3)));

        Fraction bad = new Fraction(1, 0);
        System.out.println("bad = " + bad);
    }
}
