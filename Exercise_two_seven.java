
package exercise;

import java.util.Scanner;


public class Exercise_two_seven {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes : ");
        int year,day,hour,minutes,y,d,m;
        Scanner input = new Scanner(System.in);
        minutes = input.nextInt();
        m = minutes;
        y = 60*24*365;
        year = minutes/y;
        minutes = minutes%y;
        d=60*24;
        day = minutes/d;
        System.out.println(m+" minutes is approximately "+ year + " years and "+day+"days");
        
    }
    
}
