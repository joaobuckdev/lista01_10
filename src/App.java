import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        double celsius;
        double fahrenheit;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a temperatura em Fahrenheit: ");
        celsius = teclado.nextDouble();
        teclado.close();
        
        fahrenheit = (((celsius*9)/5)+32);

        System.out.println(" ");
        System.out.println("A temperatura convertida para Fahrenheit é: " + fahrenheit + "°F");
    }
}
