public class Condicional {
    public static void main(String[] args) {

        // Declara variaveis
        int ano = 1993;
        double notaDoFilme = 9.90;
        boolean incluidoNoPlano = true;
        String tipoPlano = "plus";

        // Realiza condição relacionada ao ano de lançamento
        if (ano >= 2024) {
            System.out.println("Lançamento Exclusivo!");
        }
        else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        // Realiza condição relacionada ao plano
        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Filme incluido no plano!"); }
        else {
                System.out.println("Você não tem acesso a esse conteudo devido a licença");
            }

    }
}
