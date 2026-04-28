import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v1, v2, v3;

//possivel escrever assim para numeros inteiros
        System.out.println("Digite o primeiro valor: ");
        v1 = sc.nextInt();
        v2 = sc.nextInt();
        v3 = sc.nextInt();

        if ( v1 != v2 && v1 != v3 && v2 != v3 ){
            if ( v1 < v2 && v1 < v3){
                System.out.println("O menor valor é o: " + v1);
            } else if ( v2 < v3 ){
                System.out.println("O menor valor é o: " + v2);
            } else {
                System.out.println("O menor valor é o: " + v3);
            }
        } else {
            System.out.println("Os valores devem ser diferentes! ");
        }

    }
}
