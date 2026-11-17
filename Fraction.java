public class Fraction{
	
	//instance variable(attributes, field)
	int numerator, denominatour;
	
	
	//constructor
	public Fraction (){ //defult
		numerator = 1;
		denominatour = 1;
	}
	
	public Fraction (int n, int d){ //perimeterized constructor
		numerator = n;
		if (  d != 0){
			denominatour = d;
		} else
			denominatour = 1;
			System.out.println("Error: Denominator can't be zero");
	}
	
	//behaviour method
}
