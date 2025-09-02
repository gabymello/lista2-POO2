
package exercicio7;


public class Exercicio7 {

    
    public static void main(String[] args) {
        Estudante e = new Estudante();
        e.nome = "Gaby";
        e.idade = 17;

        e.adicionarDisciplina("Química");
        e.adicionarDisciplina("Programação");
        e.adicionarDisciplina("Banco de Dados");

        e.exibirDisciplinas();
    }
}
 
