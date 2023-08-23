import java.util.*;
class Banking
{
int balance=10000;

void withdraw()
{
int amount1;
System.out.println("Enter Amount to Withdraw");
Scanner temp=new Scanner(System.in);
amount1=temp.nextInt();
if(amount1<=balance)
{
System.out.println("Withdraw successfull");
balance=balance-amount1;
System.out.println("balance= "+balance);
System.out.println("Collect your cash");
}
else
{
System.out.println("Insufficient Funds");
}
}



void Deposit()
{
int amount2;
System.out.println("Enter Amount to be Deposit");
Scanner temp=new Scanner(System.in);
amount2=temp.nextInt();
System.out.println("Deposit successfull");
balance= balance+amount2;
System.out.println("balance= "+balance);

}


void check_balance()
{
System.out.println("balance="+balance);
}


void showMenu()
{
int option=0;
System.out.println("Choose 1 for Withdraw");
System.out.println("Choose 2 for Deposit");
System.out.println("Choose 3 for Check balance");
System.out.println("Choose 4 for Exit");
}
void exit()
{
System.out.println("Thankyou for Using ATM");
System.exit(0);
}
}
