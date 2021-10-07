package domain;

import java.util.Scanner;

/*
4.- Elabore un programa que calcule el peso ideal de una 
persona preguntando lo apropiado de acuerdo con la siguiente 
información 
*/
public class weightI {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //inicializamos las variables que seran parte de nuestro software
        char sex;
        float height, weight;
        //Pedimos datos del usuario
        System.out.println("         Ideal weight         ");
        System.out.println("         man or woman          ");
        System.out.println("        enter your data");
        System.out.print("[M/F] your sex: "); sex = consola.next().charAt(0);
        //Realizamos las operaciones correspondientes
        System.out.print("Enter your height in cm \n"
                + "Your heigth is >> "); height = consola.nextFloat();
        if(sex == 'M' || sex == 'm'){
            weight = (float)((0.75*height) - 62.5);
        }else{
            weight = (float)((.675*height) -56.25);
        }
        System.out.println("Your ideal weight is: "+weight+" Kg");
    }
}
