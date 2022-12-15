package comX.loiane.estruturadados.vetor.teste;

import comX.loiane.estruturadados.vetor.Vetor;

public class Aula09 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(10);

        vetor.adiciona("B");
        vetor.adiciona("C");
        vetor.adiciona("E");
        vetor.adiciona("F");
        vetor.adiciona("G");
        vetor.adiciona("H");

        System.out.println(vetor);
        vetor.adiciona("A", 0);
        System.out.println(vetor);
        vetor.adiciona("D", 3);
        System.out.println(vetor);
        vetor.remove(3);
        System.out.println(vetor);
        vetor.remove("F");
        System.out.println(vetor);
        vetor.remove("F");
        System.out.println(vetor);
    }
}
