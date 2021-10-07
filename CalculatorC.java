package domain;

import java.util.Scanner;

public class CalculatorC {
    public static void main(String[] args) {
        Scanner consola  =new Scanner(System.in); 
        //inicializamos las variables que seran parte de nuestro software
        float loose;
        int  bill200 = 0, bill100 = 0,bill500 = 0, bill50 = 0, bill20 = 0, coins10 = 0, coins5 = 0,coins2 = 0,coins1 = 0,coins50 = 0;
        //Se ingresan las cantidades
        System.out.println("        Loose Calculator");
        System.out.println("       Enter the amount    ");
        System.out.print("$$$ >> "); loose = consola.nextFloat();
        //Se reviza las cantidades y realizamos las operaciones para 
        //poder obtener las cantidades correctas
        if(loose >= 500){
            bill500 = (int) (loose/500);
            loose -= (bill500*500);
            System.out.println("Bill of $500: "+bill500);
        }
        if(loose >= 200){
            bill200 = (int) (loose/200);
            loose -= (bill200*200);
            System.out.println("Bill of $200: "+bill200);
        }
        if(loose >= 100){
            bill100 = (int) (loose/100);
            loose -= (bill100*100);
            System.out.println("Bill of $100: "+bill100);
        }
        if(loose >= 50){
            bill50 = (int) (loose/50);
            loose -= (bill50*50);
            System.out.println("Bill of $50: "+bill50);
        }
        if(loose >= 20){
            bill20 = (int) (loose/20);
            loose -= (bill20*20);
            System.out.println("Bill of $20: "+bill20);
        }
        if(loose >= 10){
            coins10 = (int) (loose/10);
            loose -= (coins10*10);
            System.out.println("Coins of $10: "+coins10);
        }
        if(loose >= 5){
            coins5 = (int) (loose/5);
            loose -= (coins5*5);
            System.out.println("Coins of $5: "+coins5);
        }
        if(loose >= 2){
            coins2 = (int) (loose/2);
            loose -= (coins2*2);
            System.out.println("Coins of $2: "+coins2);
        }
        if(loose >= 1){
            coins1 = (int) (loose/1);
            loose -= (coins1*1);
            System.out.println("Coins of $1: "+coins1);
        }
        if(loose >= .50){
            coins50 = (int) (loose/.50);
            loose -= (coins50*.50);
            System.out.println("Coins of $0.50 c: "+coins50);
        }
    }
}
