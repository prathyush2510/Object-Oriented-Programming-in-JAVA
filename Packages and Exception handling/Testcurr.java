import mypack.CurrConvertor;
import java.util.Scanner;

class Testcurr{	
	public static void main(String args[]){
		String m;
		int n;
		float c;
		char ch;
		CurrConvertor cur =new CurrConvertor();
		do {
			System.out.println("\n\tMENU\n1.Dollar to INR\n2.INR to Dollar\n3.Euro to INR\n4.INR to Euro\n5.Yen to INR\n6.INR to Yen\n7.Exit");	
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter your choice: ");
			n=scan.nextInt();
			if(n==1) {
				try {
					System.out.print("\nEnter the dollar: ");
					m=scan.next();
					c=cur.dol_INR(m);
					System.out.println("Dollar to INR is ");
					System.out.printf("%.2f",c);
				}catch(NumberFormatException e) {
					System.out.println(e);
				}
			}
			else if(n==2) {
				try {
					System.out.print("\nEnter the rupees: ");
					m=scan.next();
					c=cur.INR_dol(m);
					System.out.println("INR to dollar is ");
					System.out.printf("%.2f",c);
				}catch(NumberFormatException e) {
					System.out.println(e);
				}
			}	
			else if(n==5) {
				try {
					System.out.print("\nEnter the yen: ");
					m=scan.next();
					c=cur.yen_INR(m);
					System.out.println("yen to INR is ");
					System.out.printf("%.2f",c);
				}catch(NumberFormatException e) {
					System.out.println(e);
				}
			}
			else if(n==6) {
				try {
					System.out.print("\nEnter the rupees: ");
					m=scan.next();
					c=cur.INR_yen(m);
					System.out.println("INR to yen is ");
					System.out.printf("%.2f",c);
				}catch(NumberFormatException e) {
					System.out.println(e);
				}
			}
			else if(n==3) {
				try {
					System.out.print("\nEnter the euro: ");
					m=scan.next();
					c=cur.euro_INR(m);
					System.out.println("Euro to INR is ");
					System.out.printf("%.2f",c);
				}catch(NumberFormatException e) {
					System.out.println(e);
				}
			}
			else if(n==4) {
				try {
					System.out.print("\nEnter the rupees: ");
					m=scan.next();
					c=cur.INR_euro(m);
					System.out.println("INR to euro is ");
					System.out.printf("%.2f",c);
				}catch(NumberFormatException e) {
					System.out.println(e);
				}
			}
		}while(n!=7);
	}
}
