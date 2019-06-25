/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author lucas
 */
public class Tag extends No {

    public ArrayList<JLabel> jlabel = new ArrayList();

    public Tag(String nome, String atributos) {
        super(nome, atributos);
        this.nome = nome;
        this.atributos = atributos;
    }

    public void renderizar(Posicao p) {
    }

}
