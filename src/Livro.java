public class Livro implements Acoes{

    String titulo;
    boolean emprestado;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;

    
    public void livroAlugado(){
        this.emprestado = true;
    }

    public void livroDevolvido(){
        this.emprestado = false;
    }

    public boolean estaEmprestado() {
        return this.emprestado;
    }

    public String pegarTitulo(){
        return this.titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
  
    //construtor

    public Livro(String titulo, int totPaginas ){// Pessoa leitor){
        this.titulo = titulo;
        this.totPaginas = totPaginas;    
        this.aberto = false;
        this.pagAtual = 0;
       
    }
    
      //metodos especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void abrir() {
        this.aberto = true;
        //System.out.println("________________________________");
        System.out.println("O Livro " + this.titulo +" foi abeto");
    }

    @Override
    public void fechar() {
        this.aberto = false;
        System.out.println("O livro "+this.titulo+" foi dechado");
      
    }

    @Override
    public void folhear(int p) {
        
        if (p > this.getTotPaginas()){
            this.pagAtual = 0;
            System.out.println("Ultrapassou os limites de paginas!!");
           
        }else{
            
         this.pagAtual = p;
            System.out.println("O livro "+this.titulo+" foi folheado para a pag. "+this.pagAtual);
        }
    }

    @Override
    public void avancarPag() {
        if(this.aberto == true){
            if(this.pagAtual >= this.totPaginas){

                System.out.println("Ultrapassou os limites de paginas");


            }else{
                this.pagAtual++;
                System.out.println("Avancou uma pagina " +this.pagAtual);
            }
    }else{
            System.out.println("O livro "+this.titulo+ " esta fechado");
        }
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
        if(this.pagAtual <= 0){
            System.out.println("Ja esta no inicio do livro");
            //System.out.println("________________________________");
        }else{
            this.pagAtual--;
        
            }
    



    }
}