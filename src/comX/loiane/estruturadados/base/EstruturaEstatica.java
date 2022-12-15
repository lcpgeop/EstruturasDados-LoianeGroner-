package comX.loiane.estruturadados.base;

public class EstruturaEstatica<T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica() {
        this(10);
    }

    public boolean isEmpty() {
        return this.tamanho == 0;
    }

    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    protected boolean adiciona(T elemento) {

        this.aumentaCapacidade();

        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(T elemento, int posicao) {

        if (!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida!!");
        }

        this.aumentaCapacidade();

        // Algoritmo para mover elementos uma posição no vetor
        for (int i = this.tamanho - 1; i >= posicao; i--) {
            this.elementos[i + 1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    @SuppressWarnings("unchecked")
    //foi alterado para protected porque iria ser utilizado na classe Pilha, mas
    //como agora, foi introduzida uma chamada, na classe Pilha, para o método, adiciona()
    //que está nesta classe (super classe de Pilha), e sendo assim vai haver uma chamada 
    //intraClasse ao método aumentaCapacidade(), que será chamado pelo método local adiciona(,
    //e não mais por um método da classe pilha, podemos então devolver o Modificador de Acesso
    //PRIVATE para este método... 
    //protected void aumentaCapacidade() {
    private void aumentaCapacidade() {
        if (this.tamanho == this.elementos.length) {
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < this.tamanho; i++) {
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        // solução com StringBuilder
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }

}
