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
 * @author daniel.010191
 */
public class Parser {
    No pai = null;
    //Regex precisa ser melhorado
    Pattern regex = Pattern.compile("<([^>]*)>(.*?)(<(\\/\\1)>)");
    public void parse(String html, No pai) {
        Matcher m = regex.matcher(html);
        //Condição de parada está errada...
        if (pai.filhos.isEmpty()) {
            Texto texto = new Texto(m.group(2));
        } else {
            //Ainda não sei como fazer esse FOR
            for (int i = 0; i < 10; i++) {
                html.replaceAll(html, m.group(2));
                //Os grupos ainda terão que ser definidos pelo regex a ser alterado
                Tag tag = new Tag(m.group(1), m.group(2));
                if (pai != null) {
                    pai.filhos.add(tag);
                }
            }
        }
    }
}
