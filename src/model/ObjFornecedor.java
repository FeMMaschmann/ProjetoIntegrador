package model;

public class ObjFornecedor {
    private int codigo;
    private String nome, telefone, produto, email;

    public ObjFornecedor() {
    }

    public ObjFornecedor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public ObjFornecedor(int codigo, String nome, String telefone, String produto, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.produto = produto;
        this.email = email;
    }

    @Override
    public String toString() {
        return nome; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}