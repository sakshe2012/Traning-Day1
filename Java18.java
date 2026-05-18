/*
Q18. Write a java program to input basic salary of an employee and calculate its Gross salary according to following
. Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% Basic Salary > 20000 : HRA = 30%, DA = 95%
*/
import java.util.Scanner;

class Java18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        double basic, hra, da, gross;

        System.out.println("Enter Basic Salary:");
        basic = sc.nextDouble();

        if(basic <= 10000)
        {
            hra = basic * 20 / 100;
            da = basic * 80 / 100;
        }
        else if(basic <= 20000)
        {
            hra = basic * 25 / 100;
            da = basic * 90 / 100;
        }
        else
        {
            hra = basic * 30 / 100;
            da = basic * 95 / 100;
        }

        gross = basic + hra + da;

        System.out.println("Gross Salary = " + gross);
    }
}