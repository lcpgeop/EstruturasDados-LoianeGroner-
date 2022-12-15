package comX.loiane.estruturadados.vetor;

import comX.loiane.estruturadados.base.EstruturaEstatica;

public class Lista<T> extends EstruturaEstatica<T> {

    //Esta classe representa uma refatoração da classe VetorGernerics.java
    //no curso a Profa. tinha chamado de Lista e depois fez o refactoring com
    //uma classe denominada Lista2.java, mas como eu tinha utilizado um nome
    //diferente, usei o nome Lista no meu refactoring...

    public Lista(int capacidade) {
        super(capacidade);
    }

    public Lista() {
        super();
    }

    public boolean adiciona(T elemento) {

        return super.adiciona(elemento);

    }

    public boolean adiciona(T elemento, int posicao) {

        return super.adiciona(elemento, posicao);

    }

    
    
}
