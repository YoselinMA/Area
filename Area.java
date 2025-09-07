import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        float pi = (float) 3.1416;
        System.out.println("Ingresa el radio del primer circulo");
        a = sc.nextInt();
        float area = pi * a * a;
        System.out.println("El area del primer circulo es ="+ area);
        
        System.out.println("Ingresa el radio del segundo circulo");
        b = sc.nextInt();
        float are = pi * b * b;
        System.out.println("El area del segundo circulo es = "+ are);

        System.out.println("Ingresa el radio del tercer circulo");
        c = sc.nextInt();
        float ar = pi * c * c;
        System.out.println("El area del tercer circulo es = "+ ar);
        } 
}