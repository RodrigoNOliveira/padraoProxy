package proxy;

public class ProxyAudio implements AudioIf{


    private TipoAudio audio;
    private String nomeArq;


    

    public ProxyAudio(String nomeArq) {
        this.nomeArq = nomeArq;
    }




    @Override
    public void play() {
        if(audio == null){
            System.out.println("Não havia sido instanciado ... criando instancia");
            audio = new TipoAudio(nomeArq);
        }
        else {
            System.out.println("recuperando instância anterior");
        }
        audio.play();
        
    }
    
}
