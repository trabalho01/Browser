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
public class Render {

    int a = 0;

    public void render(No pai) {
        if (pai instanceof Texto) {
            System.out.println(pai.nome);
            return;
        } else {
            for (No filho : pai.filhos) {
                render(filho);
            }
        }
    }
}
