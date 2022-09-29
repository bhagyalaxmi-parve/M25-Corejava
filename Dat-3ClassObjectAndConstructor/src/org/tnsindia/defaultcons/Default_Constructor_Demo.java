package org.tnsindia.defaultcons;


//DEFAULT CONTRUCTOR

class carr
{
	private int speed;
	void display()
	{
		System.out.println("speed is = " +speed+"km/hr");
	}
	carr()
	{
		speed=100;
	}
}
public class Default_Constructor_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		carr c = new carr();
		c.display();
		
	}

}
