package pkgUnitConverterMain;

import pkgUnitConverterBehaviours.*; 

/**
 * <p>
 * This is main method for CST8288-Object Oriented Programming with design patterns(Java) Lab 1.
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
 * This class is the client class within the pattern and provide testing context for the unitConverters.
 * </p>
 *
 */

public class YinMutaoLab1 {
    
    /**
     * This is the main method that create a UnitConverter Object, conduct conversion and change behavior.
     * @param args arguments passed from command line
     */
    public static void main(String[] args){
        UnitConverter a = new UnitConverter();
        a.convert(12.0);
        System.out.println(a);
        
        a.changeConverter(new FtoCConverter());
        a.convert(53.6);
        System.out.println(a);
        
        a.changeConverter(new MtoKMConverter());
        a.convert(53.6);
        System.out.println(a);
        
        a.changeConverter(new KMtoMConverter());
        a.convert(53.6);
        System.out.println(a);
    }
    
}
