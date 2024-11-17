
package pattern_display;

import java.util.Scanner;


public class Pattern_display {

   
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("Exercise 1.3");
        
        System.out.println("    J         A         v     v      A  ");
        System.out.println("    J        A A         v   v      A A   ");
        System.out.println("J   J       AAAAA         v v      AAAAA    ");
        System.out.println(" J J       A     A         v       A     A    ");
        
        
        
        
        System.out.println("Exercise 1.4");
                System.out.println("a    a^2   a^3");

        for(int i=1;i<=4;i++)
        {
            int a=i;
           int  b=a*a;
            int c=b*a;
             System.out.print(a);System.out.print("    ");
             System.out.print(b);System.out.print("     ");
             System.out.println(c);
        }
                        System.out.println("Exercise 1.4");
                        double result = ((9.5*4.5)-(2.5*3))/(45.5-3.5);
                        System.out.println(result);
                        
                        
                        
                        System.out.println("Exercise 1.6");
                         int sum=0;
                        for(int i=1;i<=9;i++)
                        {
                            if(i==9)
                            {
                                System.out.print(i + " =");
                            }
                            else 
                            {
                                System.out.print(i + "+");
                            }   
                            sum+=i;
                        }
                        System.out.println(sum);
                        
                  System.out.println("Exercise 1.7");
                  double result1 ,result2;
                  result1 = 4*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11));
                  System.out.println(" 4*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11))  =  "+result1);
                    result2 = 4*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11)+(1.0/13));
                  System.out.println(" 4*(1.0-(1.0/3)+(1.0/5)-(1.0/7)+(1.0/9)-(1.0/11))  =  "+result2);
                  
                   System.out.println("Exercise 1.8");
                   double pi=result2;
                   double perimeter,area,radius;
                   System.out.println("Perimeter of circle :  \n ");
                   
                   System.out.println("Enter the radius of your circle ");
                   
                   radius = input.nextDouble();
                   perimeter = 2*radius*pi;
                   System.out.println("Perimeter = "+perimeter);
                   
                    System.out.println("Area of circle :  \n ");
                   
                   System.out.println("Enter the radius of your circle ");
                   
                   radius = input.nextDouble();
                  area = pi*radius*radius;
                   System.out.println("Area = "+area);
                   
                   System.out.println("\nExercise 1.9");
                   System.out.println("Area and perimerer of a Rectangle\n");
                   System.out.println("Given that  \n Width = 4.5 \nand Height = 7.9\n");
                   double r_area,r_perimeter ,width=4.5,height=7.9;
                   r_area = width*height;
                   System.out.println("Rectangle area = "+r_area);
                 r_perimeter =2*(width+height) ;
                   System.out.println("\nRectangle perimeter = "+r_perimeter);
        
       
    }
    
}
