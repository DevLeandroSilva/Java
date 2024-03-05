package fundamentos;
import java.util.Scanner;
import java.util.Locale;
public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner salario = new Scanner(System.in);

        System.out.println("Digite seu primeiro salário:");
        String primeiroSalario = salario.nextLine().replace(",",".");

        System.out.println("Digite o seu segundo salário:");
        String segundoSalario = salario.nextLine().replace(",",".");

        System.out.println("Digite o seu terceiro salário:");
        String terceiroSalario = salario.nextLine().replace(",",".");

        double salario01 = Double.parseDouble(primeiroSalario);
        double salario02 = Double.parseDouble(segundoSalario);
        double salario03 = Double.parseDouble(terceiroSalario);

        double mediaSalarial = (salario01 + salario02 + salario03)/3;
        System.out.println("A média salarial é: "+ mediaSalarial + " reais");

        salario.close();
    }
}