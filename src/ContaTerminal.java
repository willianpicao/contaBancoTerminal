import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor digite o numero da Conta!");
        Integer numero = sc.nextInt();

        System.out.println("Por favor digite o numero da Agencia!");
        String agencia = sc.next();

        System.out.println("Digite o seu Nome");
        String nome = sc.next();

        System.out.println("Isira saldo inicial da conta");
        Double saldo = sc.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua Agencia é " +agencia  + ", Conta " + numero + " e seu Saldo "+ saldo +" disponivel para saque");
    }
}
