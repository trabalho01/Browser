/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.util.Stack;

/**
 *
 * @author lucas.101199
 */
public class SistemaAbas {

    Stack<String> anterior = new Stack();
    Stack<String> posterior = new Stack();
    String atual = "";

    public String Anterior() {
        if (anterior.empty()) {
            System.out.println("Não há endereços anteriores");
            return null;
        } else {
            posterior.push(atual);
            atual = anterior.pop();
            return atual;
        }
    }

    public String Posterior() {
        if (posterior.empty()) {
            System.out.println("Não há endereços posteriores");
            return null;
        } else {
            anterior.push(atual);
            atual = posterior.pop();
            return atual;
        }
    }

    public String Ir(String adress) {
        if ("".equals(atual)) {
            atual = adress;
            posterior.clear();
            return atual;
        } else {
            anterior.push(atual);
            atual = adress;
            posterior.clear();
            return atual;
        }
    }
}
