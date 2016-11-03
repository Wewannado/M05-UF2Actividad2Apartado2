package m05uf2actividad2apartado2;

/**
 *
 * @author Roger G. Coscojuela
 */
public class DNI {

    public DNI(String nif) {
        this.nif = nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    private String nif;
    private String missatge;

    public void esValid() {

        
    final  String INCORRECT_FORMAT_LENGHT = "Format Incorrecte2";
    final  String NIF_CORRECT = "Nif Vàlid";
    final  String NIF_INCORRECT = "Format Incorrecte2";
    final  String INCORRECT_NUMERICAL_DATA = "Format Incorrecte2";
    final  char[] CHARNIF= {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    int num = 0;
    String letra;
    String numero;

    letra  = nif.substring(nif.length() - 1);
    numero  = nif.substring(0, nif.length() - 1);

    // primer mirem que la cadena tingui 8 o 9 caràcters:
    if (nif.length () 
        < 8 || nif.length() > 9) {
            missatge = INCORRECT_FORMAT_LENGHT;
    } // Després mirem que el número sigui convertible a enter.
        else {
            try {
            num = Integer.parseInt(numero);
            if (String.valueOf(CHARNIF[num % 23]).equals(letra)) {
                missatge = NIF_CORRECT;
            } else {
                missatge = NIF_INCORRECT;
            }
        } catch (NumberFormatException e) {
            missatge = INCORRECT_NUMERICAL_DATA;
        }
    }
    System.out.println (missatge);
}
}
