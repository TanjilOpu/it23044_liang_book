
package exercise;

import java.util.Scanner;


public class Exercise_two_five {
    public static void main(String[] args) {
         
                                               // financial application calculate gratutity
        System.out.println("Enter subtotal : ");
        Scanner input = new Scanner(System.in);
        double subtotal,gratuty_rate,gratuty,total;
        subtotal = input.nextDouble();
        System.out.println("Enter gratuty_rate in percentage   : ");
        gratuty_rate = input.nextDouble();
        gratuty = subtotal * (gratuty_rate/100.0);
        total = subtotal+gratuty;
        System.out.println("Total  = "+total);
        
        
    }
    
}
