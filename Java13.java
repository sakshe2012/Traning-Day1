//Q13. Write a Java program to check whether a number is even or odd. 
import java.util.*;
class Java13
{
public static void main(String args[])
{
  Scanner sc= new Scanner(System.in);
int a;
System.out.println("enter value : ");
a=sc.nextInt();
if (a%2==0)
{
System.out.println("the given number is even");

}
else
{
System.out.println("the given number is odd");

}
}
}