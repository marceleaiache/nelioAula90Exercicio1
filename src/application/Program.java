package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //DECLARAÇÃO DA VARIÁVEL DA QUANTIDADE DE NUMEROS QUE SERÃO INSERIDOS
        int n;

        //IMPRESSÃO NA TELA PRA COLHER DO USUÁRIO A QUANTIDADE DE NUMEROS INSERIDOS
        System.out.println("Quantos números você vai digitar? ");
        n = sc.nextInt();

        //VERIFICAÇÃO SE A QUANTIDADE DE NUMEROS PRA INSERIR É MAIOR QUE 10
       while (n > 10) {
            System.out.println("Número máximo permitido é 10. ");
            System.out.println("Quantos números você vai digitar? ");
            n = sc.nextInt();
        }

       //DECLARAÇÃO DO VETOR COM A QUANTIDADE DE NUMEROS QUE O USUARIO PEDIU
        int[] vect = new int[n];

       //INSTANCIAÇÃO DOS NUMEROS INSERIDOS DE ACORDO COM A QUANTIDADE QUE O USUÁRIO QUIS
        for(int i=0; i<vect.length; i++) {
            System.out.println("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        //IMPRESSAO NA TELA DOS NUMEROS QUE FOREM NEGATIVOS
        System.out.println("NÚMEROS NEGATIVOS: ");

        for(int i=0; i<vect.length; i++) {
            if(vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }

        sc.close();
    }
}
