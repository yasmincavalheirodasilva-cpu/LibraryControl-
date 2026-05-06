public class Livro {
    String nome;
    String autor;
    int paginas;

    public Livro(String nome, String autor, int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.paginas = paginas;
 
   }
   public void MostrarInformacoes() {

    System.out.println("Digite o nome do livro: " + this.nome);
    System.out.println("Digite o nome do autor: " + this.autor);
    System.out.println("Digite o numero de paginas do livro: " + this.paginas);
   }
}
