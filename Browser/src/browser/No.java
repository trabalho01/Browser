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
    public String atributos;

    public No(String nome, String atributos) {
        this.nome = nome;
        this.atributos = atributos;
        filhos = new ArrayList();
    }

    public void inserir(No node) {
        filhos.add(node);
    }
}
