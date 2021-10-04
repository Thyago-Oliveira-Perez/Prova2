public class Filme {

    private String nome;
    private int duracao;


    public Filme() {
    }

    public Filme(String nome, int duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome(String nome) {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao(int duracao) {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", duracaoEmHoras=" + duracao +
                '}';
    }
}

