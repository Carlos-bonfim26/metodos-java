package metodos;

import java.util.Scanner;

public class media {
   
    public static void main(String[] args) {
        

          Media();  
    }
    public static void Media(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("quantos números você vai usar nessa lista");
        int tamanhoVetor = scanner.nextInt();

        double num[] = new double[tamanhoVetor];
        double acumulador = 0;
        for(int i = 0; i< num.length; i++){
            System.out.println("digite o "+ (i+ 1)+ "° número:");
            num[i] = scanner.nextDouble();

            acumulador += num[i];
        }
        double mediaAri = acumulador / num.length;

        System.out.println("a média é: "+  Math.round(mediaAri));


        scanner.close();
    }
    
}
