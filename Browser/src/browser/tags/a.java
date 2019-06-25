/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.tags;

import browser.HTML;
import browser.No;
import browser.Posicao;
import browser.SistemaAbas;
import browser.Tag;
import browser.Validadora;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author lucas
 */
public class a extends Tag {

    JEditorPane pane;
    SistemaAbas aba;
    JTextField text;
    JTabbedPane titulo;
    private final String texto;

    @Override
    public void renderizar(Posicao p) {
        Pattern p1 = Pattern.compile("href=\\\"([A-z0-9\\.\\/\\:]*)\\\"");
        Matcher m = p1.matcher(atributos);
        if (m.find()) {
            HTML ler = new HTML(pane, aba, text, titulo);
            JLabel label = new JLabel(texto, JLabel.LEFT);
            System.out.println(m.group(1));
            label.setForeground(Color.BLUE.darker());
            label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    text.setText(m.group(1));
                    pane.removeAll();
                    HTML ler = new HTML(pane, aba, text, titulo);
                    Validadora validar = new Validadora();
                    No no = ler.lerHTML(aba.Ir(text.getText()));
                }
            });
            label.setSize(pane.getWidth(), texto.length());
            label.setLocation(p.getX(), p.getY());
            p.setY(p.getY() + 15);
            label.setVisible(true);
            pane.add(label);
        } else {
            System.out.println("Tag a incorreta!");
        }

    }

    public a(String nome, String atributos, String texto, JEditorPane pane, SistemaAbas aba, JTextField text, JTabbedPane Titulo) {
        super(nome, atributos);
        this.pane = pane;
        this.texto = texto;
        this.aba = aba;
        this.text = text;
        this.titulo = Titulo;
    }

}
