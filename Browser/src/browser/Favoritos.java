/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import browser.ConexaoBD.InterfaceUsuario;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Favoritos extends InterfaceUsuario {

    private String endereco;
    private Date data;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    protected ArrayList<String> listaFavoritos = new ArrayList();

    public void AddFavoritos(String endereco, int id_usr) {
        //Select do banco de dados que mostre os favoritos do id.
    }

    public void RemoveFavoritos(String endereco, int id_usr) {
        //Update no BD
    }
}
