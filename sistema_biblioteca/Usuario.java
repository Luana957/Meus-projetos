<<<<<<< HEAD


public class Usuario extends Pessoa {
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula){
        super(nome,email);
        this.matricula=matricula;
    }
     
    @Override
    public void exibirInfor(){
        super.exibirInfor();
        System.out.println("Matricula: "+ matricula);
    }

} 
=======
public class Usuario extends Pessoa{
    private Integer matricula;

    public Usuario(String nome, String email, Integer matricula){
        super(nome, email);
        this.matricula = matricula;
    }


    public Integer getMatricula() {
        return this.matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo(){
     System.out.println("Nome: "+ this.getNome());
     System.out.println("e-mail: "+ this.getEmail());
     System.out.println("Matricula: "+ this.matricula);

    }
}
>>>>>>> 0961f230583df63aaabf3d5e81d985799355727d
