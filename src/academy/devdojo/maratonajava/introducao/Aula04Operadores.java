package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        // Operadores aritmeticos: + - * / %

        int numero1 = 10;
        int numero2 = 20;

        System.out.println(numero2 + numero1);

        int resto = 21 % 2; // Se o resto for 0 o número é par
        System.out.println(resto);


        // Operadores relacionais: < / > / <= / >= / == / !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezDiferenteDeVinte = 10 != 20;

        System.out.println("isDezMaiorQueVinte: " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte: " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte: " + isDezIgualAVinte);
        System.out.println("isDezDiferenteDeVinte: " + isDezDiferenteDeVinte);

        // Operadores lógicos: &&(AND) ||(OR) !(NOT)

        int idade = 35;
        double salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta: " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta: " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        double valorPlaystation = 5000;

        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystation || valorTotalContaPoupanca >= valorPlaystation;

        System.out.println("isPlaystationCincoCompravel: " + isPlaystationCincoCompravel);

        // Operadores de atribuição: = += -= *= /= %=

        double bonus = 1800;
        bonus += 1000;

        System.out.println("bonus: " + bonus);

        // Incremento e decremento ++ --
        int contador = 0;
        contador++;
        contador--;
        System.out.println(++contador);
    }
}
