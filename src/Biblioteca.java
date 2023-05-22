import java.util.ArrayList;

public class Biblioteca {
    private Livro livro;

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public ArrayList<Livro> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Livro> catalogo) {
        this.catalogo = catalogo;
    }
    
    
    ArrayList<Livro> catalogo = new ArrayList<>();

    public void adicionarLivro(Livro livro){
        this.catalogo.add(livro);

    }

    public void mostrarLivrosDisponiveis(){
        
        if (catalogo.isEmpty()){
            System.out.println("Não existe esse livro no catálogo");
        } else {
        }
        System.out.println("______Lista de Livros/Revistas______");
        for(Livro elmentoLivro:this.catalogo){
            
            System.out.println(elmentoLivro.pegarTitulo());
        }
        System.out.println("__________________________________________________");
    }

    public void emprestarlivro(String titulo){
        for (Livro elementoLivro: this.catalogo){
            if(titulo.equals(elementoLivro.pegarTitulo())){
                if(elementoLivro.estaEmprestado()){
                    System.out.println("");
                    System.out.println("Sentimos muito, esse livro/revista "+titulo+" não esta disponível.");
                
                }
                else{
                    elementoLivro.livroAlugado();
                    System.out.println("");
                    System.out.println("Parabéns e uma boa leitura do Livro/Revista " +titulo);
                }
            }

            }
            
 
    }


}
