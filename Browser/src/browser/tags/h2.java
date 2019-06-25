/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.tags;

import browser.Posicao;
import browser.Tag;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

/**
 *
 * @author lucas
 */
public class h2 extends Tag {

    JEditorPane pane;
    String texto;
    Font f = new Font(Font.SANS_SERIF, Font.PLAIN, 18);

    @Override
    public void renderizar(Posicao p) {

        JLabel label = new JLabel(texto, JLabel.LEFT);
        label.setSize(pane.getWidth(), texto.length() + 15);
        label.setFont(f);
        label.setLocation(p.getX(), p.getY());
//        p.setX(p.getX() + texto.length());
        p.setY(p.getY() + 39);
        label.setVisible(true);
        pane.add(label);

    }

    public h2(String nome, String atriutos, String texto, JEditorPane pane) {
        super(nome, atriutos);
        this.texto = texto;
        this.pane = pane;
    }

}
