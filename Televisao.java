public class Televisao implements Dispositivo {
    private int canalAtual;
    private int volume;

    @Override
    public void ligar(){
        System.out.println("Ligando a televisão...");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando a televisão...");
    }

    public void mudarCanal(int canal){
        this.canalAtual = canal;
    }

    public void ajustarVolume(int quantidade){
        this.volume += quantidade;
    }

    public int getCanalAtual() {
        return canalAtual;
    }

    public void setCanalAtual(int canalAtual) {
        this.canalAtual = canalAtual;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    
}
