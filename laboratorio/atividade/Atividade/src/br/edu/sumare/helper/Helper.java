/*
 * @category    Helpers
 * @package     helper
 * @developer    Elder Sergio Xavier RA 1323594 / Henrique Alexandrino Pires Paes RA: 1320855
 * @contact      contato@elderxavier.com.br / henriqalexandrino@gmail.com
 * @created      2016-25-09
 * @last update  2016-25-09
 * @Developer    Elde Xavier
 * @contact      contato@elderxavier.com.br
 */

package br.edu.sumare.helper;


public class Helper {
    
    public boolean isNumero(String numero) { 
        boolean ret = true;
        int convert = 0;
        try {
            convert = Integer.parseInt(numero);
        } catch (NumberFormatException ne) {
            ret = false;
        }
        return ret;
    }
    
}
