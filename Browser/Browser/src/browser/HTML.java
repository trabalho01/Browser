/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author lucas.101199
 */
public class HTML {
    public String lerHTML(String url) {
        String linha = null;
        String html = "";

        try {
            FileReader fileReader =  new FileReader(url);
            try (BufferedReader bufferedReader = new BufferedReader(fileReader)) {
                while ((linha = bufferedReader.readLine()) != null) {
                 html =  html.concat(linha);
                }
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Não foi possível abrir o aquivo '" + url + "'");
        } 
        catch (IOException ex) {
            System.out.println("Erro ao ler '" + url + "'");
        }
        return(html);
    }
}
