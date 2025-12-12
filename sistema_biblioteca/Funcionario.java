public class Funcionario extends Pessoa{
<<<<<<< HEAD
 private String cargo;
  
 public Funcionario (String nome,String email,String cargo){
    super(nome, email);
    this.cargo = cargo;


    @Override
    public void exibirInfor(){
        super.exibirinfor();
        System.out.println("Cargo: "+cargo);
    }
}


=======
    private String cargo;

     public Funcionario(String nome, String email, String cargo){
        super(nome,email);
        this.cargo = cargo;
     }


    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    

   
    @Override
    public void exibirInfo(){
     System.out.println("Nome: "+ this.getNome());
     System.out.println("e-mail: "+ this.getEmail());
     System.out.println("Cargo: "+ this.cargo);
    
    }
>>>>>>> 0961f230583df63aaabf3d5e81d985799355727d
}