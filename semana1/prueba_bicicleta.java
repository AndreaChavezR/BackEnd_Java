package semana1;

public class prueba_bicicleta {

    public static void main(String[] args){
        def();

    }

    public static void def() {
        bicicleta biciMontana = new bicicleta();
        biciMontana.setColor("Negro");
        biciMontana.setPins(5);
        biciMontana.setRodada(21);
        biciMontana.setVelocidad(36.5);

        String msg = "Soy una bicicleta de montaña con estas caracteristicas: ";
        msg += "\nColor: "+biciMontana.getColor();
        msg += "\nVelocidad: "+biciMontana.getVelocidad();
        msg += "\nPins: "+biciMontana.getPins();
        msg += "\nRodada: "+biciMontana.getRodada();

        System.out.println(msg);

    }
}
