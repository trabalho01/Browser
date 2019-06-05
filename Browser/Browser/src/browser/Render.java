/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import browser.tags.a;
import browser.tags.b;
import browser.tags.body;
import browser.tags.br;
import browser.tags.button;
import browser.tags.caption;
import browser.tags.col;
import browser.tags.div;
import browser.tags.form;
import browser.tags.h1;
import browser.tags.h2;
import browser.tags.h3;
import browser.tags.h4;
import browser.tags.h5;
import browser.tags.h6;
import browser.tags.head;
import browser.tags.header;
import browser.tags.hr;
import browser.tags.html;
import browser.tags.i;
import browser.tags.img;
import browser.tags.input;
import browser.tags.label;
import browser.tags.li;
import browser.tags.meta;
import browser.tags.ol;
import browser.tags.option;
import browser.tags.p;
import browser.tags.select;
import browser.tags.table;
import browser.tags.tbody;
import browser.tags.td;
import browser.tags.textarea;
import browser.tags.th;
import browser.tags.title;
import browser.tags.tr;
import browser.tags.ul;
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
            switch (pai.nome) {
                    case "a":
                        a a = new a(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        a.renderizar();
                        break;
                    case "b":
                        b b = new b(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        b.renderizar();
                        break;
                    case "body":
                        body body = new body(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        body.renderizar();
                        break;
                    case "br":
                        br br = new br(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        br.renderizar();
                        break;
                    case "button":
                        button button = new button(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        button.renderizar();
                        break;
                    case "caption":
                        caption caption = new caption(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        caption.renderizar();
                        break;
                    case "col":
                        col col = new col(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        col.renderizar();
                        break;
                    case "div":
                        div div = new div(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        div.renderizar();
                        break;
                    case "form":
                        form form = new form(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        form.renderizar();
                        break;
                    case "h1":
                        h1 h1 = new h1(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        h1.renderizar();
                        break;
                    case "h2":
                        h2 h2 = new h2(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        h2.renderizar();
                        break;
                    case "h3":
                        h3 h3 = new h3(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        h3.renderizar();
                        break;
                    case "h4":
                        h4 h4 = new h4(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        h4.renderizar();
                        break;
                    case "h5":
                        h5 h5 = new h5(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        h5.renderizar();
                        break;
                    case "h6":
                        h6 h6 = new h6(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        h6.renderizar();
                        break;
                    case "head":
                        head head = new head(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        head.renderizar();
                        break;
                    case "header":
                        header header = new header(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        header.renderizar();
                        break;
                    case "hr":
                        hr hr = new hr(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        hr.renderizar();
                        break;
                    case "html":
                        html html = new html(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        html.renderizar();
                        break;
                    case "i":
                        i i = new i(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        i.renderizar();
                        break;
                    case "img":
                        img img = new img(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        img.renderizar();
                        break;
                    case "input":
                        input input = new input(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        input.renderizar();
                        break;
                    case "label":
                        label label = new label(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        label.renderizar();
                        break;
                    case "li":
                        li li = new li(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        li.renderizar();
                        break;
                    case "meta":
                        meta meta = new meta(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        meta.renderizar();
                        break;
                    case "ol":
                        ol ol = new ol(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        ol.renderizar();
                        break;
                    case "option":
                        option option = new option(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        option.renderizar();
                        break;
                    case "p":
                        p p = new p(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        p.renderizar();
                        break;
                    case "select":
                        select select = new select(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        select.renderizar();
                        break;
                    case "table":
                        table table = new table(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        table.renderizar();
                        break;
                    case "tbody":
                        tbody tbody = new tbody(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        tbody.renderizar();
                        break;
                    case "td":
                        td td = new td(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        td.renderizar();
                        break;
                    case "textarea":
                        textarea textarea = new textarea(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        textarea.renderizar();
                        break;
                    case "th":
                        th th = new th(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        th.renderizar();
                        break;
                    case "title":
                        title title = new title(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        title.renderizar();
                        break;
                    case "tr":
                        tr tr = new tr(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        tr.renderizar();
                        break;
                    case "ul":
                        ul ul = new ul(pai.nome, pai.atributos.get(0), ((Texto) pai).texto);
                        ul.renderizar();
                        break;
                    default:                   
                }
            return;
        } else {
            for (No filho : pai.filhos) {
                
            }
        }
    }
}
