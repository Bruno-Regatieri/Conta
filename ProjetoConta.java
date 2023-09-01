package poo;

import java.util.Scanner;

public class ProjetoConta {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Conta c1, c2;
        c1 = new Conta();
        c2 = new Conta();

        c1.titular = "Maria";
        c1.numero = 1234;
        c1.saldo = 1000;

        c2.titular = "Ze da Silva";
        c2.numero = 5678;
        c2.saldo = 500.0;

        c1.consultarSaldo();
        c2.consultarSaldo();
        
        System.out.println("Agora vou transferir");
        
        c1.transferir (c2, 1200);
        
        c1.consultarSaldo();
        c2.consultarSaldo();
        
        System.out.println("A conta " + c1.numero + " é da(o) " + c1.titular + " e ela(o) tem " + c1.saldo + " de saldo em sua conta. ");

        c1.consultarSaldo();

        System.out.println("Qual o valor a ser sacado?");
        double s = teclado.nextDouble();
        boolean saquei = c1.sacarValor(s);
        if (saquei) {
            System.out.println("Saldo sacado com sucesso");
        } else {
            System.out.println("Saque não efetuado");
        }

        System.out.println("Qual o valor a ser depositado?");
        double d = teclado.nextDouble();
        c1.depositarValor(d);

    }
}
