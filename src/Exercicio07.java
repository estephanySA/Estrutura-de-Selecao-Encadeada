import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String login, senha;

        System.out.println("Digite seu login: ");
        login = sc.next();

        if(login.equals("admin")){
            System.out.println("Digite sua senha: ");
            senha = sc.next();
            if(senha.equals("fiap2026")){
                System.out.println("Acesso Liberado");
            }
            else{
                System.out.println("Senha Incorreta!");
            }
        }
        else {
            System.out.println("Usuário não encontrado!");
        }
    }
}
