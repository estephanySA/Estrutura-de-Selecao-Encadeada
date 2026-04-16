import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String turno;

        System.out.println("Qual o seu turno? ");
        turno = sc.next();

        if (turno.equalsIgnoreCase("manha")){
            System.out.println("7h ás 12h");
        }
        else if (turno.equalsIgnoreCase("tarde")) {
            System.out.println("13h ás 18h");
        }
        else if (turno.equalsIgnoreCase("noite")) {
            System.out.println("19h ás 23h");
        }
        else {
            System.out.println("Turno inválido");
        }

    }
}
