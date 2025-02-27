import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        // Chama metodo scanner para leitura de dados
        Scanner gettin = new Scanner(System.in);

        // Declara variaveis
        double media = 0;
        double nota = 0;

        // Pega 3 notas de avaliação
        for (int loop1 = 0; loop1 < 3; loop1++) {
            System.out.println("Avalie o filme de 0 a 5: ");
            nota = gettin.nextDouble();
            media += + nota;
        }

        // Exibe resultados e realiza a média
        System.out.println("Media de avaliações: " + media /3);

    }
}
