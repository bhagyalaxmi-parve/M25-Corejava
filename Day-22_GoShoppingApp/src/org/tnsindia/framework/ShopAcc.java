package org.tnsindia.framework;


//abstract class it contains abstract and non abstract method
public abstract class ShopAcc {

	private int accNo;
	private String accName;
	private float charges;
	
	//constructor
	public ShopAcc(int accNo, String accName, float charges) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.charges = charges;
		
	}

	
	//getters and setters method
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}
	


	
	//tostring method
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accName=" + accName + ", charges=" + charges + "]";
	}
	
	//abstract method
	abstract public void bookProduct(float charges);
	
	
	public void items(float charges)
	{
		System.out.println(charges);
	}
	
	
	
}
