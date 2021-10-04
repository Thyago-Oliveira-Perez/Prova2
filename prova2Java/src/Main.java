import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Filme filme1 = new Filme();
        Filme filme2 = new Filme();
        CategoriaDeFilmes categoria1 = new CategoriaDeFilmes();

        List<Filme> listaDeFilmes = new ArrayList<Filme>();

        categoria1.setNome("Drama");

        filme1.setNome("Romeu e Julieta");
        filme1.setDuracao(2);

        filme2.setNome("Homem-Aranha");
        filme2.setDuracao(3);

        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        categoria1.setListaDeFilmes(listaDeFilmes);

        System.out.println(filme1);
        System.out.println(categoria1);
    }

}
