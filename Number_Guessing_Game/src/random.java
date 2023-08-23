import java.lang.Math;
import java.util.*;
class random
{
public static void main(String arg[])
{
int x;
System.out.println("Welcome To Guess A Number game");
System.out.println("You have maximum 5 attemp limit");
for(int e=5;e>0;e--)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Guess the number between 1 to 100");
x=sc.nextInt();
int min=1;
int max=100;
int rand =(int)(Math.random()*(max-min+1)+min);
if(x<rand)
{
System.out.println("Your Guess number is Smaller"); 
System.out.println("random number="+rand);
}
else if(x>rand)
{
System.out.println("Your Guess number is Greater");
System.out.println("random number="+rand);
}
else if(x==rand)
{
System.out.println("OOhhOO!Your Number is Correct.You Win the Game!");  
System.out.println("random number="+rand);
break;
}
}
System.out.println("Game Over,beterluck next time!!");
}
}
