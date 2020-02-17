public interface Herramienta {

    //manipulacion de la informacion
    String getMaterial();
    void setMaterial(String material);
    String getCerdas();
    void setCerdas(String cerdas);
    String getTamaño();
    void setTamaño(String tamaño);
    int getPrecio();
    void setPrecio(int precio);

    //metodo
    String pintar();

}
