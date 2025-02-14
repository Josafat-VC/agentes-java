import java.util.Arrays;
import java.util.HashMap;

public class SubMapa {
    protected char[][] subMapa;
    private  HashMap<Integer, Integer> recorridoY;
    private HashMap<Integer, Integer> recorridoX;
    private int idHash = 1;



    public SubMapa() {
        subMapa = new char[10][10];

        for (char[] filas : subMapa) {
            Arrays.fill(filas, ' ');
        }
        recorridoY = new HashMap<>();
        recorridoX = new HashMap<>();

    }


    public HashMap<Integer, Integer> getRecorridoY() {
        return recorridoY;
    }

    public HashMap<Integer, Integer> getRecorridoX() {
        return recorridoX;
    }

    public void imprimirSubMapa() {
        System.out.println("Imprimiendo submapa del Agente");
        for (int filas = 0; filas < subMapa.length; filas++) {
            for (int columnas = 0; columnas < subMapa[filas].length; columnas++) {
                System.out.print(subMapa[filas][columnas] + " ");
            }
            System.out.println();
        }
    }


    public void movimientosSubMapa(int posicionX, int posicionY) {
        if(subMapa[posicionY][posicionX] != 'X'){
            subMapa[posicionY][posicionX] = 'X';
            coordenadaY(posicionY);
            coordenadaX(posicionX);
            idHash++;
        }

    }

    private void coordenadaY(int posicionY) {
        recorridoY.put(idHash, posicionY);
    }

    private void coordenadaX(int posicionX) {
        recorridoX.put(idHash, posicionX);
    }

}



