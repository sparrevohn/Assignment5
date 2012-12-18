package spreadsheet;

import java.util.Arrays;

/**
 * DynamicArrayMap creates an array to store Nodes
 * also we import the array map in order to make this work
 * 
 * @author Kenneth S. Mørck
 * @version 8 december 2012
 */
public class DynamicArrayMap {
      
    //We create an Array of nodes an call it arrayMap
    //counter is an integer for keeping track of the amount of nodes in the Array
    Node[] arrayMap;
    int counter;
    
    /**
     * Creates a new array with the length 1 and places null in it
     * also sets the counter to 0 since no Nodes are stored yet
     */
    public DynamicArrayMap() {
        arrayMap = new Node[1];
        //The array is 0-indexed so the position 0 is the first position
        arrayMap[0] = null;
        counter = 0;
    }
    
    /**
     * Inserts a new Node in our array
     * 
     * @param key The Position we want for our Node
     * @param value The Expression we want for our Node
     */
    public void insert(final Position key, final Expression value) {
        //An array has a limited amount of space and Java gets mad 
        //if we try to place something outside the space the array holds
        //therefore we check the length of the array and double it if it's to small
        if (arrayMap.length <= counter) { 
            arrayMap = Arrays.copyOf(arrayMap, (arrayMap.length)*2);
            arrayMap[counter] = new Node (key, value);
        }
        else { arrayMap[counter] = new Node (key, value); 
        }
        counter++;
    }
    
    /**
     * Looks up a Position to find the Expression it is associated with
     * 
     * @param key The Position we wish to search for
     * @return Returns the Expression if the Position is found
     *         otherwise it returns null
     */
    public Expression lookup(final Position key) {
        //i is a temporary counter
        int i = 0;
        while (i < counter) { 
              if (arrayMap[i].getKey().isEqualTo(key)) {
            	  
                  return arrayMap[i].getValue();
              }
              else { i++;
              }
        } return null;
    }
}
