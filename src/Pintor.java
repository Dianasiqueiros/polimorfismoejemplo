public class Pintor {

    private String name;
    private int precio;

    public Pintor(String name, int precio){
        this.name=name;
        this.precio=precio;
    }

    public String pintar(Herramienta herramienta, Superficie superficie){

        return name + " pintando con " + herramienta.pintar() + " en "  + superficie.getTamaño();
    }
}
