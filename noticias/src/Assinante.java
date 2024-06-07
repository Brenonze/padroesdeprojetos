public class Assinante implements Observador {
    private String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println(nome + " recebeu a notícia: " + noticia);
    }
}
