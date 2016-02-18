/*http://partilho.com.br/java-netbeans/crud-java-inserir-excluir-atualizar-listar/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import teste.Util.Conexao;
import teste.model.IUsuario;


/**
 *
 * @author dcmaster
 */
public class Usuario implements IUsuario{

    Conexao conexao = new Conexao();
    
    @Override
    public void cadastrar(teste.model.Usuario usuario) {
        //Executa a query de inserção
         
            Connection conn =  conexao.getRecuperaConexao();
            java.sql.Statement st = null;
        try {
            st = conn.createStatement();
            st.executeUpdate("INSERT INTO usuario (nome,senha) VALUES ("
                    + usuario.getNome() + ",'"
               
                    + usuario.getSenha() + "')");
        } catch (SQLException ex) {
            Logger.getLogger(Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
            
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void editar(teste.model.Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void consultar(teste.model.Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void excluir(teste.model.Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
