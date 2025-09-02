
package exercicio4;


public class Livro {
  String titulo;
    String autor;
    int paginas;
    int exemplares;

    void emprestar() {
        if (exemplares > 0) {
            exemplares--;
        } else {
            System.out.println("Nenhum exemplar disponível!");
        }
    }

    void devolver() {
        exemplares++;
    }
}  
