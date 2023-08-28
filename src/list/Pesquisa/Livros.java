package list.Pesquisa;

public class Livros {
  //atributos
  private String titulo;
  private String autor;
  private int anoPublicacao;

  //Construtor
  public Livros(String titulo, String autor, int anoPublicacao){
    this.titulo = titulo;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
  }

  //Getters
  public String getTitulo(){
    return titulo;
  }
  public String getAutor(){
    return autor;
  }
  public int getAnoPublicacao(){
    return anoPublicacao;
  }


  @Override
  public String toString() {
    return "Livro{" +
        "titulo='" + titulo + '\'' +
        ", autor='" + autor + '\'' +
        ", anoPublicacao=" + anoPublicacao +
        '}';
  }
}
