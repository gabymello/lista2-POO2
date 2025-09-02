
package exercicio5;


public class Exercicio5 {

    
   
    public static void main(String[] args) {
         Retangulo r = new Retangulo();
        r.largura = 6;
        r.altura = 3;

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}

