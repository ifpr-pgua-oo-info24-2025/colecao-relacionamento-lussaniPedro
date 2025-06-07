public class LivroDigital extends Livro {
    private double tamanho;

    /* Constructors */
    public LivroDigital(String titulo, int anoPublicacao, double tamanho){
        super(titulo, anoPublicacao);
        this.tamanho = tamanho;
    }

    public LivroDigital(String titulo, int anoPublicacao, double tamanho, Autor autor){
        super(titulo, anoPublicacao, autor);
        this.tamanho = tamanho;
    }

    /* Getters */
    public double getTamanho(){
        return tamanho;
    }

    /* Setters */
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Livro - Titulo: " + getTitulo() + " Ano: " + getAnoPublicacao() + " Tamanho: " + tamanho + "MB");
        System.out.println("Autor: " + getAutor().getNome() + " Nacionalidade: " + getAutor().getNacionalidade() + '\n');
    }
}