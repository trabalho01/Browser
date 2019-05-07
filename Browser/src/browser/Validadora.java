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
 * @author lucas.101199
 */
public class Validadora {
    String element1 = "html";
    String element2 = "body, head";
    String element3 = "h1, h2, h3, p, title";
    Pattern regex = Pattern.compile("<([A-Z0-9]*)\\b[^>]*>(.*?)(<(\\/\\1)>)");
    public boolean validar(String url) {
        Pattern p = Pattern.compile("<.?html+>");
        Matcher m = p.matcher(url);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }
    public void montar(String url) {
        Matcher m = regex.matcher(url);
        if(url.contains(element1) && m.find()) {
            No raiz = new No(url);
            url.replaceAll(regex.toString(), "");
        } else {
            if (url.contains(element2) && m.find()) {
                No filho = new No(url);
                filho.filhos.add(filho);
                //Não conseguir montar como Atributos, só como String
                filho.atributos.add(m.group(1));
                url.replaceAll(regex.toString(), "");
            } else {
                if (url.contains(element3) && m.find()) {
                    No filhos = new No(url);
                    filhos.filhos.add(filhos);
                    url.replaceAll(regex.toString(), "");
                }
            }
            
        }
    }
}
