package m05uf2actividad2apartado2;

/**
 * Aquesta classe incorpora metodes per a instanciar un objecte DNI
 *
 * @author Roger G. Coscojuela
 */
public class DNI {

    private String nif;
    private String letra;
    private String numero;

    /**
     * Creem un objecte de tipus NIF.
     *
     * @param nif el NIF de l'objecte
     */
    public DNI(String nif) {
        this.nif = nif;
    }

    /**
     * Actualitza el valor del NIF de l'objecte.
     *
     * @param nif El NIF que volem inserir
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     *
     * @return el ultim caracter del NIF (Per a DNI's correctes, una lletra)
     */
    public String getLletra() {
        this.letra = nif.substring(nif.length() - 1);
        return letra;
    }

    /**
     *
     * @return La part corresponen a la part numerica del DNI
     */
    public String getNumero() {
        this.numero = nif.substring(0, nif.length() - 1);
        return numero;
    }

    /**
     * Valida un objecte DNI
     * @return True per a DNI valid, false en cas contrari.
     * @throws m05uf2actividad2apartado2.IncorrectNumericalDataException
     * @throws m05uf2actividad2apartado2.IncorrectFormatLengthException
     */
    public boolean esValid() throws IncorrectNumericalDataException, IncorrectFormatLengthException {

        final String INCORRECT_FORMAT_LENGHT = "Longitud incorrecta.";
        final String INCORRECT_NUMERICAL_DATA = "Format de la part numerica incorrecte";
        final char[] CHARNIF = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        final int DNI_MAX_LENGTH = 9;
        final int DNI_MIN_LENGTH = 8;
        boolean result = false;

        // primer mirem que la cadena tingui una llargaria correcta:
        if (nif.length() < DNI_MIN_LENGTH || nif.length() > DNI_MAX_LENGTH) {
            throw new IncorrectFormatLengthException(INCORRECT_FORMAT_LENGHT);

        } // Després mirem que el número sigui convertible a enter.
        else {
            try {
                result = String.valueOf(CHARNIF[Integer.parseInt(getNumero()) % 
                        CHARNIF.length]).equals(getLletra());
            } catch (NumberFormatException e) {
                throw new IncorrectNumericalDataException(INCORRECT_NUMERICAL_DATA);
            }
        }
        return result;
    }

}