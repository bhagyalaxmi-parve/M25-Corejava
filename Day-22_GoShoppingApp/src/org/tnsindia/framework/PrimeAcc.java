package org.tnsindia.framework;

public abstract class PrimeAcc extends ShopAcc{

	
	private boolean isPrime;
	@SuppressWarnings("unused")
	static final private float deliveryCharges=0.0f;
	
	
	//constructor
	public PrimeAcc(int accNo, String accName, float charges, boolean isPrime) {
		super(accNo, accName, charges);
		this.isPrime = isPrime;
	}
	
	
		public void bookProduct(float charges)
		{
		System.out.println("Account No:"+this.getAccNo()+" \n" +"Account Name:"+this.getAccName()+"\n"
				+"Charges is:"+this.getCharges());
		}


		@Override
		public String toString() {
			return "PrimeAcc [isPrime=" + isPrime + "]";
		}



}
