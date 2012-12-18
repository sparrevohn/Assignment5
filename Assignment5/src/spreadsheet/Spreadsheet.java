package spreadsheet;

import java.util.ArrayList;


/**
 * Spreadsheet is the overall class that uses the other classes
 * in our case we chose to use SinglyLinkedListMap over DynamicArrayMap
 * 
 * @author Kenneth S. Mørck
 * @version 8 december 2012
 */
public class Spreadsheet {
      
    //creates a variable list with the indicated type
    private ArrayList<Node> list;
    private static int counter;
    private String name = "";
    private int hash;
    
    /**
     * Constructor for objects of class Spreadsheet
     * Creates a new SinglyLinkedListMap and saves it in the list variable
     */
    public Spreadsheet() {
        list  = new ArrayList<Node>();
        name = "Sheet" + counter;
        counter++;
        hash = counter;
    }
    
    public int hashCode() {
    	return hash;
    }
    
    public String getName() {
    	return name;
    }
    
    /**
     * Method that refers to the insert method in SinglyLinkedListMap
     * 
     * @param position The Position we wish for our Node to have
     * @param expression The Expression we wish for our Node to have 
     */
    public void set(final Position position, final Expression expression) {
        list.add(new Node(position, expression));
    }
    
    /**
     * Method referring to the lookup method in SinglyLinkedListMap
     * 
     * @param position The Position we wish to look for
     * @return Returns the Expression associated with the given Position
     *         otherwise if no Position matches it returns null
     */
    public Expression get(final Position position) {
        for (Node node : list) {
        	if (node.getKey().isEqualTo(position)) {
        		return node.getValue();
        	}
        }
        return null;
    }
    
    public boolean equals(Spreadsheet sheet) {
    	if (sheet != null)
    	return sheet.getName().equals(this.getName());
    	else return false;
    }    
}
