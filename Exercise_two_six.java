
package exercise;

import java.util.Scanner;


public class Exercise_two_six {
    public static void main(String[] args) {            // sum of digit of an integer number
        System.out.println("Enter an integer number between 0 to 1000 ");
        Scanner input = new Scanner(System.in);
        int  number,sum =0 ;
        number = input.nextInt();
        while(number>9)
        {
            sum = sum + (number%10);
            number = number/10;
        }
        sum += number;
        System.out.println("The sum of the digits is " + sum);
    }
                                           
    
    
}
