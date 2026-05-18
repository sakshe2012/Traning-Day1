//Q10. Write a Java program to convert seconds to hours, minutes and seconds. 
import java.util.*;

class Java10
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
int a;
System.out.println("enter time in sec : " );
a=sc.nextInt();
System.out.println("time in sec is :" + a + " sec");
int min= a/60;
System.out.println("time is min is :" + min + " minutes");
double hour = a/3600.0;
System.out.println("time in hour is " +hour + " hours");
}

}