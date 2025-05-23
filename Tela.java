public class Tela {
    private int resolucao;
    private double tamanho;
    private int brilho;

    public Tela(int resolucao, double tamanho, int brilho) {
        this.resolucao = resolucao;
        this.tamanho = tamanho;
        this.brilho = brilho;
    }

    public int getResolucao() {
        return resolucao;
    }

    public void setResolucao(int resolucao) {
        this.resolucao = resolucao;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getBrilho() {
        return brilho;
    }

    public void setBrilho(int brilho) {
        this.brilho = brilho;
    }
    
    public void ajustarBrilho(int quantidade){
        this.brilho += quantidade;
    }
}
