package constructors;

//CLASS WITH PARAMETERIZED CONSTRUCTOR
class Std{
	int id;
	String name;

//	PARAMETERIZED CONSTRUCTOR
	Std(int i,String n)
	{
		id=i;
		name=n;
	}

	void display() {
		System.out.println(id+" "+name);
	}
}

//MAIN CLASS
public class ParameterizedConstructor {
	public static void main(String[] args) {

		Std std1=new Std(2,"Alex");
		Std std2=new Std(10,"Annie");
		std1.display();
		std2.display();
	}

}
