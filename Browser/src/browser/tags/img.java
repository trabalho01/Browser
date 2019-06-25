/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.tags;

import browser.Posicao;
import browser.Tag;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JEditorPane;
import javax.swing.JLabel;

/**
 *
 * @author lucas
 */
public class img extends Tag {

    Pattern p1 = Pattern.compile("src=\\\"([A-z0-9\\.\\/\\:]*)\\\"");
    Matcher m = p1.matcher(atributos);
    JEditorPane pane;
    String texto;

    @Override
    public void renderizar(Posicao p) {

        texto = "";
        System.out.println(texto);
        if (m.find()) {
            JLabel label = new JLabel(texto, JLabel.LEFT);
            label.setSize(pane.getWidth(), 150);
            label.setIcon(new javax.swing.ImageIcon(m.group(1)));
            label.setLocation(p.getX(), p.getY());
            p.setY(p.getY() + 150);
            label.setVisible(true);
            pane.add(label);
        } else {
            System.out.println("Tag img incorreta");
        }

    }

    public img(String nome, String atributos, String texto, JEditorPane pane) {
        super(nome, atributos);
        this.texto = texto;
        this.pane = pane;
    }

}
