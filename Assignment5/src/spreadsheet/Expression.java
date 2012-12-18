package spreadsheet;


/**
 * Expression holds a string value
 * 
 * @author Kenneth S. Mørck
 * @version 8 december 2012
 */
public abstract class Expression {
    public abstract boolean toBoolean();
        
    public abstract int toInt();
    
    public abstract String toString();
    
}
