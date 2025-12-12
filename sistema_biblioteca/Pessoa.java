<<<<<<< HEAD
package Atividade2;

public class Pessoa {
    private String nome;
    private String email;

    Pessoa (String nome, String email){
=======
public abstract class Pessoa implements TomadorEmprestimo{
    private String nome;
    private String email;

    public abstract void exibirInfo();

    public Pessoa(String nome, String email){
>>>>>>> 0961f230583df63aaabf3d5e81d985799355727d
        this.nome = nome;
        this.email = email;
    }

<<<<<<< HEAD
    public void exibirInfor(){
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
    }
   
    




=======
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
>>>>>>> 0961f230583df63aaabf3d5e81d985799355727d

}
