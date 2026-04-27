import java.util.Scanner;

public class AreaDelRectangulo {

    public void calcularArea() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una longitud en metros:");
        double base = sc.nextDouble();

        System.out.println("Introduzca una altura en metros:");
        double altura = sc.nextDouble();

        double area = base * altura;
        System.out.println("El area del rectangulo es: " + area);

        sc.close();
    }
}

