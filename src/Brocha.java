public class Brocha implements Herramienta {

    private String material="madera";
    private String cerdas="caballo";
    private String tamaño="chica";
    private int precio=50;

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public void setMaterial(String material) {
            this.material=material;
    }

    @Override
    public String getCerdas() {
        return cerdas;
    }

    @Override
    public void setCerdas(String cerdas) {
        this.cerdas=cerdas;
    }

    @Override
    public String getTamaño() {
        return tamaño;
    }

    @Override
    public void setTamaño(String tamaño) {
        this.tamaño=tamaño;
    }

    @Override
    public int getPrecio(){
        return precio;
    }
    @Override
    public void setPrecio(int precio){
        this.precio=precio;

    }
    @Override
    public String pintar() {
        return "brocha "+ " " +tamaño+" "+ " "+" "+precio+" "+ " "+cerdas;
    }

}
