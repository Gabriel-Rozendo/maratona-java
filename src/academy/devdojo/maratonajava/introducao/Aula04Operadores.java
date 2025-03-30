package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        //Operadores Aritmeticos: + - / * %
        double numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        int resto = 19 % 2;
        System.out.println(resto);

        if (resto == 0) {
            System.out.println("Número PAR");
        } else {
            System.out.println("Número ÍMPAR");
        }

        //Operadores relacionais: < <= > >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);

        // Operadores lógicos: AND (&&) / OR (||) / NOT (!)

        int idade = 29;
        double salario = 3500;

        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario > 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);

        // Operadores de Atribuição: =  +=  -=  *=  /=  %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // Incremento: ++
        // Decremento: --

        int contador = 0;
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);
    }
}
