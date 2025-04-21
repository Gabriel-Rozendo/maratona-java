package academy.devdojo.maratonajava.exercicios.tiposprimitivos;

public class Ex002 {
    public static void main(String[] args) {

        String nomeDoProduto = "Arroz";
        int quantidadeEmEstoque = 0;
        double precoUnitario = 25.00;
        boolean isDisponivel = (quantidadeEmEstoque > 0) ? true : false;

        System.out.println("============ RESUMO ============");
        System.out.println("");
        System.out.println("Produto: " + nomeDoProduto);
        System.out.println("Quantidade: " + quantidadeEmEstoque);
        System.out.printf("Preço: R$ %.2f%n", precoUnitario);
        System.out.println("Está disponível? " + isDisponivel);

    }
}
