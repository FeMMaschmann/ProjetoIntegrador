package model;

public class ObjItens {
    private int codigo;
    private String nome;
    private int quantidade;
    private ObjFornecedor fornecedor;
    
    public ObjItens() {
    }

    public ObjItens(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public ObjItens(int codigo, String nome, int quantidade, ObjFornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ObjFornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(ObjFornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
}
