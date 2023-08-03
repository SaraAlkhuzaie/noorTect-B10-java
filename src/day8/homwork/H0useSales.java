package day8.homwork;

public class H0useSales {
	
	public static void main(String[] args) {

			int option = 1;
			String houseViewType = "";
			int price = 0;
			boolean isValidOption = true;
			String erroMessage = "NONE";

			switch (option) {
			case 1:
				houseViewType = "PARK VIEW";
				price = 150000;
				break;
			case 2:
				houseViewType = "GOLF COURSE VIEW";
				price = 250000;
				break;
			case 3:
				houseViewType = "LAKE VIEW";
				price = 350000;
				break;
			default:
				erroMessage = "INVALID OPTION NUMBER";
				isValidOption = false;
			}

			if (isValidOption == true) {
				System.out.println("Type: " + houseViewType);
				System.out.println("Cost: $" + price);
			} else {
				System.out.println("Error Message: " + erroMessage);
			}
		}
	}