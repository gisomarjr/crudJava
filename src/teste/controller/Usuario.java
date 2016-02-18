/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.controller;

import teste.model.IUsuario;

/**
 *
 * @author dcmaster
 */
public class Usuario implements IUsuario{

    @Override
    public void cadastrar(teste.model.Usuario usuario) {
       
        if(!usuario.getNome().equals("") && !usuario.getSenha().equals(""))
        {
            teste.DAO.Usuario daoUsuario = new teste.DAO.Usuario();
            daoUsuario.cadastrar(usuario);
            
        }else{
            throw new UnsupportedOperationException("Infome todos os campos corretamente"); //To change body of generated methods, choose Tools | Templates.
        }
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
