import java.time.LocalDateTime;
import java.util.Scanner;

import utilidades.Matematicas;

/**
 * @author Rocio
 * @version 1.0
 * App: Fundamento de la programación
 */
public class App {

    /**
     * Funcion main para ejecutar el programa
     * @param args Argumentos de la linea de comandosS
     */
    public static void main(String[] args) {
        // double edad;
        // edad = 18;
        // boolean logico = (7<5);
        // String caracter="Rocio";

        // // System.out.println("Hola Mundo");
        // // System.out.println(edad);
        // // System.out.println(logico);

        // // System.out.println("Hola Mundo" + edad+ ", " + logico);

        // int numerador = (1+2+3+1);
        // double denominador = 3;
        // System.out.println((1+2+3+1)/3);
        // System.out.println((1+2+3+1)/3.0);
        // System.out.println(numerador/denominador);

        // int a='a';
        // System.out.println(a);

        //  int[]b={4,0,-1};
        //  System.out.println(b);
        //  System.out.println(b[2]);

        //  final int VALOR;
        //  VALOR=5;
        // //Declaración de variables en linea
        //  int uno=1,dos=2,tres=3;

        //  /* Parrafo comentario de prueba
        // x lkwccmw   
        // q   erfg2q4gqwg*/


        //CLASE 2
        // Ejemplo introducir un valor por teclado
        // Scanner sc = new Scanner(System.in);
        // int numero;
        // //Ejemplo de pedir un numero por teclado y mostrarlo por pantalla
        // System.out.println("Introduce un número entre 5 y 25: ");//Pedir un número por teclado
        // numero=Integer.parseInt(sc.nextLine());
        // System.out.println("Introduce un nombre: ");
        // String nombre = sc.nextLine();
        // numero=sc.nextInt();//Escribes el numero y lo lee
        // System.out.println("El número introducido es: " + numero+ "y tu nombre es: " + nombre); 

        // System.out.println("Introduce tu apellido ");
        // String apellido = sc.nextLine();
        // System.out.println("Tu apellido es: " + apellido);

    // LocalDateTime hoy = LocalDateTime.now();
    //     System.out.println("Hoy es: " + hoy.getDayOfWeek()); // nombre del día
    //     System.out.println("El día es: " + hoy.getDayOfMonth());
    //     System.out.println("El mes es: " + hoy.getMonth()); // nombre del mes
    //     System.out.println("El año es: " + hoy.getYear());
    //     System.out.println("Hora: " + hoy.getHour() + " Minutos: " + hoy.getMinute());

    
    //     System.out.println(Math.pow(2, 5));

        // int min = 1;
        // int max = 15;
        // double aleatorio = (int) (Math.random() * (max - min + 1)) + min;
        // System.out.println("Número aleatorio entre " + min + " y " + max + ": " + aleatorio);


        //CLASE 3
        //Utiliozar la clase Matematicas para realizar operaciones
        // int num1=3;
        // int num2=5;
        // System.out.println("La suma es: " +Matematicas.sumar(num1, num2));
        // System.out.println("La multiplicación es: " +Matematicas.multiplicar(num1, num2));

        // System.out.println("El resto de la division 5/2 es: " + (5%2));

        // int variable=2;
        // System.out.println("El valor de la variable es: " + variable);
        // variable++; //Variable=variable+1
        // System.out.println("El valor de la variable es: " + variable);

        // int valor1=5;
        // int valor2=10;
        // valor1+=valor2; //valor1=valor1+valor2
        // valor1-=valor2; //valor1=valor1-valor2

        //Condiciones if-else
        int numero=3;
        int numero2=5;
        int resultado;

        if(numero>numero2){
            //Si se cumple hara esto
            // System.out.println("Numero > numero2");
            resultado=numero+numero2;
        }

        // else{
        //     //Si no se cumple hara esto
        //     // System.out.println("Numero < numero2");
        //     resultado=numero-numero2;
        //  }
        //  System.out.println(numero+" "+numero2+" "+resultado);
        //  //USANDO EL OPERADOR TERNARIO
        //  resultado=(numero>numero2) ? numero+numero2:numero-numero2;
        //  System.out.println( "POR AQUI VOY");

            //IF-ELSE ENCADENADO
        // int dia=9;

        // if (dia == 1) {
        //     System.out.println("Lunes");
        // } 
        //     else if (dia == 2) {
        //     System.out.println("Martes");
        // } 
        //     else if (dia == 3) {
        //     System.out.println("Miércoles");
        // } 
        //     else if (dia == 4) {
        //     System.out.println("Jueves");
        // } 
        //     else if (dia == 5) {
        //     System.out.println("Viernes");
        // } 
        //     else if (dia == 6) {
        //     System.out.println("Sábado");
        // } 
        //     else if (dia == 7) {
        //     System.out.println("Domingo");
        // } 
        //     else {
        //     System.out.println("Ese dia no existe");
        // }

        // //SWITCH
        // int valor=3;
        // switch (valor) {
        //     case 1:
        //         System.out.println("Lunes");
        //         break;
        //     case 2:
        //         System.out.println("Martes");
        //         break;
        //     case 3:
        //         System.out.println("Miércoles");
        //         System.out.println("Hola que tal");
        //         break;
        //     case 4:
        //         System.out.println("Jueves");
        //         break;
        //     case 5:
        //         System.out.println("Viernes");
        //         break;
        //     case 6:
        //         System.out.println("Sábado");
        //         break;
        //     case 7:
        //         System.out.println("Domingo");
        //         break;
        //     default:
        //         System.out.println("Ese dia no existe");
        // }

        // System.out.println("Por aqui voy");

        

    }
}
