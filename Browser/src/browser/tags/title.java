/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.tags;

import browser.Posicao;
import browser.Tag;
import javax.swing.JEditorPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author lucas
 */
public class title extends Tag {

    JEditorPane pane;
    String texto;
    JTabbedPane Titulo;

    @Override
    public void renderizar(Posicao p) {
        int index = 0;
        Titulo.setTitleAt(index, texto);
        index = index + 1;
    }

    public title(String nome, String atriutos, String texto, JEditorPane pane, JTabbedPane Titulo) {
        super(nome, atriutos);
        this.texto = texto;
        this.pane = pane;
        this.Titulo = Titulo;
    }

}
