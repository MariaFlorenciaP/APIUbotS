package clientews;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import entity.Cliente;
import entity.Compra;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import util.UtilJSON;

public class WSVinhos {

    static String webService = "https://www.mocky.io/v2/598b16291100004705515ec5";
    static String webService2 = "https://www.mocky.io/v2/598b16861100004905515ec7";

    static int codigoSucesso = 200;

    public static List<Cliente> getClientes() throws IOException, Exception {
        String urlRequisicao = webService + "/json";

        try {
            URL url = new URL(urlRequisicao);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                throw new RuntimeException("HTTP Error Code: " + conexao.getResponseCode());
            }

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

            String jsonEmString = UtilJSON.jsonToString(resposta);

            Gson gson = new Gson();
            TypeToken tt = new TypeToken<List<Cliente>>() {
            };
            List<Cliente> clientes = gson.fromJson(jsonEmString, tt.getType());

            return clientes;
        } catch (Exception ex) {
            throw new Exception("Erro: " + ex);
        }
    }

    public static List<Compra> getCompras() throws IOException, Exception {
        String urlRequisicao = webService2 + "/json";

        try {
            URL url = new URL(urlRequisicao);
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection();

            if (conexao.getResponseCode() != codigoSucesso) {
                throw new RuntimeException("HTTP Error Code: " + conexao.getResponseCode());
            }

            BufferedReader resposta = new BufferedReader(new InputStreamReader(conexao.getInputStream()));

            String jsonEmString = UtilJSON.jsonToString(resposta);

            Gson gson = new Gson();
            TypeToken tt = new TypeToken<List<Cliente>>() {
            };
            List<Compra> compras = gson.fromJson(jsonEmString, tt.getType());

            return compras;
        } catch (Exception ex) {
            throw new Exception("Erro: " + ex);
        }
    }

}
