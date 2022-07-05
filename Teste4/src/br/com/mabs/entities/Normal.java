package br.com.mabs.entities;

public class Normal extends Ingresso {

        public Normal(Double preco) {
                super(preco);
        }
        @Override
        public void imprimeValor() {
                System.out.println("Ingresso normal");
        }
}
