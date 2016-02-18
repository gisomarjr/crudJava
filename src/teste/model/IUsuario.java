/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste.model;

/**
 *
 * @author dcmaster
 */
public interface IUsuario {
    
    public void cadastrar(Usuario usuario);
    public void editar(Usuario usuario);
    public void listar();
    public void consultar(Usuario usuario);
    public void excluir(Usuario usuario);
    
}
