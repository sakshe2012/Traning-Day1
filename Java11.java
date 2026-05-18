/* Q11. Write a java program to check whether number is neon or not. 
Input : 9 Output : Neon Number Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
*/

import java.util.Scanner;

class Java11
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n, square, rem, sum = 0;

        System.out.println("Enter number:");
        n = sc.nextInt();

        square = n * n;

        while(square > 0)
        {
            rem = square % 10;
            sum = sum + rem;
            square = square / 10;
        }

        if(sum == n)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}