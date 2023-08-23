import java.util.*;
class Atm
{
public static void main(String arg[])
{
System.out.println("Welcome to ATM services");
Banking c1=new Banking();

for(int i=1;i<=3;i++)
{
System.out.println("Enter your PIN");
Scanner temp=new Scanner(System.in);
int pin=temp.nextInt();
if(pin==1234)
{
for(int n=1;n<=10;n++)
{
c1.showMenu();
System.out.println("eneter the operation:");
Scanner scanner=new Scanner(System.in);
int option=scanner.nextInt();
switch(option)
{
case 1:
c1.withdraw();
break;
case 2:
c1.Deposit();
break;
case 3:
c1.check_balance();
break;
case 4:
c1.exit();
break;
}
System.out.println("\n");
}
}
else
{
System.out.println("Incorrect pin");
}
}
System.out.println("Maximum attempts done!!");
}
}