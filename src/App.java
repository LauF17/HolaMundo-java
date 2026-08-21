import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*operadores aritmeticos */ 
         int a = 10, b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        /* operadores logicos
        && es AND deben ser ambas true 
        || es OR  debe ser almenos una de las dos verdadero
        ! es NOT  */

        boolean mayorDeEdad = true;
        boolean tieneCarnet = false;

        System.out.println(mayorDeEdad && tieneCarnet);
        System.out.println(mayorDeEdad || tieneCarnet);
        System.out.println(!mayorDeEdad); 

        /*  clase de consola 
        scanner es una clase que se esta importando 
        Los + son concatenación
        
        siempre se usa Scanner sc = new Scanner(System.in);*/

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        System.out.println(" Hola, " + nombre + ". Tienes " + edad + " años. ");

        sc.close();

         /*Estructura Secuencial*/ 
         
        

        System.out.print("ingresa tu base ");
        int  base = sc.nextInt();

        System.out.print("ingresa la altura");
        int  altura = sc.nextInt();
        System.out.print("area: ");
        double area = sc.nextDouble();

        System.out.println( base*altura);

        System.out.println("el area del rectangulo es: " + area);

         
        

        
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();

        double promedio = ( nota1 + nota2 + nota3)/3;

         /*Estructura Condicional */

        Scanner sc = new Scanner(System.in);

        System.out.print("ingresa nota ");
        int  nota = sc.nextInt();

        if (nota>=90){
            System.out.println("excelente");

        } else if  ( nota>= 70 ){
            System.out.println("bueno");
        }else if  (nota>=60){
            System.out.println("Aprobado");
        }else {
            System.out.println("Reprobado");
        }
        
    }


} 

