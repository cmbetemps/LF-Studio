package maquina_turing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        boolean leitura;
        Reconhecer maquinadeTuring = new Reconhecer();
        ArrayList<String> config = new ArrayList<>();

        Scanner teclado = new Scanner(System.in);
        String palavra = "";
        System.out.println("Digite uma palavra:");

        palavra = teclado.nextLine();
        teclado.close();
        leitura = maquinadeTuring.reconhecer(palavra, config);

        if (leitura == true) {
            System.out.println("Palavra reconhecida");
        } else {
            System.out.println("Palavra não reconhecida");
        }
    }
}
