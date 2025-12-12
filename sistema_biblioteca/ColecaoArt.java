public class ColecaoArt implements ItemEmprestado{
    private String proprietario;
    private Integer quantidade;



    public ColecaoArt(String proprietario, Integer quantidade) {
        this.proprietario = proprietario;
        this.quantidade = quantidade;
    }


    public String getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
   


    
}
