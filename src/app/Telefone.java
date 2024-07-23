package app;

public class Telefone {
    private String numero;

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        ligar(numero);
    }

    private void ligar(String numero) {
        System.out.println("Chamando: " + numero + " ...");
    }

    public void atender() {
        System.out.println("Atendendo Telefone");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
}
