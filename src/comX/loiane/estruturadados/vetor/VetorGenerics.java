package comX.loiane.estruturadados.vetor;

import java.lang.reflect.Array;

public class VetorGenerics<T> {
    private T[] elementos;
    private int tamanho;

    //Solução sugerida pela Loaiane, cuja fonte é o livro:
    //Efective Java-Joshua Bloch... usa-se um Cast para o tipo 
    //Generic passado para a classe...
    public VetorGenerics(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //Solução, Alternativa, utilizando java.lang.reflect
    public VetorGenerics(int capacidade, Class<T> tipoClasse) {
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    /*
     * public void adiciona(T elemento) {
     * for(int i=0; i<this.elementos.length; i++){
     * if(this.elementos[i] == null){
     * this.elementos[i] = elemento;
     * break;
     * }
     * 
     * }
     * }
     */

    /*
     * public void adiciona(T elemento) throws Exception {
     * if (this.tamanho < this.elementos.length) {
     * this.elementos[this.tamanho] = elemento;
     * this.tamanho++;
     * } else {
     * throw new Exception("Inserção não permitida! Sem espaço no Vetor!!");
     * }
     * }
     */
    public boolean adiciona(T elemento) {

        this.aumentaCapacidade();
        
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(T elemento, int posicao) {

        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }

        this.aumentaCapacidade();
        
        //Algoritmo para mover elementos uma posição no vetor
        for(int i=this.tamanho-1; i>=posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }

        for(int i = posicao; i < this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
        this.elementos[this.tamanho] = null;
    }

    public void remove(T elemento){
        if(this.busca(elemento) > -1){
            remove(this.busca(elemento));
        } else {
            //faltou um estudo sobre tratamento de exceções...
            throw new IllegalArgumentException("Elemento não Encontrado!!");
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.tamanho; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    @Override
    public String toString() {

         // solução com StringBuilder
         StringBuilder s = new StringBuilder();
         s.append("[");

         for(int i=0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        //imprime todos as posições do array, mesmo as com valor nulo
        //return "Vetor [elementos=" + Arrays.toString(elementos) + "]";

        //código para iterar o array e imprimir apenas os valores não nulos
        //Simprão de tudo...
        /*
            T s = "[";
            for(int i=0; i < this.tamanho - 1; i++){
                s += this.elementos[i];
                s += ", ";
            }
            if (this.tamanho > 0){
                s += this.elementos[this.tamanho-1];
            }

            s += "]";
         
          
         */

         return s.toString();


    }

    public T busca(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!!");
        }
        return this.elementos[posicao];
    }

    public int busca(T elemento) {
        for(int i=0; i<this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }




//Vamos marcar a o fechamento da Classe
}
