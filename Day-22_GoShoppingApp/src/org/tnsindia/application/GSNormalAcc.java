package org.tnsindia.application;

import org.tnsindia.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accName, float charges, float deliveryCharges) {
		super(accNo, accName, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAcc []";
	}

}
