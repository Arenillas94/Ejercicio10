package proyectoentornos;

/*ESTA LINEA ESTA MODIFICADA POR GITHUB*/
/**
 * Clase para determinar el mayor, menor y media, de los números introducidos
 *
 * @version 1
 * @author Jose Manuel Alba Jimenez
 * @see Math
 * @see Math#max
 * @see Math#min
 */
public class proyecto {

    private int mayor; // Atributo que almacena el mayor de los números introducidos de tipo entero.
    private float media; // Atributo que almacena la media de los números introducidos de punto flotante.
    private int menor; // Atributo que almacena el menor de los números introducidos de tipo entero.

    /**
     * Cálculo del mayor de los 2 números introducidos y almacena
     *
     * en la @param mayor el valor máximo de ambos números.
     *
     * @param Valor1 Valor númerico entero introducido por el usuario.
     *
     * @param Valor2 Valor númerico entero introducido por el usuario.
     *
     * @return Devuelve el mayor en valor númerico entero.
     *
     * @exception RuntimeException Recibido cuando se introducen valores que no
     * coinciden con los tipo de parametros del método.
     */
    public int Mayor(int Valor1, int Valor2) {
        mayor = Math.max(Valor1, Valor2);
        return mayor;

    }

    /**
     * Cálculo de la media de los 2 números introducidos y almacena
     *
     * en la @param media el valor medeia de ambos números.
     *
     * @param Valor1 Valor númerico entero introducido por el usuario.
     *
     * @param Valor2 Valor númerico entero introducido por el usuario.
     *
     * @return Devuelve la media en valor númerico de punto flotante.
     *
     * @exception RuntimeException Recibido cuando se introducen valores que no
     * coinciden con los tipo de parametros del método.
     */
    public float Media(int Valor1, int Valor2) {
        media = (Valor1 + Valor2 + 100) / 2; //La media tiene que aumentar en 100
        return media;
    }

    /**
     * Cálculo del menor de los 2 números introducidos y almacena en la @param
     * menor el valor mínimo de ambos números.
     *
     * @param Valor1 Valor númerico entero introducido por el usuario.
     *
     * @param Valor2 Valor númerico entero introducido por el usuario.
     *
     * @return Devuelve el mayor de tipo entero.
     *
     * @exception RuntimeException Recibido cuando se introducen valores que no
     * coinciden con los tipo de parametros del método.
     */
    public int Menor(int Valor1, int Valor2) {
        menor = Math.min(Valor1, Valor2);
        return menor;
    }

    /**
     * Método para obtener el valor almacenado en el atributo @param mayor
     *
     * @return Devuelve el valor almacenado en el atributo @param mayor
     */
    public int getMayor() {
        return mayor;
    }

    /**
     * Método para obtener el valor almacenado en el atributo @param media
     *
     * @return Devuelve el valor almacenado en el atributo @param media
     */
    public float getMedia() {
        return media;
    }

    /**
     * Método para obtener el valor almacenado en el atributo @param menor
     *
     * @return Devuelve el valor almacenado en el atributo @param menor
     */
    public int getMenor() {
        return menor;
    }

    /**
     * Cálculo del menor de los 2 números introducidos y almacena en la @param
     * menor el valor mínimo de ambos números.
     *
     * @param Valor1 Valor númerico entero introducido por el usuario.
     *
     * @param Valor2 Valor númerico entero introducido por el usuario.
     *
     * @return Devuelve el mayor de tipo entero.
     *
     * @deprecated Desaconsejado su uso debido a implementación de un método que
     * no contiene fallos al recibir dos valores iguales.
     */
    public int Menor1(int Valor1, int Valor2) {

        if (Valor1 > Valor2) {
            menor = Valor1;
            return menor;
        } else if (Valor1 < Valor2) {
            menor = Valor2;
            return menor;
        }
        return menor = Valor1;
    }

}
