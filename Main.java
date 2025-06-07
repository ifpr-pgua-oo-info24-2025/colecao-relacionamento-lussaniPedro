public class Main {
    public static void main(String[] args) {
        Autor autor1 = new Autor("Myamoto Musashi", "Japones");
        LivroFisico livro1 = new LivroFisico("O livro dos cinco aneis", 1645, 128, autor1);

        Autor autor2 = new Autor("Miguel Cervantes", "Espanhol");
        LivroDigital livro2 = new LivroDigital("Dom Quixote", 1645, 3.9, autor2);

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}