package arrays.arraysofobject;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		Student[] arr;
		
		arr = new Student[5];
		
		arr[0] = new Student(1, "Shaglin");	
		arr[1] = new Student(2, "Vishal");
		arr[2] = new Student(3, "Nidhi");
		arr[3] = new Student(4, "Lisha");
		arr[4] = new Student(5, "Saurav");
		
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());

	
	for (Student a:arr)
		System.out.println( a);
	
	for (Student a:arr)
		System.out.println("Roll no:"+a.getRollNo()+" Name: "+a.getName());
}

}

