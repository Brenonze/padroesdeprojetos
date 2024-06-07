public interface Sujeito {
    void inscrever(Observador observador);
    void desinscrever(Observador observador);
    void notificar();
}
