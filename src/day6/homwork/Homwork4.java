package day6.homwork;

public class Homwork4 {
public static void main(String[] args) {
	
	
	
	char setGender = 'm';
	String getGender = "";

	switch (setGender) {
	case 'F':
	case 'f':
		getGender = "FEMALE";
		break;
	case 'M':
	case 'm':
		getGender = "MALE";
		break;
	default:
		getGender = "OTHERS";
	}
	
	System.out.println(getGender);
}
}

