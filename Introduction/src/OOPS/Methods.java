package OOPS;

public class Methods {
	
static int a = 4;

	public void getData()
	{
		System.out.println("I'm in method");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods Ms = new Methods();
		MethodsSecond Msz = new MethodsSecond();
		Ms.getData();
		Msz.setData();
		
		System.out.println(a);
		System.out.println("Hi");
		System.out.println("Hello");
		
		
		///
		
		Ashvek obj = new Ashvek();
		obj.cCode = "111";
		obj.cName ="Ashvek";
		obj.AddDB(obj.cName, obj.cCode);
		
		
		PolymorphismOverLoad obj1 = new PolymorphismOverLoad();
		obj1.Add(1,2);
		obj1.Add(1,2,3);
		
		
	}

}
