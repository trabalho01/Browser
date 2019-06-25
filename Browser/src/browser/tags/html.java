/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.tags;

import browser.Posicao;
import browser.Tag;
import javax.swing.JEditorPane;

/**
 *
 * @author lucas
 */
public class html extends Tag {

    JEditorPane pane;
    String texto;

    @Override
    public void renderizar(Posicao p) {

    }

    public html(String nome, String atriutos, String texto, JEditorPane pane) {
        super(nome, atriutos);
        this.pane = pane;
        this.texto = texto;
    }

}
