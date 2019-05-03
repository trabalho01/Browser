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
    public boolean validar(String url) {
        Pattern p = Pattern.compile("<.?html+>");
        Matcher m = p.matcher(url);
        if (m.find()) {
            return true;
        } else {
            return false;
        }
    }
    
    //(^<((?:"[^"]*"['"]*|'[^']*'['"]*|[^'">])).+>$)
}
