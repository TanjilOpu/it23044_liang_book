
package exercise;

import java.util.Scanner;

public class Exercise_two_eleven {
    public static void main(String[] args) {
                                            // Population projection
        System.out.println("Enter the number of year  ");
        Scanner input = new Scanner(System.in);
        double population ,future_poplutaion,year;
        int y=1;
        double growth_rate;
        year = input.nextInt();
        System.out.println("Enter current total population ");
        population = input.nextInt();
        System.out.println("Enter the growth rate in percentage  ");
        growth_rate = input.nextDouble();
        growth_rate = growth_rate/100.0;
        future_poplutaion  = population ;
        System.out.println(future_poplutaion);
        for(double i = 0 ;i<year;i++ )
        { 
            System.out.println("g rate"+growth_rate);
            future_poplutaion+= future_poplutaion * growth_rate;
            System.out.println("After " +y+ " years , the number population will be " +future_poplutaion);
            
            y++;
        }
       
        
    }
    
}
