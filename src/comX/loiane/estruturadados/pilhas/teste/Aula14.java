package comX.loiane.estruturadados.pilhas.teste;

import comX.loiane.estruturadados.pilhas.Pilha;

public class Aula14 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        for(int i = 1; i <= 10; i++){
            pilha.empilha(i);
        }

        System.out.println(pilha);
        System.out.println(pilha.tamanho());
    }
}
