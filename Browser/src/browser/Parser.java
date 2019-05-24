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

   

    Pattern regex = Pattern.compile("<([^>]*)>(.*?)(<(\\/\\1)>)");

    public No parse(String html, No pai) {
        Matcher m = regex.matcher(html);
            if(m.find()){
                String nomeTag = m.group(1);
                String nomes = m.group(2);
                Tag tag = new Tag(nomeTag, nomes);
                if(pai!=null){
                    pai.inserir(tag);
                }
                
                parse(nomes,tag);
                return tag;
            }
           return null;
//        if (pai.filhos.isEmpty()) {
//            Texto texto = new Texto(m.group(2));
//        } else {
//
//            for (int i = 0; i < 10; i++) {
//                html.replaceAll(html, m.group(2));
//
//                Tag tag = new Tag(m.group(1), m.group(2));
//                if (pai != null) {
//                    pai.filhos.add(tag);
//                }
//            }
//        }
//return tag;
   
    }
}

