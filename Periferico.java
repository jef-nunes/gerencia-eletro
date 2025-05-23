public class Periferico {
    private String tipo;
    private String marca;
    
    public Periferico(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }
    
    public void conectar(){
        System.out.println("Conectado");
    }
    public void desconectar(){
        System.out.println("Desconectado");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
