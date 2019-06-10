/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

/**
 *
 * @author lucas
 */
public class Tag extends No{
    String nome;
    String atributos;
    
    public Tag(String nome, String atributos) {
        super(nome, atributos);
        this.nome = nome;
        this.atributos = atributos;
    }
    
    public void renderizar() {
        
    }
    
}
