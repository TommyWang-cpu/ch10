public class FractionDriver{
	
	public static void main(String[] arg){
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(1,2);
		Fraction f3 = new Fraction.mult(f1,f2);
		System.out.println(f3);
		
	}
}
