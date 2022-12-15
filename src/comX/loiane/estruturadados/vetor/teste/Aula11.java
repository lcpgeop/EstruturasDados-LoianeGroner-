package comX.loiane.estruturadados.vetor.teste;

import comX.loiane.estruturadados.vetor.VetorGenerics;
import comX.loiane.estruturadados.vetor.VetorObject;

public class Aula11 {
    public static void main(String[] args) {
        VetorObject vetor = new VetorObject(2);
        // esta possibilidade, de incluir valores de diferentes tipos, é considerado
        // um problema com a classe VetorObject, uma vez que quebra o conceito de
        // vetor... pois para ser um vetor, todos os elementos deve ser do mesmo tipo...

        /*
         * vetor.adiciona(1);
         * vetor.adiciona("Elemento de String");
         */


         
        VetorGenerics<String> vetor1 = new VetorGenerics<String>(5);
        VetorGenerics<Double> vetor2 = new VetorGenerics<Double>(5);

        vetor.adiciona("String em VetorObject");
        vetor1.adiciona("GenericVector, String");
        vetor2.adiciona(15825.0);

        System.out.println(vetor);
        System.out.println(vetor1);
        System.out.println(vetor2);
    }
}
