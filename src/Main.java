import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Declara as variaveis
        String sinopse;
        int ano = 1993;
        double notaDoFilme = 9.90;
        boolean incluidoNoPlano = true;
        double media = (10 + 8.0 + 9.0) /2;
        int classificacao;

        //  Insere conteudo das variaveis
        sinopse = "The word is your";
        classificacao = (int) (media /2);

        // Exibe resultados
        System.out.println("Esse é o Movile");
        System.out.println("Filme: Scarface");
        System.out.println("Ano de lançamento: "+ ano);
        System.out.println("Classificação: " + classificacao);
        System.out.println(sinopse + ano);

    }
}