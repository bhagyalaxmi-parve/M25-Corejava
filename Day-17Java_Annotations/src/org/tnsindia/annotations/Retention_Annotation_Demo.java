package org.tnsindia.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

//Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnoDemo.class)

@interface CustomAnnotation{
	//abstract method
	String print() default"M25 Batch";
	int value( ) default 0;
}


@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnoDemo{
	CustomAnnotation[] value();
}
public class Retention_Annotation_Demo {

	
	
	@CustomAnnotation(print="Retention Annotation Test" , value=1)
	@CustomAnnotation(print="Testing Annotation" , value=2)
	/*public static void main(String [] arge)
	  {
	  Retention_Annotation_Demo c = new Retention_Annotation_Demo();
	 */
	public static void testMethod(){
		// TODO Auto-generated method stub
		Retention_Annotation_Demo  d = new Retention_Annotation_Demo();
		try {
			Class<?>c=d.getClass();
			Method m=c.getMethod("testMethod");
			Annotation a = m.getAnnotation(MyRepeatedAnnoDemo.class);
			System.out.println(a);
		}
		catch(NoSuchMethodException e)
		{
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		testMethod();
	}
}
