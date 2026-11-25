public class Fraction{
	
	//instance variable(attributes, field)
	int numerator, denominatour;
	
	
	//constructor
	public Fraction(){
		int num = (int)(Math.random()*9) + 1;
		int denom = (int)(Math.random()*9) + 1;
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
	
	public Fraction(int n, int d){
		setNum(n);
		setDenom(d);
	}						
	
	public Stirng toString(){ 
		return numerator + "/" + denominatour;
	}
	
	public void setNum(int n){
		numerator = n;
	}
	
	public void setDenom(int d){
		if(d != 0){
			denominatour = d;
		} else 
			denominatour = 0;
			System.out.println("Error: denominatour can not be 0");
	}	
	
	public static Fraction mult(Fraction a, Fraction b){
		int n = a.getNum() * b.getNum();
		int d = a.getDenom() * b.getDenom();
		
		return new Fraction(n,d);
	}
}

//  O
// /|\
// 	/\

// >,<  :O :P :| 
