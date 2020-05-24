package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n,b,k=0;
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[50];
        System.out.print("Introduceti un nr in baza 10: ");
            n=scanner.nextInt();
        System.out.print("Introduceti baza in care doriti sa transformati numarul: ");
            b=scanner.nextInt();
        System.out.print(n+" in baza "+b+" este: ");
            baza_b(a,n,b,k);
        }
    public static void baza_b (int[] a, int n, int b, int k)
    {
        if(n>0)
        {
            a[k]=n % b;
            k++;
            baza_b(a,n/b,b,k);
        }
        else
        {
            for(int i=k-1;i>=0;i--)
                System.out.print(a[i]);
        }
    }
}