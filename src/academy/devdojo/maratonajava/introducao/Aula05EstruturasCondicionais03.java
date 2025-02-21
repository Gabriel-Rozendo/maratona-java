package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        // Doar se salário for maior que 5000
        double salario = 6000;

        // Usando o operador ternário
        String mensagemDoar = (salario > 5000) ? "Vou doar R$ 500,00" : "Ainda não tenho condições";

        System.out.println(mensagemDoar);
    }
}
