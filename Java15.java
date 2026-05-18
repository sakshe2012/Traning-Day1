//Q15. Write a Java program to check whether a triangle is equilateral , isoscale or scalene. 
import java.util.*;

class Java15
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
if (a==b && b==c && c==a)
{
System.out.println("triangle is equlilateral");
}

else if(a==b || b==c || c==a)
{
System.out.println("triangle is isoscale");

}
else
{
System.out.println("triangle is scalen");
}
}

}