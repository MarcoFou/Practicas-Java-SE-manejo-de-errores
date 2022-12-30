import java.util.Scanner;

public class GenerarExcepc {

    public static void main(String[] args) {

      divide(2,1);


    }

    public static int divide(int a, int b) throws ArithmeticException {
        int resultado = 0;
        try {
            resultado = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Oye esto esta mal");
        }

        return resultado;
    }
}
