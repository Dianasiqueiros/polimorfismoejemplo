public class Pared implements Superficie {

    private int tamaño=200;

    @Override
    public int getTamaño() {
        return tamaño;
    }
    @Override
    public void setTamaño(int tamaño) {
        this.tamaño=tamaño;
    }
}
