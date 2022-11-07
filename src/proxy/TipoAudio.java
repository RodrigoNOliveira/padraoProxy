package proxy;

public class TipoAudio implements AudioIf{

    private String nomeArq;

    



    public TipoAudio(String nomeArq) {
        this.nomeArq = nomeArq;
        carregandoArq(nomeArq);
    }





    public void carregandoArq(String nome) {
        System.out.println("Carregando o arquivo " + nome + " do disco");
    }





    @Override
    public void play() {
        System.out.println("Tocando o arquivo: " + nomeArq);
        
    }
    
}
