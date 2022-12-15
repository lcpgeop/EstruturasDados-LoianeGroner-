package comX.loiane.estruturadados.pilhas.teste;

import java.util.Stack;

import comX.loiane.estruturadados.pilhas.Pilha;

public class Aula18 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack);
        
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack);


        Stack<String> stack2 = new Stack<>();

        stack2.push("Luiz");
        stack2.push("Carlos");
        stack2.push("Pereira");
        System.out.println(stack2.isEmpty());
        System.out.println(stack2.size());
        System.out.println(stack2);
        
        System.out.println(stack2.peek());
        System.out.println("Deletando: " + stack2.pop());
        System.out.println(stack2.peek());
        System.out.println(stack2);
        stack2.push("João");
        System.out.println(stack2);



    }
}
