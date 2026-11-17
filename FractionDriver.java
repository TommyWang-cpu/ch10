public class FractionDriver{
	
	public static void main(String[] arg){
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(1,2);
		Fraction f3 = new Fraction("1/2");
		Fraction F4 = new Fraction(f3);
		f2.denominatour = 0;
		System.out.println(f1.numerator + "/" + f1.denominatour);
		System.out.println(f2.numerator + "/" + f2.denominatour);
	}
}
