package day6.homwork;

public class Homwork1Swich {
	public static void main(String[] args) {
		
	

	char Group = 'A';
	String team1 = "";
	String team2 = "";
	String team3 = "";
	String team4 = "";
String Message = "NONE";
boolean isGroupExist = false;



switch (Group) {
	

case 'A':

	team1 = "NtherLand";
	team2 = "Senegal";
	team3 = "Ecuador";
	team4 = "Qatar";
	break;
case  'B':
	team1 = "Argentina";
	team2 = "Poland";
	team3 = "Mexico";
	team4 = "saudi Arabia";
	break;
case 'C': 
	team1 = "NtherLand";
	team2 = "Senegal";
	team3 = "Ecuador";
	team4 = "Qatar";
	break;
	case 'D':
	team1 = "France";
	team2 = "Australlia";
	team3 = "Tunisia";
	team4 = "Denmark";
	break;
	case 'E':
	team1 = "Japan";
	team2 = "Spain";
	team3 = "Germany";
	team4 = "Costa Rica";
	
	break;
	case'F':
	team1 = "Morocco";
	team2 = "Croatia";
	team3 = "Belgium";
	team4 = "Canada";
	break;
	case  'G':
	team1 = "Brazzil";
	team2 = "Swtzerland";
	team3 = "Cameroon";
	team4 = "Serbia";
	break;

 case 'H':
	team1 = "Portugal";
	team2 = "South Korea";
	team3 = "Uruguay";
	team4 = "Ghana";
	break;
	default:

	Message = "Wrong Group";
	isGroupExist = false;

}
    
switch (Message){
	
	case "Wrong Group":
	
	


		System.out.println("**** group " + Group + "****");

		System.out.println(team1);

		System.out.println(team2);
		System.out.println(team3);
		
		System.out.println(team4);
		
		
		

	
	

		System.out.println("group + Grou + is not part of world cu table.");
		System.out.println("Is group :" + Group + "Exists" + isGroupExist);
}
	
	}

}
