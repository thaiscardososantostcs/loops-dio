package br.com.dio.exercicios.loops.comentado;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int numeroMaior = 0;
        int soma = 0;


        do {
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > numeroMaior ) numeroMaior = numero;

            count = count + 1;


        } while (count < 5);

        System.out.println("Maior :" + numeroMaior);
        System.out.println("Media: " + (soma/5));

    }

}
