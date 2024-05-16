package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta;
        int tentativa;



        System.out.println("#############################");
        System.out.println("##   jogo da adivinhação   ##");
        System.out.println("#############################");
        System.out.println();
        System.out.println("regras do jogo!");
        System.out.println("1- vou prmsar em um numero");
        System.out.println("2- você tenta adivinhar qual numero estou pensando");
        System.out.println("3- te informo se acertou ou não");
        System.out.println("está pronto pra jogar?(s/n)");
        pronto = leitura.next();

        switch (pronto){
            case "s":
                resposta = 6;
                System.out.println("Qual número entre 0 e 10 estou pensando?");
                tentativa = leitura.nextInt();
                if(tentativa == resposta) {
                    System.out.println("Parabéns, você acertou");
                }else{
                    System.out.println("Que pena, você errou!");

                }
                break;
            case "n":
                System.out.println("Até mais,então");
                break;
            default:
                System.out.println("opção inválida!");
        }
    }
}