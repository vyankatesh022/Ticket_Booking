import java.util.*;

public class city {
	static int price;
	Scanner a = new Scanner(System.in);
	int v(String city) {
		
		switch (city) {
		case "Akola || akola":
			price = 500;
			break;
		case "Amarvati ||amarvati":
			price = 700;
			break;
		case "Nagpur || nagpur":
			price = 1000;
			break;
		default:
			System.out.println("Invalid! Enter");
			System.exit(0);
		}
		return price;
	}
}