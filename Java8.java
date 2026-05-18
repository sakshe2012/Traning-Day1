//Q8. Write a java program swap two number without using third variable. 
class Java8
{
 public static void main(String args[])
{
int a=10;
int b=80;

System.out.println("1st number before swapping: "+a);
System.out.println("2nd number before swapping: "+b);
a=a+b; //10+80=90
b=a-b; //90-80=10
a=a-b; //90-10=80
System.out.println("1st number after swapping: "+a);
System.out.println("2nd number after swapping: "+b);

}
}
