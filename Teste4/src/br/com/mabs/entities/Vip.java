package br.com.mabs.entities;

public class Vip extends Ingresso {

        private String localizao;

        public Vip(Double preco, String localizao) {
                super(preco);
                this.localizao = localizao;
        }

        public String getLocalizao() {
                return localizao;
        }

        public void setLocalizao(String localizao) {
                this.localizao = localizao;
        }

        @Override
        public void imprimeValor() {
                Double adicional = 25.00;
                System.out.println("O valor do ingresso é: " + super.getPreco() + " o adicional de: " + adicional);

        }

        public void imprimeLocalizacao() {
                System.out.println("Localizao: " + localizao);
        }
}
