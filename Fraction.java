public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
        numerator = (int)(Math.random() * 9) + 1;
        denominator = (int)(Math.random() * 9) + 1;
    }

    public Fraction(int n, int d) {
        numerator = n;
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.out.println("Error: Denominator can't be zero");
        }
        fixSign();
    }

    public Fraction(String str) {
        str = str.trim();
        int i = str.indexOf("/");
        if (i == -1) {

            numerator = Integer.parseInt(str);
            denominator = 1;
        } else {
            numerator = Integer.parseInt(str.substring(0, i).trim());
            String denomStr = str.substring(i + 1).trim();
            if (denomStr.equals("0")) {
                System.out.println("Error: Denominator can't be zero");
                denominator = 1;
            } else {
                denominator = Integer.parseInt(denomStr);
            }
        }
        fixSign();
    }

    public Fraction(Fraction f) {
        numerator = f.numerator;
        denominator = f.denominator;
    }

    // Accessors
    public int getNum() {
        return numerator;
    }

    public int getDenom() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public double toDouble() {
        return (double) numerator / denominator;
    }

    public boolean equals(Fraction f) {
        return numerator == f.numerator && denominator == f.denominator;
    }

    public void setNum(int n) {
        numerator = n;
    }

    public void setDenom(int d) {
        if (d != 0) {
            denominator = d;
            fixSign();
        } else {
            System.out.println("Error: Denominator can not be 0");
        }
    }

    public void reduce() {
        if (numerator == 0) {
            denominator = 1;
            return;
        }
        int g = gcf(numerator, denominator);
        numerator /= g;
        denominator /= g;
    }

    private int gcf(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private void fixSign() {
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    public static Fraction add(Fraction a, Fraction b) {
        Fraction result = new Fraction(
            a.numerator * b.denominator + b.numerator * a.denominator,
            a.denominator * b.denominator
        );
        result.reduce();
        return result;
    }

    public static Fraction subtract(Fraction a, Fraction b) {
        Fraction result = new Fraction(
            a.numerator * b.denominator - b.numerator * a.denominator,
            a.denominator * b.denominator
        );
        result.reduce();
        return result;
    }

    public static Fraction multiply(Fraction a, Fraction b) {
        Fraction result = new Fraction(
            a.numerator * b.numerator,
            a.denominator * b.denominator
        );
        result.reduce();
        return result;
    }

    public static Fraction divide(Fraction a, Fraction b) {
        if (b.numerator == 0) {
            System.out.println("Error: Cannot divide by zero");
            return new Fraction(0, 1);
        }
        Fraction result = new Fraction(
            a.numerator * b.denominator,
            a.denominator * b.numerator
        );
        result.reduce();
        return result;
    }

    public Fraction add(Fraction other) {
        return Fraction.add(this, other);
    }

    public Fraction subtract(Fraction other) {
        return Fraction.subtract(this, other);
    }

    public Fraction multiply(Fraction other) {
        return Fraction.multiply(this, other);
    }

    public Fraction divide(Fraction other) {
        return Fraction.divide(this, other);
    }
}

//  O
// /|\
// 	/\

// >,<  :O :P :| 
