public class Revista extends Livro implements Acoes{

    private int edicao;

    public Revista(int edicao, String titulo, int totPaginas) {
        super(titulo, totPaginas);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean isEmprestado() {
        return emprestado;
    }

    @Override
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
  
}
