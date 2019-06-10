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

    public void render(No pai) {
        for (No filho : pai.filhos) {
            String atributo = pai.atributos;
            if (filho.filhos.isEmpty() == false) {
                String texto = "";
                renderTag(pai.nome, texto, atributo);
            } else {
                renderTag(pai.nome, filho.nome, atributo);
            }
            render(filho);
        }
    }

    public void renderTag(String nome, String texto, String atributo) {
        switch (nome) {
            case "a":
                a a = new a(nome, atributo, texto);
                a.renderizar();
                break;
            case "b":
                b b = new b(nome, atributo, texto);
                b.renderizar();
                break;
            case "body":
                body body = new body(nome, atributo, texto);
                body.renderizar();
                break;
            case "br":
                br br = new br(nome, atributo, texto);
                br.renderizar();
                break;
            case "button":
                button button = new button(nome, atributo, texto);
                button.renderizar();
                break;
            case "caption":
                caption caption = new caption(nome, atributo, texto);
                caption.renderizar();
                break;
            case "col":
                col col = new col(nome, atributo, texto);
                col.renderizar();
                break;
            case "div":
                div div = new div(nome, atributo, texto);
                div.renderizar();
                break;
            case "form":
                form form = new form(nome, atributo, texto);
                form.renderizar();
                break;
            case "h1":
                h1 h1 = new h1(nome, atributo, texto);
                h1.renderizar();
                break;
            case "h2":
                h2 h2 = new h2(nome, atributo, texto);
                h2.renderizar();
                break;
            case "h3":
                h3 h3 = new h3(nome, atributo, texto);
                h3.renderizar();
                break;
            case "h4":
                h4 h4 = new h4(nome, atributo, texto);
                h4.renderizar();
                break;
            case "h5":
                h5 h5 = new h5(nome, atributo, texto);
                h5.renderizar();
                break;
            case "h6":
                h6 h6 = new h6(nome, atributo, texto);
                h6.renderizar();
                break;
            case "head":
                head head = new head(nome, atributo, texto);
                head.renderizar();
                break;
            case "header":
                header header = new header(nome, atributo, texto);
                header.renderizar();
                break;
            case "hr":
                hr hr = new hr(nome, atributo, texto);
                hr.renderizar();
                break;
            case "html":
                html html = new html(nome, atributo, texto);
                html.renderizar();
                break;
            case "i":
                i i = new i(nome, atributo, texto);
                i.renderizar();
                break;
            case "img":
                img img = new img(nome, atributo, texto);
                img.renderizar();
                break;
            case "input":
                input input = new input(nome, atributo, texto);
                input.renderizar();
                break;
            case "label":
                label label = new label(nome, atributo, texto);
                label.renderizar();
                break;
            case "li":
                li li = new li(nome, atributo, texto);
                li.renderizar();
                break;
            case "meta":
                meta meta = new meta(nome, atributo, texto);
                meta.renderizar();
                break;
            case "ol":
                ol ol = new ol(nome, atributo, texto);
                ol.renderizar();
                break;
            case "option":
                option option = new option(nome, atributo, texto);
                option.renderizar();
                break;
            case "p":
                p p = new p(nome, atributo, texto);
                p.renderizar();
                break;
            case "select":
                select select = new select(nome, atributo, texto);
                select.renderizar();
                break;
            case "table":
                table table = new table(nome, atributo, texto);
                table.renderizar();
                break;
            case "tbody":
                tbody tbody = new tbody(nome, atributo, texto);
                tbody.renderizar();
                break;
            case "td":
                td td = new td(nome, atributo, texto);
                td.renderizar();
                break;
            case "textarea":
                textarea textarea = new textarea(nome, atributo, texto);
                textarea.renderizar();
                break;
            case "th":
                th th = new th(nome, atributo, texto);
                th.renderizar();
                break;
            case "title":
                title title = new title(nome, atributo, texto);
                title.renderizar();
                break;
            case "tr":
                tr tr = new tr(nome, atributo, texto);
                tr.renderizar();
                break;
            case "ul":
                ul ul = new ul(nome, atributo, texto);
                ul.renderizar();
                break;
            default:
                System.out.println("Tag inválida");
        }
    }
}
