import java.util.ArrayList;
import java.util.List;

public class CategoriaDeFilmes {

    private String nome;

    List<Filme> listaDeFilmes = new ArrayList<Filme>();

    public CategoriaDeFilmes() {
    }

    public CategoriaDeFilmes(String nome, List<Filme> listaDeFilmes) {
        this.nome = nome;
        this.listaDeFilmes = listaDeFilmes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Filme> getListaDeFilmes() {
        return listaDeFilmes;
    }

    public void setListaDeFilmes(List<Filme> listaDeFilmes) {
        this.listaDeFilmes = listaDeFilmes;
    }

    @Override
    public String toString() {
        return "CategoriaDeFilmes{" +
                "nome='" + nome + '\'' +
                ", listaDeFilmes=" + listaDeFilmes +
                '}';
    }
}
