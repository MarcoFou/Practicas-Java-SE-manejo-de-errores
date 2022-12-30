import java.util.Scanner;

/**
 *  Un error es un comportamiento no esperado
 *
 * Tipos de errores:
 *
 * 1. Error de tiempo de ejecucion: aborta la ejecucion antes de terminar
 *
 * 2. Error de Compilacion: es un error de sintaxis
 *
 * 3. Error logico: es el error humano, logica mal implementada.
 *
 */
public class Tipos_de_errores {
    public static void main(String[] args) {

        // Error de tiempo de ejecucion:

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduce dos numeros");

        int numeroA = scaner.nextInt();
        int numeroB = scaner.nextInt();

        try {
            int resultado = numeroA / numeroB;
            System.out.println("El resultado es " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Estoy en una excepcion aritmetica");
        } catch (Exception e) {
            System.out.println("Booom!, La excepcion es: " + e.getClass());

        } finally {
            System.out.println("finally");
        }

    }
}