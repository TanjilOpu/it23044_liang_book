
package exercise;


public class Exercise_eleven {
    public static void main(String[] args) {             // find the root of an equation 
        double a,b,c,d,x,y,e,f;
        a=3.4; b=50.2; e= 44.5;
        c=2.1; d = .55; f = 5.9;
        x = (e*d-b*f)/(a*d-b*c);
        y = (a*f-e*c)/(a*d-b*c);
        System.out.println("x = "+x);
        System.out.println("y = "+y);
        
    }
    
}
