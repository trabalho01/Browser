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
import javax.swing.JEditorPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

/**
 *
 * @author lucas.101199
 */
public class Render {

    JEditorPane pane;
    SistemaAbas aba;
    JTextField text;
    JTabbedPane titulo;
    Posicao po = new Posicao(0, 0);

    public void render(No pai) {
        pai.filhos.stream().map((filho) -> {
            String atributo = pai.atributos;
            if (filho.filhos.isEmpty() == false) {
                String texto = "";
                renderTag(pai.nome, texto, atributo);
            } else {
                renderTag(pai.nome, filho.nome, atributo);
            }
            return filho;
        }).forEach((filho) -> {
            render(filho);
        });
    }

    public Render(JEditorPane pane, SistemaAbas aba, JTextField text, JTabbedPane titulo) {
        this.pane = pane;
        this.aba = aba;
        this.text = text;
        this.titulo = titulo;
    }

    public void renderTag(String nome, String texto, String atributo) {
        switch (nome) {
            case "a":
                a a = new a(nome, atributo, texto, pane, aba, text, titulo);
                a.renderizar(po);
                break;
            case "b":
                b b = new b(nome, atributo, texto, pane);
                b.renderizar(po);
                break;
            case "body":
                body body = new body(nome, atributo, texto, pane);
                body.renderizar(po);
                break;
            case "br":
                br br = new br(nome, atributo, texto, pane);
                br.renderizar(po);
                break;
            case "button":
                button button = new button(nome, atributo, texto, pane);
                button.renderizar(po);
                break;
            case "caption":
                caption caption = new caption(nome, atributo, texto, pane);
                caption.renderizar(po);
                break;
            case "col":
                col col = new col(nome, atributo, texto, pane);
                col.renderizar(po);
                break;
            case "div":
                div div = new div(nome, atributo, texto, pane);
                div.renderizar(po);
                break;
            case "form":
                form form = new form(nome, atributo, texto, pane);
                form.renderizar(po);
                break;
            case "h1":
                h1 h1 = new h1(nome, atributo, texto, pane);
                h1.renderizar(po);
                break;
            case "h2":
                h2 h2 = new h2(nome, atributo, texto, pane);
                h2.renderizar(po);
                break;
            case "h3":
                h3 h3 = new h3(nome, atributo, texto, pane);
                h3.renderizar(po);
                break;
            case "h4":
                h4 h4 = new h4(nome, atributo, texto, pane);
                h4.renderizar(po);
                break;
            case "h5":
                h5 h5 = new h5(nome, atributo, texto, pane);
                h5.renderizar(po);
                break;
            case "h6":
                h6 h6 = new h6(nome, atributo, texto, pane);
                h6.renderizar(po);
                break;
            case "head":
                head head = new head(nome, atributo, texto, pane);
                head.renderizar(po);
                break;
            case "header":
                header header = new header(nome, atributo, texto, pane);
                header.renderizar(po);
                break;
            case "hr":
                hr hr = new hr(nome, atributo, texto, pane);
                hr.renderizar(po);
                break;
            case "html":
                html html = new html(nome, atributo, texto, pane);
                html.renderizar(po);
                break;
            case "i":
                i i = new i(nome, atributo, texto, pane);
                i.renderizar(po);
                break;
            case "img":
                img img = new img(nome, atributo, texto, pane);
                img.renderizar(po);
                break;
            case "input":
                input input = new input(nome, atributo, texto, pane);
                input.renderizar(po);
                break;
            case "label":
                label label = new label(nome, atributo, texto, pane);
                label.renderizar(po);
                break;
            case "li":
                li li = new li(nome, atributo, texto, pane);
                li.renderizar(po);
                break;
            case "meta":
                meta meta = new meta(nome, atributo, texto, pane);
                meta.renderizar(po);
                break;
            case "ol":
                ol ol = new ol(nome, atributo, texto, pane);
                ol.renderizar(po);
                break;
            case "option":
                option option = new option(nome, atributo, texto, pane);
                option.renderizar(po);
                break;
            case "p":
                p p = new p(nome, atributo, texto, pane);
                p.renderizar(po);
                break;
            case "select":
                select select = new select(nome, atributo, texto, pane);
                select.renderizar(po);
                break;
            case "table":
                table table = new table(nome, atributo, texto, pane);
                table.renderizar(po);
                break;
            case "tbody":
                tbody tbody = new tbody(nome, atributo, texto, pane);
                tbody.renderizar(po);
                break;
            case "td":
                td td = new td(nome, atributo, texto, pane);
                td.renderizar(po);
                break;
            case "textarea":
                textarea textarea = new textarea(nome, atributo, texto, pane);
                textarea.renderizar(po);
                break;
            case "th":
                th th = new th(nome, atributo, texto, pane);
                th.renderizar(po);
                break;
            case "title":
                title title = new title(nome, atributo, texto, pane, titulo);
                title.renderizar(po);
                break;
            case "tr":
                tr tr = new tr(nome, atributo, texto, pane);
                tr.renderizar(po);
                break;
            case "ul":
                ul ul = new ul(nome, atributo, texto, pane);
                ul.renderizar(po);
                break;
            default:
                System.out.println("Tag inválida");
        }
    }
}
