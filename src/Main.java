public class Main {
    public static void main(String [] args){

        Superficie pared = new Pared();
        Herramienta brocha = new Pincel();
        Pintor p1=new Pintor("Juan", 500);

        System.out.println(p1.pintar(brocha, pared));
    }
}
