package ex8_19;

public class Main {
    public static void main(String[] args) {
        // Criando um livro da biblioteca
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca(300, "J.K. Rowling", false);
        System.out.println("Livro da biblioteca:");
        System.out.println("Autor: " + livroBiblioteca.getAutor());
        System.out.println("Páginas: " + livroBiblioteca.getPag());
        System.out.println("Está emprestado? " + livroBiblioteca.isEmprestado());

        // Emprestando o livro
        livroBiblioteca.pegarEmprestado();
        System.out.println("Está emprestado? " + livroBiblioteca.isEmprestado());

        // Tentando emprestar novamente
        livroBiblioteca.pegarEmprestado();

        // Devolvendo o livro
        livroBiblioteca.devolver();
        System.out.println("Está emprestado? " + livroBiblioteca.isEmprestado());

        // Criando um livro da livraria
        LivroLivraria livroLivraria = new LivroLivraria(250, "George Orwell", false);
        System.out.println("\nLivro da livraria:");
        System.out.println("Autor: " + livroLivraria.getAutor());
        System.out.println("Páginas: " + livroLivraria.getPag());
        System.out.println("Está vendido? " + livroLivraria.isVendido());

        // Vendendo o livro
        livroLivraria.vender();
        System.out.println("Está vendido? " + livroLivraria.isVendido());

        // Tentando vender novamente
        livroLivraria.vender();
    }
}
