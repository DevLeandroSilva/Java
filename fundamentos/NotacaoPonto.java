package fundamentos;

public class NotacaoPonto{
    public static void main(String[] args) {
        double a =  2.3;
        String s = "Bom dia X";
       s = s.replace("X","Senhora");
       s = s.concat(" tudo bem?");
       s =  s.toUpperCase();
       s = "Bom dia senhora Madalena".toUpperCase();
        System.out.println("Essa frase tem "+ s.length() + " "+"letras");
        System.out.println(s);
        System.out.println(a);
    }
}
