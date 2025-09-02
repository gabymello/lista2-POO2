
package exercicio4;


public class Exercicio4 {

    
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.titulo = "O Senhor dos Anéis";
        livro.autor = "J.R.R. Tolkien";
        livro.paginas = 600;
        livro.exemplares = 1;

        livro.emprestar();
        livro.emprestar();
        livro.devolver();

        System.out.println("Exemplares disponíveis: " + livro.exemplares);
    }
}
    
