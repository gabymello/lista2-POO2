
package exercicio2;


public class Exercicio2 {

    
    public static void main(String[] args) {
      ContaBancaria conta = new ContaBancaria();
        conta.titular = "Gaby";
        conta.numeroConta = 1987;
        conta.saldo = 1000;

        conta.depositar(200);
        conta.sacar(100);
        conta.sacar(700);

        System.out.println("Saldo final: " + conta.saldo);
    }
}
    
    

