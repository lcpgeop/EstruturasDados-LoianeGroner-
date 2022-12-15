package comX.loiane.estruturadados.pilhas.teste;

import comX.loiane.estruturadados.pilhas.Pilha;

public class Aula15 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        if(pilha.isEmpty()){
            System.out.println("Não está PILHADA!!!");
        } else{
            System.out.println("PILHADONA!!!");
        }
        System.out.println(pilha);
        System.out.println(pilha.tamanho());
        System.out.println();
        System.out.println("+---------------------------------------------------------+");
        System.out.println();
        for(int i = 1; i <= 10; i++){
            pilha.empilha(i);
        }
        
        if(pilha.isEmpty()){
            System.out.println("Não está PILHADA!!!");
        } else{
            System.out.println("PILHADONA!!!");
        }
        System.out.println();
        System.out.println("+---------------------------------------------------------+");
        System.out.println();
        System.out.println(pilha);
        System.out.println();
        System.out.println(pilha.tamanho());
    }
}
