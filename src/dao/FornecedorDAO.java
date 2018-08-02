package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.ObjFornecedor;

public class FornecedorDAO {
    public static void inserir(ObjFornecedor fnd){
        String sql = "INSERT INTO fornecedores"
                + " ( nome, telefone, produto, email ) "
                + " VALUES ("
                + " '"+ fnd.getNome()               +"' , "
                + " '"+ fnd.getTelefone()           +"' , "
                + " '"+ fnd.getProduto()            +"' , "
                + " '"+ fnd.getEmail()              +"' );" ;
        Conexao.executar(sql);
    }
    
    public static void editar(ObjFornecedor fnd){
        String sql = "UPDATE fornecedores SET"
                + " nome =     '"+ fnd.getNome() +"' "
                + " telefone = '"+ fnd.getTelefone() +"' "
                + " produto =  '"+ fnd.getProduto()+"' "
                + " email =    '"+ fnd.getEmail()+"' "
                + " WHERE codigo = "+fnd.getCodigo() ;
        Conexao.executar(sql);
    }
    
    public static void excluir(ObjFornecedor fnd){
        String sql = "DELETE FROM fornecedores "
                + " WHERE codigo = "+fnd.getCodigo() ;
        Conexao.executar(sql);
    }
    
    public static List<ObjFornecedor> getFornecedores(){
        List<ObjFornecedor> lista = new ArrayList<>();
        String sql = "SELECT * FROM fornecedores ORDER BY nome";
        ResultSet rs = Conexao.consultar(sql);
        
        if(rs != null){
            try {
                while (rs.next()) {                    
                    ObjFornecedor fnd = new ObjFornecedor();
                    fnd.setCodigo(rs.getInt(1));
                    fnd.setNome(rs.getString(2));
                    fnd.setTelefone(rs.getString(3));
                    fnd.setProduto(rs.getString(4));
                    fnd.setEmail(rs.getString(5));
                    lista.add(fnd);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        
        return lista;
    }
    
    public static ObjFornecedor getFornecedorByCodigo(int codigo){
        ObjFornecedor fornecedor = new ObjFornecedor();
        
        String sql = "SELECT codigo, nome, telefone, produto, email FROM fornecedores "
                   + "WHERE codigo = " + codigo;
        ResultSet rs = Conexao.consultar(sql);
        
        if(rs != null){
            try {
                while (rs.next()) {                    
                    ObjFornecedor fnd = new ObjFornecedor();
                    fnd.setCodigo(rs.getInt(1));
                    fnd.setNome(rs.getString(2));
                    fnd.setTelefone(rs.getString(3));
                    fnd.setProduto(rs.getString(4));
                    fnd.setEmail(rs.getString(5));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
        return fornecedor;   
    }
    
    
}
