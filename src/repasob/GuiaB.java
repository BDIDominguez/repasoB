/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasob;

import java.util.Scanner;





/**
 *
 * @author Dario
 */
public class GuiaB {
    
    /* 6. Implementar un método que reciba por parámetro dos números enteros y determine cuál es
el mayor y lo muestre por pantalla. */
    
    public static void cualMayor(int a, int b){
        System.out.println("El mayor entre " + a + " y " + b + " es " + Math.max(a, b));
        
    }
    
    /* 7. Crear un método que reciba por parámetro un numero y determine si es par o impar.*/
    
    public static void queEs(int a){
        if (a % 2 == 0){
            System.out.println("El numero " + a + " es PAR");
        }else {
            int contador = 0;
            for (int i = 2; i < a; i++){
                if (a % i == 0){
                    contador++;
                }
            }
            if (contador == 0){
                System.out.println("El numero " + a + " es IMPAR");
            }else{
                System.out.println("EL numero " + a + " es COMPUESTO");
            }
        }
    }
    
    /* 8. Crear un método que pida una frase por teclado y si esa frase es igual a “eureka” pondrá un
mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar el método equals()
de String. */
    public static void compararTexto(){
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingresa una palabra ");
        String vCadena = tec.nextLine();
        if (vCadena.equalsIgnoreCase("eureka")){
            System.out.println("Son iguales");
        }else{
            System.out.println("No Son Iguales");
        }
    }
    
    /* 9. Realizar un método que solo permita introducir frases o palabras de 8 caracteres de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
el método lenght() de String. */
    
    public static void limitaCaracteres(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 8 caracteres como maximo");
        String vFrase = teclado.nextLine();
        if (vFrase.length() > 8){
            System.out.println("Incorrecto la cantidad de letras es mayor a 8");
        }else{
            System.out.println("Correcto");
        }
    }
    
    /* 10. Escriba un método que pida una frase o palabra y valide si la primera letra de esa frase es una
‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que diga
“CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. */
    public static void primeraLetra(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una Frase ");
        String vFrase = teclado.nextLine();
        if (vFrase.startsWith("A")){
            System.out.println("Correcto Inicia con A");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
    /* 11. Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). En un nuevo método definir una
variable tipoMotor y permitir que el usuario ingrese un valor entre 1 y 4. El método debe mostrar
lo siguiente:
 Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”.
 Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
 Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
 Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta
alimenticia”.
 Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba” */
    public static void tipoMotor() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tipo de motor ");
        int tipoMotor = teclado.nextInt();
        switch (tipoMotor) {
            case 1:
                System.out.println("La bomba es una bomba de agua");
                break;
            case 2:
                System.out.println("La bomba es una bomba de gasolina");
                break;
            case 3:
                System.out.println("La bomba es una bomba de hormigon");
                break;
            case 4:
                System.out.println("La bomba es una bomba de pasta alimenticia");
                break;
            default:
                System.out.println("No existe un valor valido para tipo de bomba");
                break;
        }
    }
    
    
    
} // Fin del la Clase
