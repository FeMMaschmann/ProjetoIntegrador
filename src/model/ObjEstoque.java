package model;

public class ObjEstoque {
    private int codigo;
    private String nome;
    private int quantidade;
    private ObjFornecedor fornecedor;

    public ObjEstoque() {
    }

    public ObjEstoque(int codigo, String nome, int quantidade, ObjFornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
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
