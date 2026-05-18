//Q9. Write a Java program to print the ASCII value of a given character.
import java.util.*;
class Java9
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char c;
System.out.println("enter character:" );
c=sc.next().charAt(0);
int I;
I=(int)c;
System.out.println("ASCII value:"+I);
}
}