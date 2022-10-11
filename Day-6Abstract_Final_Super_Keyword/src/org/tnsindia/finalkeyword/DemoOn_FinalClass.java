package org.tnsindia.finalkeyword;


class FinalClass
{
	protected String name="bhagyalaxmi";
}
//final class cannot be inherited
/*final class FinalClass
{
	protected String name="Jenny";
	
}*/
//child class(Inheritance)
class ChildFinal extends FinalClass
{
	public void print()
	{
		System.out.println(name);
	}
}

public class DemoOn_FinalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		ChildFinal c=new ChildFinal();
		c.print();

	}

}
