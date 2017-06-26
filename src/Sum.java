/*
 * here we are making a program for taking input from the command line 
 * and convert it into integer
 * here we are creating the class Sum
 */
public class Sum {
//here we are creating the main Method
	public static void main(String[] args) {
		//here we are taking the integer value
        int sum = 0;
      //here loop will run till the number of times specified in command line
        for (int i = 0; i < args.length; i++) {
        	//here we are applying the parse int method for converting the argument into the String
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("The sum of the arguments passed is " + sum);
    }
}

		
		
	
