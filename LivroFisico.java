public class LivroFisico extends Livro{
    private int numPaginas;

    /* Construtors */
    public LivroFisico(String titulo, int anoPublicacao, int numPaginas){
        super(titulo, anoPublicacao);
        this.numPaginas = numPaginas;
    }

    public LivroFisico(String titulo, int anoPublicacao, int numPaginas, Autor autor){
        super(titulo, anoPublicacao, autor);
        this.numPaginas = numPaginas;
    }

    /* Getters */
    public int getNumPaginas(){
        return numPaginas;
    }

    /* Setters */
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Livro - Titulo: " + getTitulo() + " Ano: " + getAnoPublicacao() + " Numero de paginas: " + numPaginas);
        System.out.println("Autor: " + getAutor().getNome() + " Nacionalidade: " + getAutor().getNacionalidade() + '\n');
    }
}