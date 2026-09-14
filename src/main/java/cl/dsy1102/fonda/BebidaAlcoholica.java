package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable{

    private int LIMITE_UNIDADES_POR_CLIENTE;
    private double gradoAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;
    public BebidaAlcoholica(String nombre, int volumenML, int stock, int LIMITE_UNIDADES_POR_CLIENTE, double gradoAlcohol, boolean certificada, boolean ventaRestringida) {
        super(nombre, volumenML, stock);

        this.LIMITE_UNIDADES_POR_CLIENTE = LIMITE_UNIDADES_POR_CLIENTE;
        this.gradoAlcohol = gradoAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = ventaRestringida;
    }

    public int getLIMITE_UNIDADES_POR_CLIENTE() {
        return LIMITE_UNIDADES_POR_CLIENTE;
    }

    public void setLIMITE_UNIDADES_POR_CLIENTE(int LIMITE_UNIDADES_POR_CLIENTE) {
        this.LIMITE_UNIDADES_POR_CLIENTE=LIMITE_UNIDADES_POR_CLIENTE;
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    public boolean getCertificada(){
        return certificada;
    }

    public void setCertificada(boolean certificada){
        this.certificada = certificada;
    }

    public boolean getVentaRestringida(){
        return ventaRestringida;
    }

    public void setVentaRestringida(boolean ventaRegistrada){
        this.ventaRestringida = ventaRegistrada;
    }


    public boolean tieneVentaRestringida(){
        return ventaRestringida;
    }

    @Override
    public boolean ventaRestringida(){
        return ventaRestringida;
    }

    @Override
    public void restringirVenta(){
        System.out.println("La venta ha sido restringida");
    }

    @Override
    public boolean superaLimites(){
        return false;
    }

    @Override
    public void calcularPrecio(){
        System.out.println("Calculando precio");
    }

    @Override
    public void obtenerDetalle(){
        System.out.println("Bebica alcoholica");
        System.out.println("Nombre de la bebida: "+ nombre);
        System.out.println("Volumen de la bebida: "+ volumenML);
        System.out.println("Stock de la bebida: "+ stock);
        System.out.println("Grado de la bebida: "+ gradoAlcohol);
        System.out.println("Certificado: "+ certificada);
        System.out.println("Venta restringida: "+ ventaRestringida);
        System.out.println("----------------------------------------");
    }
}
