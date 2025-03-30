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
    }
}
