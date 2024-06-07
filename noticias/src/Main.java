import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgenciaDeNoticias agenciaDeNoticias = new AgenciaDeNoticias();

        Assinante assinante1 = new Assinante("Assinante 1");
        Assinante assinante2 = new Assinante("Assinante 2");
        Assinante assinante3 = new Assinante("Assinante 3");

        agenciaDeNoticias.inscrever(assinante1);
        agenciaDeNoticias.inscrever(assinante2);
        agenciaDeNoticias.inscrever(assinante3);

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Digite uma nova notícia (ou 'sair' para terminar):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("sair")) {
                break;
            }
            agenciaDeNoticias.definirNoticia(input);
        }

        scanner.close();
    }
}
