/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dcmaster
 */
public class Conexao {
    
    private Connection conn = null;
    
    public Connection conectar(){
       
    try
    {
            String url = "jdbc:postgresql://localhost:5432/TesteJava";  
            String usuario = "postgres";  
            String senha = "123456";  
  
            Class.forName("org.postgresql.Driver");   
            
            setConn(DriverManager.getConnection(url, usuario, senha));  
    }
    catch (ClassNotFoundException e)
    {
      e.printStackTrace();
      System.exit(1);
    }
    catch (SQLException e)
    {
      e.printStackTrace();
      System.exit(2);
    }
    return getConn();
  }
    
    public Connection getRecuperaConexao(){
        if(getConn() != null){
            return getConn();
        }else{
            return conectar();
        }
    }
    
    public void desconectar(){
        try {
            getConn().close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the conn
     */
    public Connection getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(Connection conn) {
        this.conn = conn;
    }
    
    
}
