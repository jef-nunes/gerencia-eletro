import java.util.ArrayList;

public class Computador implements Dispositivo{
    
    private String cpu;
    private String ram;
    private ArrayList<Periferico> perifericos = new ArrayList<>();

    public Computador(String cpu, String ram, ArrayList<Periferico> perifericos){
        this.cpu = cpu;
        this.ram = ram;
        this.perifericos = perifericos;
    }
    
    @Override
    public void ligar(){
        System.out.println("Ligando o computador...");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando o computador...");
    }

    public void adicionarPeriferico(Periferico p){
        this.perifericos.add(p);
    }

    public void removerPeriferico(Periferico p){
        this.perifericos.remove(p);
    }

    public String getCpu() {
        return cpu;
    }



    public void setCpu(String cpu) {
        this.cpu = cpu;
    }



    public String getRam() {
        return ram;
    }



    public void setRam(String ram) {
        this.ram = ram;
    }



    public ArrayList<Periferico> getPerifericos() {
        return perifericos;
    }



    public void setPerifericos(ArrayList<Periferico> perifericos) {
        this.perifericos = perifericos;
    }
}
