public class Actividades {
    public static void main (String[] args) {
        //Actividad diapositiva 9
        // Realiza un programa que genera 2 números y nos diga el cociente, la
        // media, la potencia y la raíz cuadrada. Usa tipos adecuados
        //Genera dos números de manera aleatoria
        int min = 1;
        int max = 15;
        double num1 = (int) (Math.random() * (max - min + 1)) + min;
        double num2 = (int) (Math.random() * (max - min + 1)) + min;

        //Realizar las operaciones
        System.out.println("El número 1 es  " + num1);
        System.out.println("El número 2 es  " + num2);

        double cociente = num1 / num2;
        System.out.println("El cociente es  " + cociente);
        

        double media = (num1 + num2) / 2;
        System.out.println("La media es " + media);
        

        double potencia = Math.pow(num1, num2);
        System.out.println("La potencia es " + potencia);
        
        double raizCuadrada = Math.sqrt(num1);
        System.out.println("La raiz cuadrada es " + raizCuadrada);
        double raizCuadrada2 = Math.sqrt(num2);
        System.out.println("La raiz cuadrada es " + raizCuadrada2);
        
        //ACTIVIDAD DIAPOSITIVA 12
        // ¿Cómo sabemos si un número es divisible por 2 y por 3?

        int num=5;
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("El número " + num + " es divisible por 2 y por 3");
        } else {
            System.out.println("El número " + num + " no es divisible por 2 y por 3");
        }
        











       
    }
}
