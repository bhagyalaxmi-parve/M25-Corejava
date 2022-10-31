package org.tnsindia.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface custom{
	String print() default"bhagyalaxmi";
	int speed() default 80;
	float salary( ) default 75000.50f;
}


class CustomAnnotationClass{
	@custom(print="Hello guys!" , speed =50, salary=65000.65f)
	public void display()
	{
		System.out.println("Hurrah!  It's sunday and its funn day");
	}
}
public class Custom_Annotation_Demo {

	public static void main(String[] args) throws NoSuchMethodException, Exception {
		// TODO Auto-generated method stub

		CustomAnnotationClass c = new CustomAnnotationClass();
		c.display();
		Method m = c.getClass().getMethod("display");
		
		custom obj= m.getAnnotation(custom.class);
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.salary());	
		
		
	}

}
