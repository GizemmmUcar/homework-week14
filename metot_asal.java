
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
public class metot_asal {

    public static void num() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi = input.nextInt();
        int sayac = 0;

        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(sayi + " Asal sayıdır.");
        } else {
            System.out.println(sayi + " Asal sayı degıldır.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        num();
    }

}
