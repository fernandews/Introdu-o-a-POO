class Agenda {
    int count = 0;
    Contato[] contatos = new Contato[100];

    void adicionarContato (Contato contato) {
        contatos[count] = contato;
        ++count;
    }

    void imprimirAgenda () {
        for (int i = 0; i < count; ++i) {
            contatos[i].imprimirContato();
        }
    }
}

class Contato {
    String nome;
    String telefone;

    Contato (String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    void imprimirContato () {
        System.out.println(String.format("------ %s ------", this.nome));
        System.out.println(String.format("%s", this.telefone));
    }
}

public class AgendaTelefonica {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Contato cleiton = new Contato("Cleitinho", "22 99999-9999");

        agenda.adicionarContato(cleiton);

        agenda.imprimirAgenda();
    }
}