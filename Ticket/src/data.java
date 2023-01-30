public class data {
	static user u = new user();
	static ticket t = new ticket();
	private static String nam[] = new String[10];
	private static String cit[] = new String[10];
	private static long tic[] = new long[10];
	private static long mno[] = new long[10];
	private static String gen[] = new String[10];

	void setdata(int i) {
		nam[i] = user.name;
		cit[i] = ticket.ci;
		tic[i] = ticket.ticket_no;
		mno[i] = user.mob;
		gen[i] = user.gender;
	}
	void status(long a,int d ) {
		int c=40;
		for (int i = 0; i < nam.length; i++) 
			if(mno[i]==a) 
				 c=i;
		if(c!=40 && nam[c]!=null && tic[c]==d ) {
			
				System.out.println("Seat No. = "+c);
				System.out.println("Name = "+nam[c]);
				System.out.println("City = "+cit[c]);
				System.out.println("Gender = "+gen[c]);
				System.out.println("Ticket No. = "+tic[c]);
			}
		else
			System.out.println("No Data Found");
		}
	

	void getdata() {
		System.out.println(
				"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("Seat no     name                city        Mobile No.      Gender    Ticket No.               ");
		for (int j = 1; j <= nam.length; j++) {
			if (nam[j-1] == null)
	    System.out.println("  "+j+"           -                   -              -             -         -");
			else
				System.out.println("  " + j + "         " + nam[j-1] + "       " + cit[j-1] + "     " + mno[j-1] + "    " + gen[j-1]
						+ "   " + tic[j-1]);
		}
		System.out.println(
				"- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");
	}
	
}
