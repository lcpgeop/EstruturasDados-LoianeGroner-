package comX.loiane.estruturadados.vetor.teste;

import comX.loiane.estruturadados.vetor.Vetor;

public class Aula03 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(5);

        vetor.adiciona("Valor 1");
        vetor.adiciona("Valor 2");
        vetor.adiciona("Valor 3");
        vetor.adiciona("Valor 4");
        vetor.adiciona("Valor 5");
        vetor.adiciona("Valor 6");

        System.out.println(vetor);

    }
}
