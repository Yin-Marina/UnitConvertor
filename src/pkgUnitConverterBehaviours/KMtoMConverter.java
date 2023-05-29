package pkgUnitConverterBehaviours; 


/**
 * <p>
 * This is the the Kilometers to Miles conversion behaviour class
 * for CST8288-Object Oriented Programming with design patterns(Java) Lab 1.
 * </p>
 * <p>
 * This program demonstrate a unit converter redesigned using strategy pattern.
 * </p>
 * 
 * <pre>
 * Class: CST8288 - Lab Section: 013
 * </pre>
 * 
 * <pre>
 * Lab Professor: Siju Philip
 * </pre>
 * 
 * <pre>
 * Date: Jan. 23, 2023
 * </pre>
 * 
 * @author Mutao Yin
 * @version 1.0
 * 
 * <p>
 * This class is the concrete strategy class that implements the general strategy class
 * (UnitConverterInterface) and facilitates in convert Miles to Kilometers.
 * </p>
 *
 */


public class KMtoMConverter implements UnitConverterInterface{
    
    
    private double unit1Amount;
    private final double convFactor=1.609;
    private final double convOrigin=0.0;
    
    /**
     * This is the conversion method to do the calculation when converting from 
     * Kilometers to Miles.
     * @param unit1Amount The amount of Kilometers in double.
     * @return The equivalent of the Miles in double.
     */
    @Override
    public double convert(double unit1Amount) {
        this.unit1Amount = unit1Amount;
        return (unit1Amount- convOrigin)/ convFactor ;   
    }
    
    /**
     * This method returns the string Kilometer for String representation.
     * @return String "Kilometers"
     */
    @Override
    public String getUnit1Name() {
        return "Kilometers";
    }
    
    /**
     * This method returns the string Miles for String representation.
     * @return String "Miles"
     */
    @Override
    public String getUnit2Name() {
        return "Miles";
    }

    /**
     * This method returns the amount in Kilometers in string for String representation.
     * @return The string representation of amount in Kilometers.
     */
    @Override
    public String getUnit1Amount() {
        return String.format("%.2f",unit1Amount );
    }

    
}