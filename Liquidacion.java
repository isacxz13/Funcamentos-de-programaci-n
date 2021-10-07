package domain;

import java.util.Scanner;

/*
Elabore un programa que calcule el monto de 
liquidación que un trabajador debe recibir considerando 
que la ley indica que debe recibir lo siguiente en base a 
su sueldo mensual años laborados:

•	3 meses de salario por indemnización
•	20 días de sueldo por cada año trabajado
•	Prima de antigüedad equivalente a 12 días de salario 
        por cada año trabajado
•	Vacaciones 1% del sueldo por cada año trabajado  
•	Otras prestaciones acumuladas por el trabajador que 
        no hayan sido liquidadas por el empleador.

Su programa debe pedir al trabajador despedido su salario 
diario y años trabajados para proceder a hacer estos cálculos.
 */
public class Liquidacion {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        String name;
        int years;
        float salary, total, prima, vacation, prestaciones, employee, indeminizacion, sueldo;
        System.out.println("         Settlement software          ");
        System.out.println("        Employee data    ");
        System.out.print("Name: ");
        name = consola.nextLine();
        
        System.out.print("Daily Salary: ");
        salary = consola.nextFloat();
        
        System.out.print("years worked: ");
        years = consola.nextInt();
        
        indeminizacion = (salary * 30) * 3;
        sueldo = (salary * 20) * years;
        prima = (salary * 12) * years;
        vacation = (float) ((salary*30)*.01)*years;
        
        total = indeminizacion + sueldo + prima + vacation;
        System.out.println("\n\n\n\nLiquidacion del Sr/Sra"+name+" que trabajo "+years+" años en la empresa");
        System.out.println("Indeminizacion: $"+indeminizacion);
        System.out.println("Sueldo por cada año trabajado: "+sueldo);
        System.out.println("Prima de antiguedad: "+prima);
        System.out.println("Vacaciones: "+vacation);
        System.out.println("\n\nEn total a pagar por loquidacion: "+total);
        consola.close();
    }
}
