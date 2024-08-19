import java.util.Scanner;

public class Questao19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Primeira Nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Segunda Nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Terceira Nota: ");
        double nota3 = entrada.nextDouble();

        System.out.print("Quarta Nota: ");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);

    }
}
