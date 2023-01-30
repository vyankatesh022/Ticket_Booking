import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class payment extends bank{

	Scanner a = new Scanner(System.in);

	int extracted(int b) {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter the Atm Card No.");
		int a1 = a.nextInt();
		System.out.println("Enter the Password ");
		int b1 = a.nextInt();
		int c=show(a1, b1, b);
		return c;
	}
}
