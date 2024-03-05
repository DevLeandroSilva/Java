package fundamentos;

import java.util.Locale;
import java.util.Scanner;
public class Console{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Escreva seu nome:");
        String nome = entrada.nextLine();
        System.out.print("Escreva se sobrenome:");
        String sobrenome = entrada.nextLine();
        System.out.print("Digite sua idade:");
        String idade = entrada.nextLine();
        System.out.print("Digite seu CPF, sem espaços ou caracteres especiais:");
        String cpf = entrada.nextLine();
        System.out.print("Digite seu endereço");
        String endereco = entrada.nextLine();
        System.out.println("Seu nome é " + nome.toUpperCase() +" "+ sobrenome.toUpperCase());
        System.out.println("Sua idade é:" +" "+idade);
        System.out.println("Seu CPF é:" +" "+ cpf);
        System.out.println(endereco);
        entrada.close();
    }
}
