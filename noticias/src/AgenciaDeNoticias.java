import java.util.ArrayList;
import java.util.List;

public class AgenciaDeNoticias implements Sujeito {
    private List<Observador> observadores = new ArrayList<>();
    private String noticia;

    @Override
    public void inscrever(Observador observador) {
        observadores.add(observador);
    }

    @Override
    public void desinscrever(Observador observador) {
        observadores.remove(observador);
    }

    public void definirNoticia(String noticia) {
        this.noticia = noticia;
        notificar();
    }

    @Override
    public void notificar() {
        for (Observador observador : observadores) {
            observador.atualizar(noticia);
        }
    }
}
