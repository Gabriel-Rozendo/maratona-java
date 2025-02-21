package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {

        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcoólica");
        } else {
            System.out.println("Não pode comprar bebida alcoólica");
        }


    }
}
