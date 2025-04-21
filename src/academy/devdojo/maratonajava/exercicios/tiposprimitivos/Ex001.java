package academy.devdojo.maratonajava.exercicios.tiposprimitivos;

/**
 * 🟢 Tarefa 1 - INICIANTE
 * Título: Cálculo simples de salário mensal
 * Descrição:
 * Você foi contratado como estagiário em uma empresa de RH. Sua primeira tarefa é criar um pequeno sistema que armazene
 * o valor da hora de trabalho de um funcionário (tipo float) e a quantidade de horas trabalhadas no mês (tipo int).
 * O sistema deve calcular e exibir o salário mensal (tipo float).
 *
 * Requisitos:
 *
 * Use os tipos primitivos corretos (float, int).
 *
 * Faça o cálculo e exiba o resultado no console com duas casas decimais.
 */

public class Ex001 {
    public static void main(String[] args) {

        float valorPorHora = 25.30F;
        int quantidadeDeHorasTrabalhadas = 200;
        float salarioMensal = valorPorHora * quantidadeDeHorasTrabalhadas;

        System.out.printf("Sálario mensal: R$ %.2f%n", salarioMensal);
    }
}
