import java.util.*;
import java.util.concurrent.TimeUnit;

public class ticket {
	static city c = new city();
	static payment p = new payment();
	static user u = new user();
	static seat s = new seat();
	static data d = new data();
	static system s1 = new system();
	static Scanner a = new Scanner(System.in);
	protected static int a2;
	protected static String ci;
	protected static long ticket_no;
	protected static int i = 1000;

	protected static int v(int a4) {
		int a5;
		System.out.println("Enter the seat no.");
		a2 = a.nextInt();
		int a3 = seat.booked(a2 - 1);
		if (a3 == 1) {
			a5 = p.extracted(a4);
			if (a5 == 0) {
				System.out.println("Payment is Failed\n Thanks for using!");
				seat.remove(a2 - 1);
				System.exit(0);
			}
			return 1;
		} else {
			System.out.println("Sorry! The Seat is booked \n Try Another");
			v(a4);}
		return 0;
	}

	static void re() {
		// Thread.sleep(7000); // ----1
		try { // ----2
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		system.main(null);
	}
	public static void main(String[] args) {

		System.out.println("The Train service is available to Akola,Amarvati,Nagpur");
		System.out.println("Select the city which u want");
		ci = a.next();
		int price = c.v(ci);
		seat.print();
		System.out.println(seat.p1 + "The price of " + ci + " ticket is " + seat.re + seat.g2 + price + seat.re);
		System.out.println("Do u want to book ticket\n Y: Yes \n N: No");
		char a1 = a.next().charAt(0);
		int a6 = 0, a7 = 0;
		if (a1 == 'Y' || a1 == 'y')
			a6 = v(price);
		else
			System.exit(0);

		if (a6 == 1)
			a7 = u.setdata();
		else
			System.exit(0);

		if (a7 == 1) {
			i++;
			ticket_no = (long) Math.random() + i;
			System.out.println("Ticket NO. = " + ticket_no);
		}
		d.setdata(a2 - 1);
		System.out.println("- - - - - - - - - - - - - - - - - - - - -");
		System.out.println("                                         ");
		System.out.println("            Thanks for using!            ");
		System.out.println("                                         ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - -\n\n\n");
		re();
	}

}
