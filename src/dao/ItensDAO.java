package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ObjFornecedor;
import model.ObjItens;

public class ItensDAO {
    public static void inserir(ObjItens ite){
        String sql = "INSERT INTO itens "
                + " ( nome, quantidade, codFornecedores ) "
                + " VALUES ("
                + " '"+ ite.getNome()               +"' , "
                + "  "+ ite.getQuantidade()         +"  , "
                + "  "+ ite.getFornecedor().getCodigo() +"    "
                + " );";
        Conexao.executar(sql);
    }
    
    public static void editar(ObjItens ite){
        String sql = "UPDATE itens SET "
                + " nome =      '"+ ite.getNome()                   +"' , "
                + " quantidade = "+ ite.getQuantidade()             +"  , "
                + " codFornecedores =  "+ ite.getFornecedor().getCodigo() +"    "
                + " WHERE codigo = "+ite.getCodigo();
        Conexao.executar(sql);
    }
    
    public static void excluir(ObjItens ite){
        String sql = "DELETE FROM itens "
                + " WHERE codigo = "+ite.getCodigo() ;
        Conexao.executar(sql);
    }
    
    public static List<ObjItens> getItens(){
        List<ObjItens> lista = new ArrayList<>();
        String sql = "SELECT i.codigo, f.codigo, i.nome,      "
                +" f.nome, i.quantidade                       "
                +" FROM itens i                               "
                +" INNER JOIN fornecedores f ON i.codFornecedores = f.codigo"
                +" ORDER BY i.nome";
        ResultSet rs = Conexao.consultar(sql);
        
        if(rs != null){
            try {
                while (rs.next()) {                    
                    ObjItens ite = new ObjItens();
                    ite.setCodigo(rs.getInt(1));
                    ite.setNome(rs.getString(3));
                    ite.setQuantidade(rs.getInt(5));
                    
                    ObjFornecedor fnd = new ObjFornecedor();
                    fnd.setCodigo(rs.getInt(2));
                    fnd.setNome(rs.getString(4));
                    ite.setFornecedor(fnd);
                    
                    lista.add(ite);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        
        return lista;
    }
    
    public static ObjItens getItensByCodigo(int codigo){
        ObjItens item = new ObjItens();
        
        String sql = "SELECT i.codigo, f.codigo, i.nome,      "
                +" f.nome, i.quantidade                       "
                +" FROM itens i                               "
                +" INNER JOIN fornecedores f ON i.codFornecedores = f.codigo"
                +" WHERE i.codigo = " + codigo;
        ResultSet rs = Conexao.consultar(sql);
        
        if(rs != null){
            try {
                while (rs.next()) {                   
                    item.setCodigo(rs.getInt(1));
                    item.setNome(rs.getString(3));
                    item.setQuantidade(rs.getInt(5));
                    
                    ObjFornecedor fnd = new ObjFornecedor();
                    fnd.setCodigo(rs.getInt(2));
                    fnd.setNome(rs.getString(4));
                    item.setFornecedor(fnd);
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return item;     
    }
    
    public static void atualizar(ObjItens ite){
        String sql = "UPDATE itens SET "
                + " quantidade = quantidade-"+ ite.getQuantidade()  +"   "
                + " WHERE codigo = "+ite.getCodigo();
        Conexao.executar(sql);
    }
    
}
