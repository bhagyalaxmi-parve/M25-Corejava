package org.tnsindia.application;

import org.tnsindia.framework.NormalAcc;
import org.tnsindia.framework.PrimeAcc;
import org.tnsindia.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accName, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		GSPrimeAcc p = new GSPrimeAcc( accNo,  accName,  charges,  isPrime);
		return null;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accNo, String accName, float charges, float deliveryCharge) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		GSNormalAcc p = new GSNormalAcc( accNo,  accName,  charges, deliveryCharge);
		return null;
	}

}
