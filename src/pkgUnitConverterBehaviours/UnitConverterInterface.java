package pkgUnitConverterBehaviours;

/**
 * <p>
 * This is the Interface for CST8288-Object Oriented Programming with design patterns(Java) Lab 1.
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
 * This class is the Interface that defined the general strategy and is going to
 * be implemented by converters of specific type.
 * </p>
 *
 */
public interface UnitConverterInterface {
    
    /**
     * This method return the name of Unit one that is to be converted.
     * @return The name of Unit one that is to be converted.
     */
    public String getUnit1Name();

    /**
     * This method return the name of the Unit two that is to be converted into.
     * @return the name of the Unit two that is to be converted into
     */
    public String getUnit2Name();

    /**
     * This method return the amount of Unit one that is to be converted.
     * @return The amount of Unit one that is to be converted in double.
     */
    public String getUnit1Amount();
    
    /**
     * This method is responsible for convert one unit into another.
     * @param unit1Amount The amount of Unit one that is to be converted in double.
     * @return The amount of Unit two that is converted into in form of double.
     */
    public double convert(double unit1Amount);
    
    
}
