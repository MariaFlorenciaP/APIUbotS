package entity;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nome=" + nome + ", cpf=" + cpf + '}';
    }

    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append("id.................: ").append(this.id).append("\n");
        sb.append("Nome..........: ").append(this.nome).append("\n");
        sb.append("CPF.........: ").append(this.cpf).append("\n");
        return sb.toString();
    }

}
