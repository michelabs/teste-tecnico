package br.com.mabs.entities;

public class Aluno {

        private Integer matricula;
        private Double nota1;
        private Double nota2;
        private Double nota3;
        private Integer frequencia;

        public Aluno() {

        }

        public Aluno(Integer matricula, Double nota1, Double nota2, Double nota3, Integer frequencia) {
                this.matricula = matricula;
                this.nota1 = nota1;
                this.nota2 = nota2;
                this.nota3 = nota3;
                this.frequencia = frequencia;
        }

        public Integer getMatricula() {
                return matricula;
        }

        public void setMatricula(Integer matricula) {
                this.matricula = matricula;
        }

        public Double getNota1() {
                return nota1;
        }

        public void setNota1(Double nota1) {
                this.nota1 = nota1;
        }

        public Double getNota2() {
                return nota2;
        }

        public void setNota2(Double nota2) {
                this.nota2 = nota2;
        }

        public Double getNota3() {
                return nota3;
        }

        public void setNota3(Double nota3) {
                this.nota3 = nota3;
        }

        public Integer getFrequencia() {
                return frequencia;
        }

        public void setFrequencia(Integer frequencia) {
                this.frequencia = frequencia;
        }

        public Double notaFinal(Double nota1, Double nota2, Double nota3) {
                Double notaFinal = (nota1 + nota2 + nota3) / 3;
                return notaFinal;
        }

        public String situacao(int frequencia, Double notaFinal) {
                notaFinal = notaFinal(nota1, nota2, nota3);
                boolean aprovado = false;

                if (frequencia >= 75 && notaFinal > 7) {
                        aprovado = true;
                        return " está aprovado";
                }
                return  " está reprovado";
        }

        @Override
        public String toString() {
                return "Matricula: " + getMatricula() + ", Nota final: " + String.format("%.2f", notaFinal(nota1, nota2, nota3)) + situacao(frequencia, notaFinal(nota1, nota2, nota3));


        }
}
