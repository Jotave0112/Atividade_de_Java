import java.sql.SQLOutput;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {

        double saldo = 500.50;
        double deposito = 350.25;
        double saque = 150.75;
        saldo = saldo + deposito;
        System.out.println("Deposito: " + saldo);
        saldo = saldo - saque;
        System.out.print("Saque: " + saldo);


    }
}
