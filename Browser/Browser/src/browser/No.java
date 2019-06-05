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

    public String nome;
    public ArrayList<No> filhos;
    public ArrayList<String> atributos;
    
    public No(String nome) {
        this.nome = nome;
        filhos = new ArrayList();
    }

    public void inserir(No node) {
        filhos.add(node);
    }
}
