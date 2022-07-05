package br.com.mabs.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Applicaiton {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                List<Integer> voto1 = new ArrayList<>();
                List<Integer> voto2 = new ArrayList<>();
                List<Integer> voto3 = new ArrayList<>();
                List<Integer> voto4 = new ArrayList<>();
                List<Integer> votoNulo = new ArrayList<>();
                List<Integer> votoBranco = new ArrayList<>();

                int somatorioVotos = 0;



                int candidato1 = 1;
                int candidato2 = 1;
                int candidato3 = 1;
                int candidato4 = 1;
                int nulo = 5;
                int branco = 6;
                int voto;

                do {
                        voto = sc.nextInt();
                        switch (voto) {
                                case 1:
                                        voto1.add(voto);
                                        somatorioVotos++;
                                        break;
                                case 2:
                                        voto2.add(voto);
                                        somatorioVotos++;
                                        break;
                                case 3:
                                        voto3.add(voto);
                                        somatorioVotos++;
                                        break;
                                case 4:
                                        voto4.add(voto);
                                        somatorioVotos++;
                                        break;
                                case 5:
                                        votoNulo.add(voto);
                                        somatorioVotos++;
                                        break;
                                case 6:
                                        votoBranco.add(voto);
                                        somatorioVotos++;
                                        break;
                        }
                } while (voto != 0);

                System.out.println("O total de voto de cada candidato foi: " +
                                "Candidato 1:  " + voto1.size() +
                                " | Candidato 2: " + voto2.size() +
                                " | Candidato 3: " + voto3.size() +
                                " | Candidato 4: " + voto4.size());


                System.out.println("O total de votos Nulos foi: " + votoNulo.size());
                System.out.println("O total de votos Brancos foi: " + votoBranco.size());

                Double porcentagemNulo = Double.valueOf(votoNulo.size()) / somatorioVotos * 100;
                System.out.println("A porcentagem de votos nulos sobre o total de votos foi: " + porcentagemNulo + " %");

                Double porcentagemBranco = Double.valueOf(votoBranco.size()) /  somatorioVotos * 100;
                System.out.println("A porcentagem de votos Brancos sobre o total de votos foi: " + porcentagemNulo + " %");
        }
}
