package fundamentos;

import java.util.Scanner;
public class Import {
    public static void main(String[] args) {
        Scanner pessoa = new Scanner(System.in);
        System.out.print("Qual a idade da pessoa?");
        String idade = pessoa.nextLine();
        System.out.println(idade);

        System.out.print("Qual o nome da pessoa?");
        String nome = pessoa.nextLine();
        System.out.println(nome);

        if (pessoa == pessoa){
            System.out.println("igual");

        }
        else{
            System.out.println("diferente");
        }
    }
}
