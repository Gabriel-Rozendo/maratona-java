package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Gabriel";
        String endereco = "Av. América";
        double salario = 2000.00;
        String dataRecebimentoSalario = "20/02/2025";
        String mensagem = "Eu " + nome + ", " +
                "morando no endereço " + endereco +
                ", confirmo que recebi o salário de R$ " + salario +
                ", na dataRecebimento " + dataRecebimentoSalario;

        System.out.println(mensagem);
    }
}
