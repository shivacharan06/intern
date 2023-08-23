import java.util.*;
public class OnlineVoting {
	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		Scanner s=new Scanner(System.in);
		String name=s.next();
		System.out.println("Enter Your Mobile number");
		Scanner n=new Scanner(System.in);
		long numb=n.nextLong();
		vote v;
		v=new vote();
		v.party();
		System.out.println("Enter Your Vote");
		Scanner c=new Scanner(System.in);
		int op=c.nextInt();
		switch(op) {
		case 1:
			v.partyA();
			break;
		case 2:
			v.PartyB();
			break;
		case 3:
			v.partyC();
			break;
		}
	}
}
