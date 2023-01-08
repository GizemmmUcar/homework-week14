
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gizee
 */
public class metot_karelertoplamı {
     public static void num(){
         Scanner input=new Scanner(System.in);
         System.out.print("N değerini giriniz:");
         int n=input.nextInt();
         int toplam=0;
         for (int i = 1; i <=n; i++) {
             toplam+=Math.pow(i,2);
             
         }
         System.out.println("Toplam:"+toplam);
}
    public static void main(String[] args) {
        // TODO code application logic here
        num();
        
    }
    
}
