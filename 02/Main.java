class Pessoa {
    int idade;
    String nome;

    Pessoa (String nome, int idade) {
        this.idade = idade;
        this.nome = nome;
    }

    void fazerAniversario() {
        ++this.idade;
    }

    int lerIdade() {
        return this.idade;
    }
}

public class Main {
    public static void main(String[] args) {
        Pessoa maria = new Pessoa("Maria", 20);
        maria.fazerAniversario();
        maria.fazerAniversario();

        System.out.println(String.format("Maria tem %d anos", maria.lerIdade()));
    }
}
