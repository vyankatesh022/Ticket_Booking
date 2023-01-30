public class seat {// 2022
	public static final String r1 = "\033[1;31m";
	public static final String g1 = "\033[1;32m";
	public static final String re = "\u001B[0m";
	public static final String b = "\u001B[46m";
	public static final String p1 = "\u001B[35m";
	public static final String g2 = "\033[1;33m";
	static int a[] = new int[10];

	
	static void print() {
		for (int i = 0; i < a.length; i++)
			v(i);
	}

	static void v(int c) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				int a0 = c + 1;
				if (i == 3 && j == 5) {
					if (a[c] == 0)
						System.out.print(g1 + a0 + re);
					else
						System.out.print(r1 + a0 + re);
				} else if (i == 1 || j == 1 || i == 5 || j == 9) {
					System.out.print(b+ "*" + re);
				} else {
					if (i == 3 && j == 6 && a0 >= 10)
						continue;
					else
						System.out.print(" ");
				}
			}
			System.out.println();
		}
		if (a[c] == 0)
			System.out.println(g1 + "Available" + re);
		else
			System.out.println(r1 + "Booked" + re);
		System.out.println();
	}

	static void remove(int i) {
		a[i] = 0;
	}

	static int booked(int a1) {
		if (a1 >= 0 && a1 <= a.length)
			if (a[a1] == 0) {
				a[a1] = 1;
				return 1;
			}
		return 0;

	}

}
