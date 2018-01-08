
/**
 * Justin Seda
 * 
 * This program demonstrates getter and setter.
 */
public class Door
{
    private String name;
    private String state;

    public Door() {
        name = "";
        state = "";
    }
    
    public Door ( String newName, String newState) {
        name = newName;
        state = newState;
    }    

    public void close() {
        state = "close";
    }

    public void open() {
        state = "open";
    }

    public String getName() {
        return name;
    }

    public String getState() {
        return state;
    }

    public void setName( String newName){
        name = newName;
    }

    public void setState( String newState) {
        state = newState;
    }
}

