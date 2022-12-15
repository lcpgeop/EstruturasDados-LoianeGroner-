package comX.loiane.estruturadados.pilhas;

import comX.loiane.estruturadados.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha() {
        super();
    }
    public Pilha(int capacidade) {
        super(capacidade);
    }

    public void empilha(T elemento) {
        super.adiciona(elemento);

//Embora o código abaixo faça tudo que é necessário, ele representa a REINVENÇÃO DA RODA
//pois repete o método adiciona(T elemneto), da super classe... logo pode ser refatorado
//conforme o código acima...
/*         super.aumentaCapacidade();

        super.elementos[super.tamanho] = elemento;
        super.tamanho++;
 */
    }

    public T topo(){
        if(!super.isEmpty()){
            return this.elementos[tamanho-1];
        }

        return null;
    }

    public T desempilha(){
        if(super.isEmpty()){
            return null;
        }
        /*este código teria o mesmo efeito do código no comentário 2...
         T elemento = this.elementos[tamanho - 1] ;
         tamanho--;
         return this.elementos[tamanho-1];
         */
        /*
         Comentário 2... este é o código sugerido no curso 
         (LoianeGroner-Algoritmo e Estrutura de dados) 
         return this.elementos[--tamanho];
         */

         //Vou tentar outro código, pois não me agrada deixar o valor
         //deletado na memória...
         T elemento = this.elementos[tamanho - 1] ;
         this.elementos[tamanho - 1] = null;
         tamanho--;
         return elemento;

    }

}
