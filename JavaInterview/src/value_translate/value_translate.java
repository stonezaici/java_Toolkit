package value_translate;

public class value_translate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.num = 5;
		stu = change(stu);
		System.out.println(stu.num);
	}
	public static Student change(Student stu){
		
		stu.num = 10;
		
		return stu;
	}

}
