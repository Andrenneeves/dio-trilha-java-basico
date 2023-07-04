import java.util.Scanner;

public class Main {
    //Variáveis Globais
    String agencia;
    int conta;
    String nomeDoCliente;
    double saldo = 1050;


    public void main(String[] args) {
        //Scanenr para dar entrada no texto e iniciando um scanner
        Scanner banco = new Scanner(System.in);

        //Inicio da entrada de informações
        System.out.println("Hello Client!");
        System.out.println("Digite o número de sua agência");
        agencia = banco.nextLine();
        System.out.println("Digite o número de sua conta");
        conta = banco.nextInt();
        System.out.println("Digite o seu nome");
        nomeDoCliente = banco.nextLine();
        //Saída final das informações
        System.out.println("Olá, " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta " + conta + ", e seu saldo " + saldo +
                " já está disponível na sua conta para saque");


    }
}