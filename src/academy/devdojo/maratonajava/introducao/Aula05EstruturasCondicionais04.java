package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

        double salarioAnual = 25000;
        double primeiraFaixa = 9.7 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.5 / 100;
        double valorDoImposto;

        if (salarioAnual <= 34712) {
            valorDoImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual <= 68587) {
            valorDoImposto = salarioAnual * segundaFaixa;
        } else {
            valorDoImposto = salarioAnual * terceiraFaixa;
        }

        System.out.println(salarioAnual);
        System.out.println(valorDoImposto);
    }
}
