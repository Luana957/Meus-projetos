public class Institucao implements TomadorEmprestimo{
    private String cnpj;
    private String nome;
    private String cidade;



    public Institucao(String cnpj, String nome, String cidade) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

   
 public void exibirInfo(){
    System.out.println("CNPJ: "+ this.cnpj);
    System.out.println("Nome: "+ this.nome);
    System.out.println("Cidade: "+ this.cidade);
 }
    
}
