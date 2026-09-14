package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida{
    private int azucarPorLitro;
    public BebidaSinAlcohol(String nombre, int volumenML, int stock, int azucarPorLitro) {
        super(nombre, volumenML, stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    public int getAzucarPorLitro() {
        return azucarPorLitro;
    }

    public void setAzucarPorLitro(int azucarPorLitro) {
        this.azucarPorLitro = azucarPorLitro;
    }

    @Override
    public void calcularPrecio(){
        System.out.println("La bebida cuesta: ");
    }
    @Override
    public void obtenerDetalle(){
        System.out.println("Bebida sin alcohol");
        System.out.println("Nombre del bebida: "+ nombre);
        System.out.println("Volumen ml: "+ volumenML);
        System.out.println("Stock: "+ stock);
        System.out.println("Azucar precio: "+ azucarPorLitro);
        System.out.println("----------------------------------------");
    }

}
