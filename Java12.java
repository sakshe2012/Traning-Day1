//Q12. Write a Java program that takes an alphabet character and toggles its case using ASCII values 
  //   and operators.
    // Example: a → A, Z → z.
import java.util.*;
class Java12
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char c;
System.out.println("enter character:" );

c=sc.next().charAt(0);
if (Character.isUpperCase(c))
{
int I;
I=(int)c;// ascii value
System.out.println("ASCII value:"+I);
int a;
a=I+32;// toggle case conversion 
char b;
b=(char)a;
System.out.println("toggle value of entered charcter :" +b);
}
else
{
int I;
I=(int)c;
System.out.println("ASCII value:"+I);
int a;
a=I-32;
char b;
b=(char)a;
System.out.println("toggle value of entered charcter: " +b);

}
}
}