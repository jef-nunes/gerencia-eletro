public class Smartphone implements Dispositivo{
    private double bateria;
    private String sistemaOp;

    public Smartphone(double bateria, String sistemaOp) {
        this.bateria = bateria;
        this.sistemaOp = sistemaOp;
    }

    @Override
    public void ligar(){
        System.out.println("Ligando o smartphone...");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando o smartphone...");
    }

    public void carregarBateria(){
        System.out.println("Carregando a bateria...");
    }

    public void instalarApp(String nomeApp){
        System.out.println("Instalando o app "+nomeApp+"...");
    }



    public double getBateria() {
        return bateria;
    }



    public void setBateria(double bateria) {
        this.bateria = bateria;
    }



    public String getSistemaOp() {
        return sistemaOp;
    }



    public void setSistemaOp(String sistemaOp) {
        this.sistemaOp = sistemaOp;
    }
}
