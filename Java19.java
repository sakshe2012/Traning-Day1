//Q19.write java program to checck character is alphabet or not 

import java.util.Scanner;
class Java19
{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
char ch;
System.out.println("enter");
ch = sc.next().charAt(0);
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z')
{
System.out.println("entered char is alphabet");

}

else
{
System.out.println("entered char is not alphabet");

}

}

}