package br.com.mabs.application;

import br.com.mabs.entities.Aluno;

import java.util.Scanner;

public class Application {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroAlunos = 5;

                System.out.print("Informe a matricula: ");
                Integer matricula = sc.nextInt();
                System.out.print("Informe a nota 1: ");
                Double nota1 = sc.nextDouble();
                System.out.print("Informe a nota 2: ");
                Double nota2 = sc.nextDouble();
                System.out.print("Informe a nota 3: ");
                Double nota3 = sc.nextDouble();
                System.out.print("Informe a frequencia ( 0 - 100%): ");
                Integer frequencia = sc.nextInt();

                Aluno aluno = new Aluno(matricula, nota1, nota2, nota3, frequencia);
                Double notaGeral =  aluno.notaFinal(nota1, nota2, nota3);
                aluno.situacao(frequencia, notaGeral);
                System.out.println(aluno);

        }
}
