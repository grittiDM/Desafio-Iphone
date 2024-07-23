package app;

public class Navegador {
    private String url;

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        exibirPagina(url);
    }

    private void exibirPagina(String url) {
        System.out.println("Exibindo Página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página");
    }
}
