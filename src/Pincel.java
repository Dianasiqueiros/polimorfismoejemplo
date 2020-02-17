public class Pincel implements Herramienta{
    private String material="plastico";
    private String cerdas="camello";
    private String tamaño="mediano";
    private int precio=100;


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
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
            this.precio=precio;
    }

    @Override
    public String pintar() {
        return "pincel " + " "+tamaño+" " +" "+ cerdas +" " + " "+precio;
    }
}
