//Q2. Write a java program to input all basic data types and print its output.
import java.util.*;
class Java2
{
 public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
int i;
float f;
char c;
double d;
long l;
Boolean b;
System.out.println("enter integer value");
i = sc.nextInt();
System.out.println("value of i:" +i);
System.out.println("enter float value");
f = sc.nextFloat();
System.out.println("value of f:" +f);
System.out.println("enter char value");
c = sc.next().charAt(0);
System.out.println("value of c:" +c);
System.out.println("enter double value");
d = sc.nextDouble();
System.out.println("value of d:" +d);
System.out.println("enter boolean value");
b = sc.nextBoolean();
System.out.println("value of b:" +b);




}
}