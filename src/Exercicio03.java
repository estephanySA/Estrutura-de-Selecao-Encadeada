import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c;
        double x1, x2, delta;


        System.out.println("Digite o valor do A ---> ");
        a = sc.nextDouble();




        if( a == 0 ){
            System.out.println("não é uma equação do segundo grau.");
        } else {
            System.out.println("Digite o valor do B---> ");
            b = sc.nextDouble();
            System.out.println("Digite o valor do C ---> ");
            c = sc.nextDouble();

            delta = b * b - 4 * a * c;

            if (delta <0) {
                System.out.println("a equação não tem raiz real");
            }
            else {
                x1 = (-b + Math.sqrt(delta))/(2 * a);
                x2 = (-b - Math.sqrt(delta))/(2 * a);
                System.out.printf("x1 = %.2f", x1);
                System.out.printf("x2 = %.2f", x2);
            }
        }


    }
}
