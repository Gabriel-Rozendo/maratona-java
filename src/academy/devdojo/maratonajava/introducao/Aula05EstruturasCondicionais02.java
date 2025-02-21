package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria juvenil
        // idade >= 15 e idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 5;
        String categoria = "";

        if (idade != 0) {
            if (idade < 15) {
                categoria = "Categoria infantil";
            } else if (idade < 18) {
                categoria = "Categoria juvenil";
            } else {
                categoria = "Categoria adulta";
            }
        }

        System.out.println(categoria);
    }
}
