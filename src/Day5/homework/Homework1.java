package Day5.homework;

public class Homework1 {
	public static void main(String args[]) {

		char Group = 'A';
		String team1 = "";
		String team2 = "";
		String team3 = "";
		String team4 = "";
		String Message = "NONE";
		boolean isGroupExist = true;

		if (Group == 'A') {

			team1 = "NtherLand";
			team2 = "Senegal";
			team3 = "Ecuador";
			team4 = "Qatar";
		} else if (Group == 'B') {
			team1 = "Argentina";
			team2 = "Poland";
			team3 = "Mexico";
			team4 = "saudi Arabia";

		} else if (Group == 'C') {
			team1 = "NtherLand";
			team2 = "Senegal";
			team3 = "Ecuador";
			team4 = "Qatar";
		} else if (Group == 'D') {
			team1 = "France";
			team2 = "Australlia";
			team3 = "Tunisia";
			team4 = "Denmark";
		} else if (Group == 'E') {
			team1 = "Japan";
			team2 = "Spain";
			team3 = "Germany";
			team4 = "Costa Rica";
		
		} else if (Group == 'F') {
			team1 = "Morocco";
			team2 = "Croatia";
			team3 = "Belgium";
			team4 = "Canada";
		} else if (Group == 'G') {
			team1 = "Brazzil";
			team2 = "Swtzerland";
			team3 = "Cameroon";
			team4 = "Serbia";

		} else if (Group == 'H') {
			team1 = "Portugal";
			team2 = "South Korea";
			team3 = "Uruguay";
			team4 = "Ghana";

		} else {

			Message = "Wrong Group";
			isGroupExist = false;

		}
		if (isGroupExist == true) {

		System.out.println("**** group " + Group + "****");

		System.out.println(team1);

		System.out.println(team2);
		System.out.println(team3);
		System.out.println(team3);

	}else {
	
		System.out.println("group + Grou + is not part of world cu table.");
		System.out.println("Is group :" + Group +"Exists" +isGroupExist );

	}
		
	}
}
