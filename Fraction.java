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
	
	public Fraction(String str){
		int i = str.indexOf("/");
			
		numerator = Integer.parseInt(str.substring(0,1));
		if(str.substring(i+1).equals("0")){
			System.out.println("Error: Denominator can't be zero");
		} else 
		denominatour = Integer.parseInt(str.substring(i,i+1));
		
	}
	
	//behaviour method (accessor, mutator, helper)
	public int getNum(){
		return numerator;
	}
	public int getDenom(){
		return denominatour;
	}
}
