package app;

public class ReprodutorDeMusica {
    private String musica;

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música Pausada");
    }

    private void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    public String getMusica (){
        return musica;
    }
    public void setMusica (String musica){
        selecionarMusica(musica);
    }
}
