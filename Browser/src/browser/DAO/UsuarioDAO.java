/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.DAO;

import browser.ConexaoBD.Conexao;
import browser.ConexaoBD.Usuario2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class UsuarioDAO {

    Usuario2 u = new Usuario2();

    public boolean checkLogin(String login, String Senha) {

        Connection con = Conexao.getConexao();
        PreparedStatement stat = null;
        ResultSet rs = null;
        boolean checando = false;

        try {
            stat = con.prepareStatement("SELECT * FROM usuario WHERE login =? and senha =?");
            stat.setString(1, login);
            stat.setString(2, Senha);
            rs = stat.executeQuery();
            if (rs.next()) {

                checando = true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conexao.closeConnection(con, stat, rs);
        }
        return checando;

    }

    public void create(Usuario2 u) {

        Connection con = Conexao.getConexao();
        PreparedStatement stat = null;

        try {
            stat = con.prepareStatement("INSERT INTO usuario(login,senha)VALUES(?,?)");
            stat.setString(1, u.getLogin());
            stat.setString(2, u.getSenha());

            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        } finally {
            Conexao.closeConnection(con, stat);
        }

    }
}
