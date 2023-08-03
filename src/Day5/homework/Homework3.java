package Day5.homework;

public class Homework3 {
	public static void main (String arg []){
		
		char mathOperation ='-';
		double	numOne = 20.0;
		double numTwo =5.0;
		double result=0;
		String message = "NONE";
		boolean isCorrectOperation= true;
		
		
	   switch (mathOperation) {
	   case  '+':	
		result =  numOne +numTwo ;
		
	break;
		case '-':   
		result =  numTwo  - numOne  ;
		break;

		
		case '*':  
		result =  numTwo  * numOne  ;
		break;

		case '/':    
			result=  numTwo  / numOne  ;
			
			break;

		case '%' :   
			result =  numTwo %  numOne  ;
			
			break;

		
		default:
			message = "WRONG INPUT DATA";
			isCorrectOperation = false;
		}
		
		 
			if (message == "WRONG INPUT DATA" && isCorrectOperation == false) {
				System.out.println(message);
				System.out.println(isCorrectOperation);

			} else if (message != "WRONG INPUT DATA" && isCorrectOperation == true) {
				System.out.println(numOne + " " + mathOperation + " " + numTwo + " = " + result);

			}
		 
		 }
	
			
			
			
			
			
			
			
		
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


