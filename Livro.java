public class Livro {
    private String titulo;
    private int anoPublicacao;
    private Autor autor;

    /* Constructors */
    public Livro(String titulo, int anoPublicacao, Autor autor){
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autor = autor;
    }

    public Livro(String titulo, int anoPublicacao){
        this(titulo, anoPublicacao, null);
    }

    /* Getters */
    public String getTitulo(){
        return titulo;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    public Autor getAutor(){
        return autor;
    }

    /* Setters */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    /* Methods */
    public void exibirDetalhes(){
        System.out.println("Livro - Titulo: " + titulo + " Ano: " + anoPublicacao);
        System.out.println("Autor: " + autor.getNome() + " Nacionalidade: " + autor.getNacionalidade() + '\n');
    }
}