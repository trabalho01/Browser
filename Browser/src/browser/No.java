/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class No {

    String tag;
    ArrayList<No> filhos;
    //No lugar de "String", tinha um "Atributo".
    ArrayList<String> atributos;
    
    public No(String tag) {
        this.tag = tag;
        filhos = new ArrayList();
    }

    public void inserir(No node) {
        filhos.add(node);

    }
}
