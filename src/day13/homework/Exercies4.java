package day13.homework;

public class Exercies4 {

	public static void main(String[] args) {
		
		int r1 = getSML(4, 2, 8, "SMALLEST");
		int r2 = getSML(44, 3, 8, "MEDIUM");
		int r3 = getSML(44, 332, 8, "LARGEST");
		int r4 = getSML(44, 332, 8,"JAVA");

		System.out.println(r1);//2
		System.out.println(r2);//3
		System.out.println(r3);//8
		System.out.println(r4);//22
		


	}

	public static int getSML(int n1, int n2, int n3, String str) {
		int result = 0;

		switch (str) {
		case "SMALLEST":
			if (n1<n2&&n1<n3) {
				
				result =n1;

			} else if (n2 < n1 && n2 < n3) {
				result =n2;
		}else {
					
				result =n3;
			}
			break;
		case"LARGEST":
			if(n1>n2 &&n1>n3) {
				
				result =n1;
			}else if (n2 >n1&&n2>n3) {
				
				
				result =n2;
			}else {
				result=n3;
			}
			break;
		case"MEDIUM":
			
if(n1>n2 &&n1<n3) {
				
				result =n1;
			}else if (n2 >n1&&n2<n3) {
				
				
				result =n2;
			}else {
				result=n3;
			}
			break;
			default:
				result=404;
		}
		}
}
		
			
		
			