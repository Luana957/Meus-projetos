public class Emprestimo {
   private  TomadorEmprestimo tomadorEmprestimo;
   private ItemEmprestado itemEmprestado;
   private String  dataEmprestimo;
   private String dataDevolucao;
   
   

    public Emprestimo(String tomadorEmprestimo, String material, String dataEmprestimo, String dataDevolucao) {
        this.tomadorEmprestimo= tomadorEmprestimo;
        this.itemEmprestado = material;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public TomadorEmprestimo getPessoa() {
        return this.tomadorEmprestimo;
    }

    public void setPessoa(Pessoa pessoa) {
        this.tomadorEmprestimo = pessoa;
    }

    public ItemEmprestado getMaterial() {
        return this.itemEmprestado;
    }

    public void setMateriaç(ItemEmprestado itemEmprestado) {
        this.itemEmprestado = itemEmprestado;
    }

    public String getDataEmprestimo() {
        return this.dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return this.dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
 
   public void exibirDetalhes(){
    System.out.println("Data de emprestimo: "+ this.dataEmprestimo);
    System.out.println("Data da devolucao: "+ this.dataDevolucao);
    System.out.println("Pessoa vinculada");
    this.tomadorEmprestimo.exibirInfo();
    System.out.println("Material vinculada");
    this.itemEmprestado.descricao();
   } 
}
