package comX.loiane.estruturadados.Filas;

import comX.loiane.estruturadados.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
        super();
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileirar(T elemento){
        //ASSIM:
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;
        //OU ASSIM:
        //this.elementos[this.tamanho++] = elemento;
        //
        //MAS NA VERDADE SERÁ ASSIM:
        super.adiciona(elemento);
    }

}
