//Area triangulo
import java.lang.*;
import java.util.Scanner; //solo se toma scanner
public class Ejemplo3{
    public static void main(String[] args)
    {
        int a, b, c;
        double s, area;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrea los 3 lados: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        s = (a+b+c)/2;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("El area del triangulo es ="+area);
    }
}
