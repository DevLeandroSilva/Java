package fundamentos.Operadores;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        //Scanner aluno = new Scanner(System.in);
        //System.out.println("Qual a média do aluno?");
        //String media = aluno.nextLine();

        double media = 6.1;
        String resultadoRecuperacao = media >= 5.0? "em recuperação":"reprovado";
        String resultado = media >=7.0? "Aprovado":"Reprovado";

        System.out.println("O aluno está " + resultado);
        System.out.println(args);

    }
}
