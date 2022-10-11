package org.tnsindia.inheritance;



//Parent class
class AndroidVersion
{
	protected String name="Android latest version";
	
	public void display1()
	{
		System.out.println(name);
	}
	
}
//child class 1
class Tiramisu extends AndroidVersion
{
	public String v13="Tiramisu";
	//method overriding
	public void display()
	{
		System.out.println(v13);
	}
}
//child class 2
class SnowCone extends AndroidVersion
{
	public String v12="Snow Cone";
	//method overriding
	public void display()
	{
		System.out.println(v12);
	}
}

public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Tiramisu t=new Tiramisu();
		t.display();
		SnowCone s=new SnowCone();
		s.display();
		t.display1();
		
	}

}
