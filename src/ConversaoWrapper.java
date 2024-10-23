import java.util.Scanner;

public class ConversaoWrapper {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite um número inteiro:");
        int numeroPrimitivo = scanner.nextInt();


        Integer numeroWrapper = Integer.valueOf(numeroPrimitivo);


        System.out.println("Valor primitivo: " + numeroPrimitivo);
        System.out.println("Valor wrapper: " + numeroWrapper);
    }
}