package spreadsheet;


/**
 * SinglyLinkedListMap creates a naive list of Nodes
 * 
 * @author Kenneth S. Mørck
 * @version 8 december 2012
 */
public class SinglyLinkedListMap {
    
    //head indicates the first Node in the list
    //tail indicates the rest of the list
    LinkedNode head;
    LinkedNode tail;
    
    /**
     * LinkedNode is a class needed
     * to make the Nodes refer to one another
     */
    private class LinkedNode {
        
        //current is the Node we are looking at
        //next is the Node current will refer to
        Node current;
        LinkedNode next;
        
        /**
         * Constructor for objects of class LinkedNode
         * 
         * @param x Position for the Node in the list
         * @param y Expression for the Node in the list
         */
        private LinkedNode (final Position x, final Expression y) {
            current = new Node(x,y);
            next = null;
        }
    }
    
    /**
     * Creates a new list with 0 objects
     */
    public SinglyLinkedListMap() {
        head = null;
        tail = null;
    }
    
    /**
     * Method for inserting Nodes to our list
     * 
     * @param key Position we want for the Node
     * @param value Expression we want for the Node
     */
    public void insert (final Position key, final Expression value) {
        //tempNode is here to make it more readable
        //and will be the one inserted into the list
        LinkedNode tempNode = new LinkedNode(key, value);
        if (head == null) {
            head = tempNode;
            tail = tempNode;
        }
        else { tail.next = tempNode;
            tail = tempNode;
        }
    }
    
    /**
     * Looks up the Position to find the associated Expression
     * 
     * @param key Position we want to look up
     * @return Returns the Expression if the Position is found
     *         otherwise it returns null
     */
    public Expression lookup(final Position key) {
        LinkedNode temp = head;
        if (temp == null) {
        return null;
        }
        while (temp != tail) { 
            if (temp.current.getKey().isEqualTo(key)) {
                return temp.current.getValue();
            }
            else temp = temp.next;
            }
        if (tail.current.getKey().isEqualTo(key)) {
            return tail.current.getValue();
        }
        else return null;
    }
}

