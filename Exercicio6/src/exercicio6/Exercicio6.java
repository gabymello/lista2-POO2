
package exercicio6;


public class Exercicio6 {

   
    public static void main(String[] args) {
        Contador c = new Contador();
        c.valor = 0;

        c.incrementar();
        c.incrementar();
        c.decrementar();

        System.out.println("Valor final: " + c.valor);
    }
    
}
