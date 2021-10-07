package domain;

import java.util.Scanner;

/*
2. Elabore un programa que calcule cuanto pagó de impuestos en una 
compra realizada donde solo le proporcionan el total final a pagar. 
Se sabe que el impuesto fue de 16%.
*/
public class Impuestos {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        float subtotal =0 , total = 0, iva  =0;
        int option;
        System.out.println("         shop XZ13 S.A de C.V        ");
        System.out.println("       sale of electronic items       ");
        System.out.println("                Menu                  ");
        System.out.println("1.-Computer  ----------  $28,000.00 pesos\n"
                + "2.-television smart tv - $15,000.00 pesos\n"
                + "3.-Stereo    ----------- $12,000.00 pesos");
        System.out.print("to buy >> "); option = consola.nextInt();
        if (option == 1) {
            total = 28000;
            System.out.println("to buy computer");
        }else if( option == 2){
            total = 15000;
            System.out.println("To buy smart TV");
        }else if(option == 3){
            total = 12000;
            System.out.println("To buy Stereo");
        }else{
            System.out.println("Sorry the entered option is incorrect");
        }
        subtotal = (float) (total / 1.16);
        iva = (float) (subtotal * 0.16);
        System.out.println("Subtotal = $"+subtotal);
        System.out.println("IVA = $"+iva);
        System.out.println("Total = $"+total);
        System.out.println("Thanks again soon");
        consola.close();
    }
}
