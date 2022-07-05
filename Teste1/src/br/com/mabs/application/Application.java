package br.com.mabs.application;

import java.util.Scanner;

public class Application {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Informe o valor do veículo: ");
                Double valorVeiculo = sc.nextDouble();
                System.out.print("Informe a quantidade de prestação desejada ( 1 para pagamento à vista, ou dividido em 6, 12, 18, 24, 30): ");
                Integer qtdParcelas = sc.nextInt();

                if (qtdParcelas != 1 && qtdParcelas != 6 && qtdParcelas != 12 && qtdParcelas != 18 && qtdParcelas != 24 && qtdParcelas != 30 ){
                        System.out.println("Quantidade de parcelas inválidas. Favor informar entre 1, 6, 12, 18, 24, 30 ");
                } else{
                        valorVeiculo(valorVeiculo, qtdParcelas);
                        Double valorPrestacao = valorVeiculo(valorVeiculo, qtdParcelas) / qtdParcelas;
                        System.out.printf("O valor final do veículo é de: R$ %.2f e o valor da prestação mensal será de: R$ %.2f ", valorVeiculo(valorVeiculo, qtdParcelas), valorPrestacao);
                }
        }

        public static Double valorVeiculo(Double valorVeiculo, Integer qtdParcelas) {

                Double valorFinal = 0.0;

                switch (qtdParcelas) {
                        case 1:
                                valorFinal = valorVeiculo - (valorVeiculo * 0.20);
                                return valorFinal;

                        case 6:
                                valorFinal = valorVeiculo * 1.03;
                                return valorFinal;

                        case 12:
                                valorFinal = valorVeiculo * 1.06;
                                return valorFinal;

                        case 18:
                                valorFinal = valorVeiculo * 1.09;
                                return valorFinal;

                        case 24:
                                valorFinal = valorVeiculo * 1.12;
                                return valorFinal;

                        case 30:
                                valorFinal = valorVeiculo * 1.15;
                                return valorFinal;
                }

                return valorFinal;
        }
}
