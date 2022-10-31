

package org.tnsindia.annotations;

import java.lang.reflect.Method;
import java.lang.annotation.*;
import java.lang.annotation.Inherited;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)





//if we need to inherit an annotation from superclass then go with inherited annotation
@Inherited
//custom annotation
@interface Customm
{
	//abstract method
	//Multi-value annotation
	String print() ;
	
}

class A
{
	@Customm(print = "bhagyalaxmi")

	public void display()
	{
		System.out.println("Display inherited-1");
	}
}
class B extends A
{
	public void display1()
	{
		System.out.println("Display inherited-2");
	}
}
public class Inherited_Annotation {

	public static void main(String[] args) throws Exception
	{
		B obj=new B();
		obj.display();
		obj.display1();
		
		Method m=obj.getClass().getMethod("display");
		Customm obj1=m.getAnnotation(Customm.class);
		
		System.out.println(obj1.print());
		

	}

}