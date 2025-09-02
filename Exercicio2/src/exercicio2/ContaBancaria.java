
package exercicio2;


public class ContaBancaria {
 String titular;
    double saldo;
    int numeroConta;

    void depositar(double valor) {
        saldo += valor;
    }

    void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}   

