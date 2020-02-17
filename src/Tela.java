public class Tela implements Superficie {

    private int tamaño=59;

    @Override
    public int getTamaño() {
        return tamaño;
    }

    @Override
    public void setTamaño(int tamaño) {
        this.tamaño=tamaño;
    }
}
