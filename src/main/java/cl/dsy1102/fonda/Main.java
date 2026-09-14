package cl.dsy1102.fonda;

public class Main {
    public static void ConsumoResponsable(){
        ConsumoResponsable c=new ConsumoResponsable() {
            @Override
            public boolean ventaRestringida() {
                return false;
            }

            @Override
            public void restringirVenta() {
            }

            @Override
            public boolean superaLimites() {
                return false;
            }
        };



    }
    public static void main(String[] args) {

        Bebida[] bebidas ={
                new BebidaAlcoholica("Chicha", 1000, 40, 3, 12.0, false, true),
                new BebidaAlcoholica("Pisco Sour", 500, 25, 3, 18.0, true, false),
                new BebidaSinAlcohol("Chicha", 1000, 60, 95),
                new BebidaSinAlcohol("Mote con Huesillo", 400, 50, 70),
        };

        for(Bebida bebida:bebidas){
            bebida.obtenerDetalle();
        }
    }
}
