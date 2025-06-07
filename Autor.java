public class Autor {
    private String nome;
    private String nacionalidade;

    /* Constructor */
    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    /* Getters */
    public String getNome(){
        return nome;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }

    /* Setters */
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }
}