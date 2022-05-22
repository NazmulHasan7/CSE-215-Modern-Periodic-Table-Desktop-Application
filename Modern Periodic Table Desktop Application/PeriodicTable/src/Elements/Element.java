
package Elements;

public abstract class Element {

   //Declaration part	
	private int atomicNumber;
	private String name;
	private String symbol;
	private String electron;
	private String origin;
	private int group;
	private char block;

    // No argument constructor  	
	protected Element () {
		super();
		name = null;
		symbol = null;
		electron = null;
		origin = null;
	}
	
	// Constructor with all data fields
    protected Element (int atomicNumber, String name, String symbol, String electron, 
    		String origin, int group, char block) {
    	
	    super();
	    this.atomicNumber = atomicNumber;
	    this.name = name;
	    this.symbol = symbol;
	    this.electron = electron;
	    this.origin = origin;
	    this.group = group;
	    this.block = block;

    }

    //Getters and Setters for Atomic Number
	public int getAtomicNumber() {
		return atomicNumber;
	}
	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}
	
	//Getters and Setters for Name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Getters and Setters for Symbol
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	//Getters and Setters for Electron
	public String getElectron() {
		return electron;
	}
	public void setElectron(String electron) {
		this.electron = electron;
	}
	
	//Getters and Setters for Origin name
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	//Getters and Setters for Group
	public int getGroup() {
		return group;
	}
	public void setGroup(int group) {
		this.group = group;
	}
	
	//Getters and Setters for Block
	public char getBlock() {
		return block;
	}
	public void setBlock(char block) {
		this.block = block;
	}
	
	//Abstract methods
	public abstract String properties ();
	public abstract String behaviour ();

	//To String method with definition of elements  
	@Override
	public String toString() {
		return "Atomic Number -------------- " + atomicNumber + ","+
				   "\nName ------------------------ " + name + ","+
				   "\nSymbol ---------------------- " + symbol + ","+
				   "\nElectron  Configuration ------ " + electron + ","+
				   "\nOrigin of Name -------------- " + origin + ","+
				   "\nGroup ----------------------- " + group + ","+
				   "\nBlock ------------------------ " + block + ","; 
		
	} 
    
}

