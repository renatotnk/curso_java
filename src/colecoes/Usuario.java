package colecoes;

public class Usuario {
    String nome;

    Usuario(String nome){
        this.nome = nome;
    }

    public String toString(){
        return "Meu nome eh " + this.nome;
    }
}
