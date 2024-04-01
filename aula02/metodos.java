package aula02;

public class metodos {
    static void meuMetodo() {
        System.out.println("Assim que funciona um metodo:");
    }
    // Static define que esse metodo pertence a classe main e nao é
    // Objeto. Void significa que o metodo nao vai ter um retorno.
    
    static void meuMetodoComParametros(String nome, int idade) {
        System.out.println(nome + "tem" + idade);
    }

    public static void main(String[] args) {
        meuMetodo();
        meuMetodoComParametros("Joao " ,  36);
    }
}

