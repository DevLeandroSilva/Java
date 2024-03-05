package fundamentos;

public class ConversorTemperatura {
public static void main (String []args){
    final double tempinfh = 32;
    final double tempconversor = (tempinfh - 32) * 5.0/9.0;
    System.out.println(tempinfh +" "+"graus em fahrenheit equivale a" + " "+ tempconversor + " "+"graus Celsius");
}
}
