package org.tnsindia.array;

class Student
{
	public int roll_no;
	public String name;
	//constructor
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class Student_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Non-primitive Array memory allocation
				Student[] arr=new Student[3];
				arr[0]=new Student(1001, "sakshi");
				arr[1]=new Student(1002, "pooja");	
				arr[2]=new Student(1003, "shubhangi");
				for(int i=0;i<arr.length;i++)
				{
			
					System.out.println("Element at " +i+" index: "+arr[i].roll_no+" "+arr[i].name);
			
				}
	}

}
