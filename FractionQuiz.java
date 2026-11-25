import java.util.Scanner;
import java.util.Random;
public class FractionQuiz{
	public static void main(String[   ] args){
		
		Scanner in = new Scanner(System.in);
		Random rdm = new Random();
		
		String[] symbol = {"+","-","*","/"};
		
		int correct = 0;
		int answered = 0;
		
		System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");

		while(true){
			
			Fraction f1 = new Fraction;
			Fraction f2 = new Fraction;
						
			Fraction answer; 
			
			if(symbol[].equals("+"){
				answer = f1.add(f2);
				symbol = [0];
			}
			
			if(symbol[].equals("-"){
				answer = f1.subtract(f2);
				symbol = [1];
			}
			
			if(symbol[].equals("*"){
				answer = f1.multiply(f2)
				symbol = [2];
			}
			
			if(symbol[].equals("/"){
				answer = f1.divide(f2);
				symbol = [3];
			}
			
			System.out.println(f1 + " " + symbol + " " + f2 + "= ");
			String input = in.nextLine; 
			
			if(answer.substring().equals(input){
				System.out.println("Correct!");
				correct ++;
			}
		}
		
		
		
		
		System.out.println("You answered " + answered + "correctly, for a score of " + percent + " percent");	
	}  
	
}
