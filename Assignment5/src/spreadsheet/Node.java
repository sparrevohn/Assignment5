package spreadsheet;


/**
 * Node associates an Expression object with a Position object
 * 
 * @author Kenneth S. Mørck
 * @version 8 december 2012
 */
public final class Node {
    
    //key and value are variables needed later
    private Position key;
    private Expression value;
    
    /**
     * Constructor for objects of class Node
     * 
     * @param key A Position object
     * @param value An Expression object
     */
    public Node (final Position key , final Expression value) {
        this.key = key;
        this.value = value;
    }
    
    /**
     * Method for getting the Position
     * 
     * @return The Position
     */
    public Position getKey() {
        return key;
    }
    /**
     * Method for getting the Expression
     * 
     * @return The Expression
     */
    public Expression getValue() {
        return value;
    }
    
    /**
     * Checks whether the node is the same as the one entered
     * 
     * @param other Another node to be compared
     * @return boolean value depicting whether they are the same or not
     */
    public boolean isEqualTo(final Node other) {
        return this.getKey() == other.getKey() &&
        this.getValue() == other.getValue();
    }
}