/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package browser;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lucas.101199
 */
public class ConexaoWeb {

    String url;

    public static boolean conexaoComProxy(String address, String ip, int porta) throws IOException {
        Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, porta));
        try {
            URL url = new URL(address);
            URLConnection connection = url.openConnection(proxy);
            connection.connect();
            return true;
        } catch (MalformedURLException ex) {
            //Lançada para indicar que a URL foi informada com algum problema. Nenhum protocolo
            //legal pôde ser encontrado em uma cadeia de especificação ou a mesma não pôde ser analisada.
            Logger.getLogger(ip, address).log(Level.OFF, ip);

            return false;
        } catch (IOException ex) {
            //Lançamento genérico que ocorre quando algum sinal de entrada/saída falha ou é interrompido.
            Logger.getLogger(ip);
            System.out.println(ex.toString());
            return false;
        }
    }

    public static boolean conexaoSemProxy(String address) {
        try {
            URL url = new URL(address);
            URLConnection connection = url.openConnection();
            connection.connect();
            return true;
        } catch (ConnectException ex) {
            //Sinaliza que ocorreu um erro ao tentar conectar um soquete a um endereço e uma porta remotos.
            //Normalmente, a conexão foi recusada remotamente (por exemplo, nenhum processo está escutando no endereço / porta remota).        
            System.out.println("nao funciona!");
            System.out.println(ex.toString());
            return false;
        } catch (IOException e) {
            System.out.println("Nao funciona2");
            return false;
        }
    }

}
