/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser.tags;

import browser.Tag;

/**
 *
 * @author lucas
 */
public class tr extends Tag {
    String texto;
    @Override
    public void renderizar() {
        
    }
    
    public tr(String nome, String atriutos, String texto) {
        super(nome, atriutos);
        this.texto = texto;
    }
    
}
