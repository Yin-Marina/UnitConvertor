package pkgUnitConverterBehaviours; 

/**
 * <p>
 * This is the context class for CST8288-Object Oriented Programming with design patterns(Java) Lab 1.
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
 * This class is the context class within the pattern and provide initialization 
 * of new UnitConverter Object, calculation method,
 * behavior changing method and String representation method.
 * </p>
 *
 */
public class UnitConverter {
    private double unit2Amount;
    private UnitConverterInterface unitConverterInterface;
    
    /**
     * This constructor initialize a new UnitConverter Object with the behavior of 
     * CtoFConverter that convert Celsius to Fahrenheit. 
     */
    public UnitConverter(){
        this.unitConverterInterface = new CtoFConverter();
    }
    
    /**
     * This method takes the amount of unit one and convert it into unit two
     * based on the behavior set.
     * @param unit1Amount The amount of unit one in double.
     */
    public void convert(double unit1Amount){
        this.unit2Amount = this.unitConverterInterface.convert(unit1Amount);
    }
    
    /**
     * This method takes the object that implements unitConverterInterface and 
     * change the conversion based on the type of object.
     * @param unitConverterInterface The Object that implements unitConverterInterface and will determine conversion.
     */
    public void changeConverter(UnitConverterInterface unitConverterInterface){
        this.unitConverterInterface = unitConverterInterface;
    }
    
    /**
     * This class produce a string representation of the conversion, including the name and amount
     * of Unit one and Unit 2.
     * @return a string representation of the conversion, including the name and amount of Unit one and Unit 2
     */
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.unitConverterInterface.getUnit1Amount());
        builder.append(" ");
        builder.append(this.unitConverterInterface.getUnit1Name());
        builder.append(" is equal to ");
        builder.append(String.format("%.2f", this.unit2Amount));
        builder.append(" ");
        builder.append(this.unitConverterInterface.getUnit2Name());
    return builder.toString();
    }
    
}
