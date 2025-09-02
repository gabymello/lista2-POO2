
package exercicio3;

public class Exercicio3 {

    
    public static void main(String[] args) {
       Carro carro = new Carro();
        carro.marca = "Toyota";
        carro.modelo = "Corolla";
        carro.ano = 2022;
        carro.velocidade = 0;

        carro.acelerar(50);
        System.out.println("Velocidade atual: " + carro.velocidade);

        carro.desacelerar(20);
        System.out.println("Velocidade atual: " + carro.velocidade);
    }
}
    
    

