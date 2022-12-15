package comX.loiane.estruturadados.vetor.teste;

import comX.loiane.estruturadados.vetor.VetorObject;
import comX.loiane.estruturadados.vetor.entities.Contato;

public class Aula10 {
    public static void main(String[] args) {
        
        Contato c1 = new Contato("Contato 1", "tel 1", "email1@email.com");
        Contato c2 = new Contato("Contato 2", "tel 2", "email2@email.com");
        Contato c3 = new Contato("Contato 3", "tel 3", "email3@email.com");
        Contato c4 = new Contato("Contato 4", "tel 4", "email4@email.com");
        Contato c5 = new Contato("Contato 5", "tel 5", "email5@email.com");
        Contato c6 = new Contato("Contato 5", "tel 5", "email5@email.com");

        VetorObject vetor = new VetorObject(10);

        vetor.adiciona("B");
        vetor.adiciona(c5);
        vetor.adiciona(5.5);
        vetor.adiciona(c1);
        vetor.adiciona("G");
        vetor.adiciona(3);
        vetor.adiciona(c3);
        vetor.adiciona("J");
        vetor.adiciona(c4);
        vetor.adiciona("H");
        vetor.adiciona(c2);
        
        System.out.println(vetor);
        vetor.remove(c4);
        System.out.println(vetor);

        int pos = vetor.busca(c6);
        if(pos > -1){
            System.out.println("Found");
        } else {
            System.out.println("Lost");
        }
    }
    
}
