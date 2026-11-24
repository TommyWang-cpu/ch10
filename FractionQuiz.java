import java.util.Scanner;
import java.util.Random;
public class FractionQuiz{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
	}
	
	public Fraction (){ //defult
		numerator = 1;
		denominatour = 1;
	}
	
	public Fraction (int n, int d){ //perimeterized constructor
		numerator = n;
		if ( d != 0){
			denominatour = d;
		} else
			denominatour = 1;
			System.out.println("Error: Denominator can't be zero");
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
	
	public static Fraction divi(Fraction a, Fraction b){
		int n = a.getNum() / b.getNum();
		int d = a.getDenom() / b.getDenom();
		
		return new Fraction(n,d);
	}
	
	public Fraction(double x){
		
		double result = x;
		
		if (result ==  ){
			System.out.println("Correct!");
		}
		
		if (result ==  ){
			System.out.println("Correct!");
		}
		if (result ==  ){
			System.out.println("Correct!");
		}
		
		if (result ==  ){
			System.out.println("Correct!");
		}
		
		System.out.println("Incorrect , the answer is " + );
		
 	}
}
