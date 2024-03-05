package fundamentos.Operadores;

public class DesafioLogico {
    public static void main(String[] args) {
       //Trabalho na Terça-Feira ou na Quinta-Feira

       boolean trabalho1 = true;
       boolean trabalho2 = true;

       boolean comprouTV50 = trabalho1 && trabalho2;
       boolean comprouTV32 = trabalho1 ^ trabalho2;
       boolean comprouSorvete = trabalho1 || trabalho2;
       boolean maisSaudavel = trabalho1 || trabalho2;

        System.out.println("Comprou TV de 50?\n"  + comprouTV50);
        System.out.println("Comprou TV de 32?\n"  + comprouTV32);
        System.out.println("Comprou sorvete?\n"  + comprouSorvete);
        System.out.println("Mais saudável?\n"  + maisSaudavel);

    }
}
