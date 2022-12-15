package comX.loiane.estruturadados.Filas.teste;

import comX.loiane.estruturadados.Filas.Fila;

public class Aula20 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println(fila);

    }
}
