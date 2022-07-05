package br.com.mabs.entities;

public class Ingresso {

        private Double preco;

        public Ingresso(Double preco) {
                this.preco = preco;
        }

        public Double getPreco() {
                return preco;
        }

        public void setPreco(Double preco) {
                this.preco = preco;
        }

        public void imprimeValor() {
        }

}
