package fundamentos;

public class TiposPrimitivos {
    public static void main (String[]args){
        // Tipos numéricos inteiros
        byte anosDeEmpresa = 32;
        short numerosDeVoo = 234;
        int id = 874;
        long pontosAcumulados = 3_347_653_45L;
        System.out.println(anosDeEmpresa);
        System.out.println(numerosDeVoo);
        System.out.println(id);
        System.out.println(pontosAcumulados);


        // Tipos numéricos reais
        float salario = 1_000_000F;
        double vendasAcumuladas = 23_985_874L;
        System.out.println(salario);
        System.out.println(vendasAcumuladas);


        //Tipo Booleano
        boolean estaDeFerias = false; // true -> verdadeiro ou falso
        System.out.println(estaDeFerias);
        // Tipo caractere
        char status = 'A'; // ativo
        System.out.println(status);

    }
}
