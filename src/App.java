import proxy.AudioIf;
import proxy.ProxyAudio;

public class App {
    public static void main(String[] args) throws Exception {
        AudioIf novoAudio = new ProxyAudio("audio1.mp3");

        novoAudio.play();
        System.out.println();
        novoAudio.play();
    }
}
