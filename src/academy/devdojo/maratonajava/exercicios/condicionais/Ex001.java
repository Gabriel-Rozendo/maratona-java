package academy.devdojo.maratonajava.exercicios.condicionais;

import java.util.Scanner;

/**
 * 🟢 Fácil – “Verificador de maioridade”
 *
 * Peça ao usuário sua idade e use um if para mostrar se ele é maior ou menor de idade.
 *
 * 📌 Dica: Use Scanner para receber a entrada e if/else para a lógica.
 */

public class Ex001 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idadeUsuario = scanner.nextInt();

        if (idadeUsuario > 0) {
            if (idadeUsuario >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        } else {
            System.out.println("Idade inválida");
        }

        scanner.close();
    }
}
