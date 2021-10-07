package domain;

import java.util.Scanner;

/*
1.- Elabore un programa que calcule la edad de una persona (años, meses y días vividos), 
teniendo como dato de entrada la fecha actual y fecha de nacimiento.
*/
public class CalcularEdad {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        //Se declaran las variables que usaremos en el programa
        int dayB = 0,monthB = 0, ageB = 0, day = 0, month = 0, year = 0;
        //Se digitan los datos y almacenan en las variables de la fecha de nacimiento
        System.out.println("       Software to calculate your age      ");
        System.out.println("         Enter your date of birth:         ");
        System.out.print("Day: "); dayB = consola.nextInt();
        System.out.print("Month: "); monthB = consola.nextInt();
        System.out.print("year: "); ageB = consola.nextInt();
        //Se digitan los datos y almacenan en las variables del dia actual
        System.out.println("         Enter the current date       ");
        System.out.print("Day: "); day = consola.nextInt();
        System.out.print("Month: "); month = consola.nextInt();
        System.out.print("year: "); year = consola.nextInt();
        //Realizamos una excepciones para ver si los datos ingresados con correctos
        if(dayB > 0 || dayB <= 31 || monthB > 0 || monthB <= 12 && day > 0 || day <= 31 || month > 0 || month <= 12){
            //Realizamos la resta de las fechas ya que asi llegaremos a la conclusion
            // De los años que tiene
            day -= dayB;
            month -= monthB;
            year -= ageB;
            if(month < 0){
                month *= -1;
            }if(day < 0){
                day *= -1;
            }
            //Digitamos la edad y los meses correspondientes
            System.out.println("Current age is: "+year+" months: "+month+" days: "+day);
        }else{
            System.out.println("Date incorret");
        }
        consola.close();
    }
}
