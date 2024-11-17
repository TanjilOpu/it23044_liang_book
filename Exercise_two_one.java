
package exercise;

import java.util.Scanner;
                                      // Celcius to Fahrenheit

public class Exercise_two_one {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius;
        System.out.println("Enter the tempereture in celcius scale ");
        celsius = input.nextDouble();
        double fahrenheit = (9.0/5)*celsius+32;
        System.out.println(celsius + " Celsius is "+fahrenheit+" Fahrenheit");
    }
    
}
