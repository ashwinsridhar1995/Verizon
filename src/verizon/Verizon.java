package verizon;

import java.util.Scanner;

public class Verizon {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        
        String f = polynomial();
        System.out.println(f);
        String g = polynomial();
        System.out.println(g);
        String nested1 = f.replaceAll("x", "(" + g + ")"); 
        String nested2 = g.replaceAll("x", "(" + f + ")");
        System.out.println("f(g(x)):" + nested1); 
        System.out.println("g(f(x)):" + nested2);
    }
    
    public static String polynomial() {
        Scanner sc = new Scanner(System.in);
        
        String polyFunction = "";
        int numberOfTerms = 0;
        int coeff = 0;
//        try {
//            do {
//                System.out.println("How many terms");
//                numberOfTerms = sc.nextInt();
//            } while(!sc.hasNextInt() || numberOfTerms <= 0);
//            
//        } catch(NumberFormatException e) {
//            System.out.println("Invalid Input");
//        }
        System.out.println("How many terms");
        numberOfTerms = sc.nextInt();
            
        for(int i = numberOfTerms-1; i >= 0; i--) {
           System.out.println("Enter the coefficient for this term");
           coeff = sc.nextInt();
               
           if(coeff == 0) {
              continue;
           }
               
           if(i >=2) {
               polyFunction += coeff + "x^" + i + "+";
           }
           else if(i == 1) {
               polyFunction += coeff + "x" + "+";
           }
           else {
               polyFunction += coeff;
               break;
           }
        }
        return polyFunction;
    }
}
