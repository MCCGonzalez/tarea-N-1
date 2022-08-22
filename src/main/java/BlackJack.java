import java.util.Random;

public class BlackJack {

    public static void main(String[] args) {

        llamarFunciones();

    }

    public static String[][] crearBaraja() {

        var pintas = new String[]{"Corazón", "Diamante", "Trébol", "Pica"};
        var numeroCartas = new String[]{"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        return new String[][]{pintas, numeroCartas};


    }
    public static String[] crearMano(String[][] baraja){

        return new String[2];

     }

    public static void barajar(String[][] baraja) {

        System.out.println(baraja.length);

        for (int  i = 0; i < baraja.length; i++){
            for (int j = 0; j <baraja[i].length; j++){
                int i1 = (int)(Math.random() * baraja.length);
                int j1 = (int)(Math.random() * baraja[i].length);

                String temp = baraja[i][j];
                baraja[i][j] = baraja[i1][j1];
                baraja[i1][j1] = temp;

            }
        }

    }
   /* public static void repartir(String[][] baraja, String[] mano){


    }
    public static void pedirCartas(String[][] baraja, String[] mano){

    }
    public static void bajarse(String[] manoJugador, String[] manoDealer){

    }
    public static boolean esBlackJack(String[] mano){

    }
    public static boolean verificarGanador (String[] manoJugador, String[] manoDealer){

    }
    public static void mostrarMenu(){

    }*/

    public static void llamarFunciones(){

        String[][] baraja = crearBaraja();
        String[] mano = crearMano(baraja);
        barajar(baraja);
        
    }
}

