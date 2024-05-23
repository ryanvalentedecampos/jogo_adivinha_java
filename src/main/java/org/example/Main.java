package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int) Math.round(Math.random()*10) ;
        int tentativa;



        System.out.println("#############################");
        System.out.println("##   jogo da adivinhação   ##");
        System.out.println("#############################");
        System.out.println();
        System.out.println("regras do jogo!");
        System.out.println("1- vou penssar em um numero");
        System.out.println("2- você tenta adivinhar qual numero estou pensando");
        System.out.println("3- te informo se acertou ou não");
        System.out.println("está pronto pra jogar?(s/n)");
        pronto = leitura.next();

        switch (pronto){
            case "s":
jogo_for();







                break;
            case "n":
                System.out.println("🤡🙄Até mais,então🤡🙄");
                break;
            default:
                System.out.println("🤣🤣opção inválida!🤣🤣");
        }
    }

    public static void jogo_for(){
        Scanner leitura = new Scanner(System.in);
        String pronto;
        int resposta = (int) Math.round(Math.random()*10) ;
        int tentativa;

        for(int contador = 0;contador<10;contador++){
            System.out.println("🤨🤨Qual número entre 0 e 10 estou pensando?🤨🤨");
            tentativa = leitura.nextInt();
            if(tentativa == resposta) {
                System.out.println("🥶🥵Parabéns, você acertou🥶🥵");
            }else{
                System.out.println("😂😂você errou😂😂");
                System.out.println("a resposta era" +resposta);

            }

            resposta = (int) Math.round(Math.random()*10);

        }

    }

}