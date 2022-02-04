package java2lab02;

public class Truck {
	private Box[] Boxes;
	private String registrationNo;
	private int totalBoxesVolume;
	private int nBoxes;
	private int maxLoadCapacity;
	private boolean canMakeJourney;

	public Truck(String regNumber, int maxLoadCap, int nBoxes) {
		this.Boxes = new Box[nBoxes];
        this.registrationNo = regNumber;
		this.maxLoadCapacity = maxLoadCap;
		this.nBoxes = nBoxes;
		
		for (int i = 0; i < nBoxes; i++) {
			this.Boxes[i] = new Box(1,3,5);
		  }

        this.canMakeJourney = false;
		this.totalBoxesVolume = 0;

	}

	public Box[] getBoxes() {
		return Boxes;
	}

	public void setBoxes(Box[] boxes) {
		Boxes = boxes;
	}

	public String getRegistrationNo() {
		return registrationNo;
	}

	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}

	public int getTotalBoxesVolume() {
		return totalBoxesVolume;
	}

	public void setTotalBoxesVolume(int totalBoxesVolume) {
		this.totalBoxesVolume = totalBoxesVolume;
	}

	public int getnBoxes() {
		return nBoxes;
	}

	public void setnBoxes(int nBoxes) {
		this.nBoxes = nBoxes;
	}

	public int getMaxLoadCapacity() {
		return maxLoadCapacity;
	}

	public void setMaxLoadCapacity(int maxLoadCapacity) {
		this.maxLoadCapacity = maxLoadCapacity;
	}

	public boolean isCanMakeJourney() {
		return canMakeJourney;
	}

	public void setCanMakeJourney(boolean canMakeJourney) {
		this.canMakeJourney = canMakeJourney;
	}

	public void validate() {
		int totalVolume=0;
		for (int i = 0; i < nBoxes; i++) {
			totalVolume += Boxes[i].Volume();
		}
		this.totalBoxesVolume = totalVolume;
		
		if(this.totalBoxesVolume<=this.maxLoadCapacity) {
			this.canMakeJourney = true;
		}
	}

	public String toString() {
		
		if(this.canMakeJourney==true) {
		    String metin= "Truck No. " + this.registrationNo+ " has maximum loading capacity of " + this.maxLoadCapacity + 
				    " m3. It carries " + this.nBoxes + " boxes with total dimension of "+ this.totalBoxesVolume + " m3. It can make the journey successfully.";
		    return metin;
		}
		else {
			return "Truck No. "+this.registrationNo +" has maximum loading capacity of "+ this.maxLoadCapacity + 
					" m3. It carries " + this.nBoxes + " boxes with total dimension of "+ this.totalBoxesVolume + " m3. It cannot make the journey successfully.";
		}
	}
}
