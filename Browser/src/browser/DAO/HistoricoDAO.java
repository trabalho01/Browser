/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.DAO;

import browser.ConexaoBD.Conexao;
import browser.Historico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class HistoricoDAO {

    public void Inserir(Historico historico) throws SQLException {

        Connection con = Conexao.getConexao();
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement("INSERT INTO historico(endereco,data)VALUES(?,?)");
            stat.setString(1, historico.getEndereco());
            stat.setDate(2, historico.getData());
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao salvar!");
        } finally {
            Conexao.closeConnection(con, stat);
        }
    }

    public void Excluir(Historico historico) throws SQLException {
        Connection con = Conexao.getConexao();
        PreparedStatement stat = null;
        try {
            stat = con.prepareStatement("delete from historico where dataAcesso = '" + historico.getData() + "' ");
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar!");
        } finally {
            Conexao.closeConnection(con, stat);
        }
    }

    public void Consultar(Historico historico) throws SQLException {
        Connection con = Conexao.getConexao();

        Statement st = con.createStatement();
        st.executeQuery("select * from historico");
        ResultSet rs = st.getResultSet();

        while (rs.next()) {
            System.out.println(rs.getString("endereco"));
            System.out.println(rs.getDate("data"));
        }
        Conexao.closeConnection(con, (PreparedStatement) st);

    }

}
