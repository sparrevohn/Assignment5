package spreadsheet;


/**
 * Position declares a placement
 * @author Kenneth S. Mørck 
 * @version 8. december 2012
 */
public final class Position
{

    private int column, row;

    /**
     * Constructor for objects of class Position
     * @param column Integer indicating column
     * @param row Integer indicating row
     */
    
    public Position(final int column, final int row) {
        this.column = column;
        this.row = row;
    }
    
    /**
     * Method for getting column indicators
     * 
     * @return Integer indicating the column
     */
    public int getColumn() {
        return this.column;
    }
    
    /**
     * Method for getting row indicators
     * 
     * @return Integer indicating the row
     */
    public int getRow() {
        return this.row;
    }
    
    /**
     * Matches an object of class Position to another
     * 
     * @return A boolean value to show whether they are the same or not
     */
    public boolean isEqualTo(final Position other) {
        return other.getColumn() == this.column && other.getRow() == this.row;
    }
}
