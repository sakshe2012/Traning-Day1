//Q17. Write a Java program to check whether a number is divisible by 5 and 11 or not.
import java.util.*;
class Java17
{


public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a;
System.out.println("enter number: ");
a=sc.nextInt();
if (a%5==0 && a%11==0)
{
System.out.println(a+ " is divisible by both 5 and 11");
}
else
{
System.out.println(a+ " is not  divisible by both 5 and 11");

}

}
}
