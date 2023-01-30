import java.util.Scanner;

public class bank {
	Scanner a = new Scanner(System.in);
	private static int a1[] = { 546444, 446424, 1547842, 554468, 576844, 248884 };
	private static int a2[] = { 8768, 5468, 5746, 5749, 2424, 2422 };
	private static int b1[] = { 54685, 46844, 54684, 46854, 48644, 54658 };
	private static int d;

	int data(int a3, int b3) {

		for (int c = 0; c < a1.length; c++) {
			if (a1[c] == a3 && a2[c] == b3) {
				d = c;
				return 1;
			}
		}
		return 0;
	}

	public void show() {

		System.out.println("1.Balance Show\n" + "2.Cash Withdraw");
		int e = a.nextInt();
		if (e == 1)
			System.out.println("The current Balance is " + b1[d]);
		else if (e == 2) {
			System.out.println("Enter the amount");
			int e1 = a.nextInt();
			 bal(e1);
		}

	}
	public int show(int a,int b,int c) {
		int d=data(a,b);
		 int c1=0;
		if (d==1)
			c1=bal(c);
		else 
			exit();
		return c1;
	}

	public int bal(int e2) {
		if (b1[d] >= e2) {
			b1[d] -= e2;
			System.out.println("Sucessfully!\nThe current Balance is " + b1[d]);
			return 1;
		}
		return 0;
	}

	void exit() {
		System.out.println("Invalid Enter!");
		System.exit(0);
	}
}
