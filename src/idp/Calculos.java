
package idp;

/**
 *
 * @author Eduardo Xoquic
 */
public class Calculos {
    public double calculoIDP(double tipo,double precioGalon, double total){
        
        double totalGalones;
        double totalIDP;
        totalGalones=total/precioGalon;
        totalIDP=totalGalones*tipo;
        return totalIDP;
        
    }
}
