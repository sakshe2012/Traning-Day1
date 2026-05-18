//Q16. Write a Java program to check whether a number is positive , negative or zero.
import java.util.*;
class Java16
{
public static void main(String args[])
{

Scanner sc= new Scanner(System.in);
int a;
System.out.println("enter value : ");
a=sc.nextInt();
if(a>0)
{
System.out.println(a+ " is positive");
}
else if(a<0)
{
System.out.println(a+ " is negative");
}
else
{
System.out.println(a+ " is zero");
}
}
}