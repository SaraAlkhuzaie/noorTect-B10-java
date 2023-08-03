package day23.homework;

public class exercise14 {
	public static void main(String[] args) {
		
		String r1=  getSubStr("java training", 2 ,6);
		String r2=getSubStr("Software Development Engineer in TEST", 11, 23);
		String r3=getSubStr("Software Development Engineer in TEST", 21, 29);

		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
	}
	public static String getSubStr(String str, int startingIndex, int endingIndex) {

		String result = "";
		result = str.substring(startingIndex, endingIndex);

		return result;

	}

}
