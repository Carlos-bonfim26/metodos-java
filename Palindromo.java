package metodos;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um texto para ver se é um palíndromo:");
        String texto = scanner.nextLine();

        String isPalindromo = verificarPalindromo(texto) ? "é um palindromo":"não é um palindromo";

        System.out.println(isPalindromo);

        scanner.close();

    }
    public static boolean verificarPalindromo(String txt){

      String textoInvertido = Inverter(txt).toLowerCase();
      String texto = RemoverEspacos(txt).toLowerCase();

      return texto.equals(textoInvertido);
    }
    
    public static String RemoverEspacos(String txt){
        
        return txt.replace(" ", "");
    }
    public static String Inverter(String txt){

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
        return RemoverEspacos(stringInvertida);
    }
}
