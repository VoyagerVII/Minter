package Minter;
import java.util.Hashtable;
public class Authentication extends Account {
	private String key;
    private int index;
    private Hashtable<Integer, String> hashTable;

    public Authentication(String username, String email, String password, String fullName, String key) {
        super(username, email, password, fullName);
        this.key = key;
        this.index = 0;
        this.hashTable = new Hashtable<Integer, String>();
    } 

    public void hash(String str) {
        String hashedStr = str + key;
        int hash = hashedStr.hashCode();
        hashTable.put(index, hashedStr);
        index++;
        System.out.println("String hashed and added to hashtable.");
        
    }
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Hashtable<Integer, String> getHashTable() {
        return hashTable;
    }

    public void setHashTable(Hashtable<Integer, String> hashTable) {
        this.hashTable = hashTable;
    }
}
