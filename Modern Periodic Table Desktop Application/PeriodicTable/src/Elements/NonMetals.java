
package Elements;

public class NonMetals extends Element {
	
	private double atomicWeight;
	private double meltingPoint;
	private double boilingPoint;
	private double density;
	
    //No argument constructor	
	public NonMetals () {
		super();
	}

	//Constructor with all data fields 
	public NonMetals (double atomicWeight, double meltingPoint, double boilingPoint, double density) {
		super();
		this.atomicWeight = atomicWeight;
		this.meltingPoint = meltingPoint;
		this.boilingPoint = boilingPoint;
		this.density = density;
		
	}
	
	//Constructor  with all properties
		public NonMetals (int atomicNumber, String name, String symbol, String electron, String origin, int group,
				char block, double atomicWeight, double meltingPoint, double boilingPoint, double density) {
			
			super(atomicNumber, name, symbol, electron, origin, group, block);
			this.atomicWeight = atomicWeight;
			this.meltingPoint = meltingPoint;
			this.boilingPoint = boilingPoint;
			this.density = density;
		}

	//Getters and Setters for Atomic Weight
	public double getAtomicWeight() {
		return atomicWeight;
	}
	public void setAtomicWeight(double atomicWeight) {
		this.atomicWeight = atomicWeight;
	}

	//Getters and Setters for Melting point
	public double getMeltingPoint() {
		return meltingPoint;
	}
	public void setMeltingPoint(double meltingPoint) {
		this.meltingPoint = meltingPoint;
	}

	//Getters and Setters for Boiling point
	public double getBoilingPoint() {
		return boilingPoint;
	}
	public void setBoilingPoint(double boilingPoint) {
		this.boilingPoint = boilingPoint;
	}

	//Getters and Setters for Density
	public double getDensity() {
		return density;
	}
	public void setDensity(double density) {
		this.density = density;
	}

	//Implementing abstract methods 
	@Override
	public String properties() {
		
		return "Properties : Nonmetals have high ionization energies and electronegativities."
				+ "Solid nonmetals are generally brittle, with little or no metallic luster. "
				+ "Most nonmetals have the ability to gain electrons easily.";
	}
	
	@Override
	public String behaviour() {
		
		return  "Behaviour :  Generally poor conductors of heat and electricity.  ";
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nAtomic Weight -------------- " +atomicWeight+ " Kelvin"+","+
				"\nMelting Point --------------- " +meltingPoint+ " Kelvin"+","+
				"\nBoiling Point ---------------- " +boilingPoint+" g/cm^3"  +","+"\n\n"
				+properties()+","+ "\n\n" +behaviour() ;
	}
	
}



