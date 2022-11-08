import java.util.Scanner;

import java.util.*;
public class Practice1_03 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


          System.out.println("enter the price of Pencil ");
          int a=sc.nextInt();
          System.out.println("enter the price of Pen ");
          int b=sc.nextInt();
          System.out.println("enter the price of eraser ");
          int c = sc.nextInt();


          int e= a+b+c;

          double d= ((a+b+c)*18)/100;


          double S= e+d;
          System.out.println("the final price is given product"+S);






        
             
    }
}
