//Authentication.java
//04/25/2023
//This will help to authenticate existing account
package Minter;
import java.util.Hashtable;
//Authentication is a subclass of Account class
public class Authentication extends Account {
//private variables to store information within the class
	private String key;
    private int index;
    private Hashtable<Integer, String> hashTable;
//sets the authentication values
    public Authentication(String username, String email, String password, String fullName, String key) {
        super(username, email, password, fullName);
        this.key = key;
        this.index = 0;
        this.hashTable = new Hashtable<Integer, String>();
    } 
//function that is used to hash the strings
    public void hash(String str) {
        String hashedStr = str + key;
        int hash = hashedStr.hashCode();
        hashTable.put(index, hashedStr);
        index++;
        System.out.println("String hashed and added to hashtable.");
        
    }
   //returns the key
    public String getKey() {
        return key;
    }
    //setter to set the key
    public void setKey(String key) {
    	if (key==null)
        {
        	//input validation
    		throw new IllegalArgumentException ("Input must be valid");
        }
    	this.key = key;
    }
     //gets the index
    public int getIndex() {
        return index;
    }
    //sets the index
    public void setIndex(int index) {
    	if (index<0)
        {
        	//checks for input validation
    		throw new IllegalArgumentException ("Input must be valid");
        }
    	this.index = index;
    }
//returns the hash
    public Hashtable<Integer, String> getHashTable() {
        return hashTable;
    }
//sets the hashtable
    public void setHashTable(Hashtable<Integer, String> hashTable) {
        this.hashTable = hashTable;
    }
}
