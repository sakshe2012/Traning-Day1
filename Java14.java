//Q14. Write a Java program to check whether a triangle is valid or not.
import java.util.*;

class Java14
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a;
System.out.println("enter first angle: ");
a=sc.nextInt();
int b;
System.out.println("enter second angle: ");
b=sc.nextInt();
int c;
System.out.println("enter third angle: ");
c=sc.nextInt();
if (a+b+c==180)
{
System.out.println("triangle is valid");
}

else
{
System.out.println("triangle is not valid");

}
}

}