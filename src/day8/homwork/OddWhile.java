package day8.homwork;

public class OddWhile {
	public static void main(String[] args) {
		
				int oddTotal = 0;
				int evenTotal = 0;

				int i = 1;

				while (i <= 10) {
					
					if (i % 2 == 0) {
						evenTotal = evenTotal + i;
					} else {
						oddTotal = oddTotal + i;
					}
					i++;
				}
				System.out.println("Sum of ODD Numbers:  " + oddTotal);
				System.out.println("Sum of EVEN Numbers: " + evenTotal);
			}

		}
		/**
				% --> mod/modulo	
				% --> to get the remainder 
		 
		*/