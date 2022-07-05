package br.com.mabs.entities;

public class CamaroteSuperior extends Vip {

        public CamaroteSuperior(Double preco, String localizao) {
                super(preco, localizao);
        }

        @Override
        public void imprimeValor() {
                Double adicional = 50.00;
                System.out.println("O valor do ingresso é: " + super.getPreco() + " o adicional de: " + adicional);
        }

        public void imprimeLocalizacao() {
                super.imprimeLocalizacao();
        }
}
