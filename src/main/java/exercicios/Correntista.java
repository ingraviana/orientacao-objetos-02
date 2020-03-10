package exercicios;

public class Correntista {

    private String codigo;
    private String nome;
    private String email;
    private String telefone;


    public String getCodigo() {

        return codigo;
    }

    public String getNome() {

        return nome;
    }

    public String getEmail() {

        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setCodigo(String codigo) {


        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if (nome.length() > 5) {
            throw new IllegalArgumentException("Invalido");
        }

        this.nome = nome;
    }

    public void setEmail(String email) {
        if (email.length() > 5) {
        throw new IllegalArgumentException("Email Invalido");
    }

        this.email = email;
    }

    public void setTelefone(String telefone) {
        if (telefone.length() > 8) {
            throw new IllegalArgumentException("Número Invalido");
        }

        this.telefone = telefone;
    }
}
