package fundamentos;

public class OperadorLogico {
    public static void main(String[] args) {
/*

    && ___ E
     V && V = V
     V && F = F
     F && V = F
     F && F = F

    || ___ OU
     V || V = V
     V || F = V
     F || V = V
     F || F = F

    XoR - FALSO OU EXCLUSIVO FALSO
     V || V = F
     V || F = V
     F || V = V

     !TRUE = FALSE
     !FALSE = TRUE

*/

        System.out.println("TABELA VERDADE && (AND)");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        System.out.println("");

        System.out.println("TABELA VERDADE || OU (OR)");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println("");

        System.out.println("Tebela VERDADE ^ OU EXCLUSIVO (XoR)");
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println("");
    }
}
