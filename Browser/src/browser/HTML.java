/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JEditorPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author lucas.101199
 */
public class HTML {

    JEditorPane pane;
    SistemaAbas aba;
    JTextField text;
    JTabbedPane titulo;

    public No lerHTML(String url) {

        Parser p1 = new Parser();

        String linha = null;
        String html = "";

        try {
            FileReader fileReader = new FileReader(url);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((linha = bufferedReader.readLine()) != null) {
                    html = html.concat(linha);
                }

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Não foi possível abrir o aquivo '" + url + "'");
        } catch (IOException ex) {
            System.out.println("Erro ao ler '" + url + "'");
        } catch (java.lang.NullPointerException ex) {
            System.out.println("Não há endereços para serem lidos");
        }
        No teste = p1.parse(html, null);
        Render render = new Render(pane, aba, text, titulo);
        render.render(teste);
        return (teste);
    }

    public HTML(JEditorPane pane, SistemaAbas aba, JTextField text, JTabbedPane titulo) {
        this.pane = pane;
        this.aba = aba;
        this.text = text;
        this.titulo = titulo;
    }
}
