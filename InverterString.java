package metodos;

import java.util.Scanner;

public class InverterString {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("escreva uma palavra:");
        String texto = scanner.nextLine();

        String textoInvertido = inverter(texto);

        System.out.println(textoInvertido);

        scanner.close();
    }
    public static String inverter(String txt){

        char caracter[] = txt.toCharArray();
        int left = 0;
        int right = caracter.length - 1;

        while (left <right) {
            char temp = caracter[left];
            caracter[left] = caracter[right];
            caracter[right] = temp;
            left++;
            right--;
        }

        String stringInvertida = new String(caracter);
        return stringInvertida;
    }
}
