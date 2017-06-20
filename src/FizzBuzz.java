//Create this solution in it's own project with its own repository on GitHub.
//FizzBuzz is a classic interview question usually done at the whiteboard. 
//We're going to create a Java implementation.

//Write a program that prints the numbers from 1 to 100. 
//But for multiples of three print “Fizz” instead of the number and for the 
//multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.

//Bonus: For every third Fizz print Fizzy! and for every fourth 
//Buzz print Buzzy! and for every third FizzBuzz make up your own word or phrase.


public class FizzBuzz {
	public static void main(String[]args){
		for (int i = 1; i <= 100; i++){
			
			String word = "";
			
			if ((i%3) == 0 && (i%5) == 0){
				word = "FizzBuzz";
			}
			else if ((i % 5) == 0){
				word = "Buzz";
			}
			else if ((i % 3) == 0){
				word = "Fizz";
			}
			else{
				word = "" + i;
			}
			
			if ((i % 45) == 0){
				word = "Srikant";
			}
			else if ((i % 9) == 0){
				word = "Fizzy!";
			}
			else if ((i % 20) == 0){
				word = "Buzzy!";
			}
			
			System.out.println(word);
			
			
			
		}
	}
}
