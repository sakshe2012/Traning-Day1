//Q5. Write a java program to enter marks of five subjects and calculate total marks and percentage
import java.util.*;
class Java5
{
 public static void main(String args[])
{
 Scanner sc= new Scanner(System.in);
int sub1;
int sub2;
int sub3;
int sub4;
int sub5;
int totalmarks;
double percentage;
System.out.println("enter marks of sub1");
sub1 = sc.nextInt();
System.out.println("enter marks of sub2");
sub2 = sc.nextInt();
System.out.println("enter marks of sub3");
sub3 = sc.nextInt();
System.out.println("enter marks of sub4");
sub4 = sc.nextInt();
System.out.println("enter marks of sub5");
sub5 = sc.nextInt();
totalmarks=sub1+sub2+sub3+sub4+sub5;
System.out.println(" Total marks:"+totalmarks);
percentage= (totalmarks/500.0)*100;
System.out.println("percenatge is:"+percentage);
}
}