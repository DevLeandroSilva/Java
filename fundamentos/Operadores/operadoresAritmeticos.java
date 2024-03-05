package fundamentos;

import java.util.Scanner;

    public class operadoresAritmeticos {
        public static void main(String[] args) {
           // Scanner operadores = new Scanner(System.in);
           // System.out.println("Digite o primeiro numero:");
          //  String numero1 = operadores.nextLine().replace(",",".");

          //  System.out.println("Digite o segundo número:");
           // String numero2 = operadores.nextLine().replace(",",".");


           // double num1 = Double.parseDouble(numero1);
           // double num2 = Double.parseDouble(numero2);

           // double soma = num1 + num2;
           // System.out.println("A Soma de " +num1 +" e "+ num2+ " é igual a "+soma);

          //  double subtracao = num1 - num2;
          //  System.out.println("A Subtração de " +num1 +" e "+ num2+ " é igual a "+subtracao);

           // double multiplicacao = num1 * num2;
           // System.out.println("A Multiplicação de " +num1 +" e "+ num2+ " é igual a "+multiplicacao);

           // double numeroElevado = Math.pow(num1,num2);
           // System.out.println(numeroElevado);

            double numA = Math.pow(6*(3+2),2);
            double denA = 3*2;
            double superiorA = numA / denA;
            double numB = Math.pow(((1-5)*(2-7))/2,2);

            double superiorAB = Math.pow(superiorA - numB,3) ;
            double inferior = Math.pow(10,3);
            double resultado = superiorAB / inferior;

            System.out.println(resultado);





            //operadores.close();

        }



}
