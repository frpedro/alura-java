import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        // Chama metodo scanner para leitura de dados
        Scanner gettin = new Scanner(System.in);

        // Busca resposta string
        System.out.println("Digite o filme que está inserindo: ");
        String buscaFilme  = gettin.nextLine();

        // Busca resposta int
        System.out.println("Digite o ano do lançamento");
        int anoDeLancamento = gettin.nextInt();

        // Busca resposta double
        System.out.println("Avalie o filme de 0 a 10: ");
        double avaliation = gettin.nextDouble();

        // Exibe resultados
        System.out.println("Confirme os dados");
        System.out.println(anoDeLancamento);
        System.out.println(avaliation);
        System.out.println(buscaFilme);

    }
}
