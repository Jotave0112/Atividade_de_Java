import java.util.Scanner;

public class Questao20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto voce ganha por hora? -- ");
        float porhora = entrada.nextFloat();

        System.out.print("Horas trabalhadas por mes: ");
        int trabalhadas = entrada.nextInt();

        float salariobr = 0;
        salariobr = porhora * trabalhadas;

        float ir = 0.11f;
        float ir2 = 0;
        float sindicato = 0.05f;
        float sind2 = 0;
        float inss = 0.08f;
        float inss2 = 0;
        ir = ir * salariobr;
        ir2 = salariobr - ir;
        sindicato = sindicato * salariobr;
        sind2 = salariobr - sindicato;
        inss *= salariobr;
        inss2 = salariobr - inss;
        float salariolq = 0;
        salariolq = (((salariobr - ir) - sindicato) - inss);
        System.out.println("Salario Bruto: " + salariobr);
        System.out.println("Salario com Imposto de renda: " + ir2);
        System.out.println("Salario com imposto sindical: " + sind2);
        System.out.println("Salario com imposto do inss: " + inss2);
        System.out.println("Salario Liquido: " + salariolq);



    }
}
