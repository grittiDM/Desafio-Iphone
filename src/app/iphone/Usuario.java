package app.iphone;

import app.Navegador;
import app.ReprodutorDeMusica;
import app.Telefone;

public class Usuario {
    public static void main(String[] args) {
        ReprodutorDeMusica rdm = new ReprodutorDeMusica();

        String funcaoRdm = "selecionar";

        if (funcaoRdm.equals("tocar")) {
            rdm.tocar();
        }
        else if (funcaoRdm.equals("pausar")) {
            rdm.pausar();
        }
        else if (funcaoRdm.equals("selecionar")) {
            rdm.setMusica("Whirling-In-Rags, 8PM");
        }

        Telefone telefone = new Telefone();

        String funcaoTelefone = "ligar";

        if (funcaoTelefone.equals("ligar")) {
            telefone.setNumero("123456789");
        }
        else if (funcaoTelefone.equals("atender")) {
            telefone.atender();
        }
        else if (funcaoTelefone.equals("iniciarCorreioVoz")) {
            telefone.iniciarCorreioVoz();
        }

        Navegador navegador = new Navegador();

        String funcaoNavegador = "exibirPagina";

        if (funcaoNavegador.equals("exibirPagina")) {
            navegador.setUrl("https://www.dio.me");
        }
        else if (funcaoNavegador.equals("atualizarPagina")) {
            navegador.atualizarPagina();
        }
        else if (funcaoNavegador.equals("adicionarNovaAba")) {
            navegador.adicionarNovaAba();
        }
    }
}
