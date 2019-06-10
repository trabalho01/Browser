/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daniel
 */
public class Parser {

    Pattern regex = Pattern.compile("<([A-z][A-z0-9]*)\\b([^>]*)>(.*?)<(\\/\\1)>");
    Pattern folha = Pattern.compile("(^[^<>]*[\\w\\s]+)");

    public No parse(String html, No pai) {
        No raiz = null;
        Matcher f = folha.matcher(html);
        if (f.find()) {
            Texto texto = new Texto(f.group(1), "");
            if (pai != null) {
                pai.inserir(texto);
            }
            return texto;
        }
        System.out.println(html);
        Matcher m = regex.matcher(html);
        while (m.find()) {
            String nomeTag = m.group(1);
            String atributos = m.group(2);
            String nomes = m.group(3);
            Tag tag = new Tag(nomeTag, atributos);
            if (pai != null) {
                pai.inserir(tag);
            } else {
                raiz = tag;
            }
            parse(nomes, tag);
        }
        return raiz;
    }
}
