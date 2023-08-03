package Day5.homework;

public class Homework2 {
	public static void main (String arg []){
		

	

		

				String brand = "Facebook";

				String slogan = "";
				boolean isSloganFound = true;

				if (brand == "Nike") {
					slogan = "Just Do It";
				} else if (brand == "Adidas") {
					slogan = "Impossible is Nothing";
				} else if (brand == "Puma") {
					slogan = "Forever Faster";
				} else if (brand == "Reebok") {
					slogan = "I am what I am";
				} else {
					slogan = "Not Found";
					isSloganFound = false;
				}

				if (isSloganFound == true) {
					System.out.println(brand + "'s slogan is " + slogan);
				} else {
					System.out.println(brand + "'s slogan "+ slogan);
				}
			
		

}

}
