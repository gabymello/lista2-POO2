
package exercicio3;


public class Carro {
   String marca;
    String modelo;
    int ano;
    int velocidade;

    void acelerar(int valor) {
        velocidade += valor;
    }

    void desacelerar(int valor) {
        if (velocidade - valor >= 0) {
            velocidade -= valor;
        } else {
            velocidade = 0;
        }
    }
} 
