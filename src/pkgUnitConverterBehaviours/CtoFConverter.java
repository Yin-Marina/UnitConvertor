package pkgUnitConverterBehaviours;


/**
 * <p>
 * This is the Celsius to Fahrenheit conversion behaviour class
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
 * (UnitConverterInterface)and facilitates in convert Celsius to Fahrenheit.
 * </p>
 *
 */
public class CtoFConverter implements UnitConverterInterface{
    
    private double unit1Amount;
    private final double convFactor=1.8;
    private final double convOrigin=32.0;

    /**
     * This is the conversion method to do the calculation when converting from 
     * Celsius to Fahrenheit.
     * @param unit1Amount The amount of Celsius degrees in double.
     * @return The equivalent of the Fahrenheit degrees in double.
     */
    @Override
    public double convert(double unit1Amount) {
        this.unit1Amount = unit1Amount;
        return unit1Amount * convFactor + convOrigin;   
    }

    /**
     * This method returns the string Celsius for String representation.
     * @return String "Celsius"
     */
    @Override
    public String getUnit1Name() {
        return "Celsius";
    }

    /**
     * This method returns the string Fahrenheit for String representation.
     * @return String "Fahrenheit"
     */
    @Override
    public String getUnit2Name() {
        return "Fahrenheit";
    }

    /**
     * This method returns the amount of Celsius degrees in string for String representation.
     * @return The string representation of Celsius degrees.
     */
    @Override
    public String getUnit1Amount() {
        return String.format("%.2f",unit1Amount );
    }
    
    
}

