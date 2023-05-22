public class Main {
    public static void main(String[] args) {

        //Criando a Biblioteca
        Biblioteca novaBiblioteca = new Biblioteca();


        //Livros
        Livro l1 = new Livro("Le petit prince", 250 );
        Livro l2 = new Livro("LA tale of two cities",299);
        Livro l3 = new Livro("The lord of the rings",800);
        Livro l4 = new Livro("Mais um besteirol americano",100);
        Livro l5 = new Livro("Vademecum",900);
        Livro l6 = new Livro("Almas segas", 200);
        
        //Revistas
        Revista Playboy = new Revista(9,"Playboy",35);
        Revista r2 = new Revista(8, "Flor", 30);
        Revista r3 = new Revista(3, "Anime", 50);

        //Adicionando livro na bibioteca
        novaBiblioteca.adicionarLivro(l1);
        novaBiblioteca.adicionarLivro(l2);
        novaBiblioteca.adicionarLivro(l3);
        novaBiblioteca.adicionarLivro(l4);
        novaBiblioteca.adicionarLivro(l5);
        novaBiblioteca.adicionarLivro(l6);

        //Adicionando Revista
        novaBiblioteca.adicionarLivro(Playboy);
        novaBiblioteca.adicionarLivro(r2);
        novaBiblioteca.adicionarLivro(r3);
        
        
        
        //Mostro os Livros/Revistas Existente
        novaBiblioteca.mostrarLivrosDisponiveis();
        
        
        
        //Buscador do Livro/Revista    
        novaBiblioteca.emprestarlivro("Vademecum");
        
        //Verificando se o livro esta disponivel
        novaBiblioteca.emprestarlivro("Vademecum");
        
         System.out.println("__________________________________________________");
        
        // USANDO A INTERFACE PARA MANUSEAR O OBJETO LIVRO
        novaBiblioteca.emprestarlivro("Playboy");
        
        Playboy.abrir();
        Playboy.avancarPag();
        
        //foi para a pagina 34
        Playboy.folhear(34);
        Playboy.avancarPag();
        
        // Ultrapassou as paginas
        Playboy.avancarPag();
        
        
        //Outro livro
        novaBiblioteca.emprestarlivro("LA tale of two cities");
        l2.abrir();
        l2.avancarPag();
        l2.avancarPag();
        l2.voltarPag();
        l2.fechar();
 
    }

}