class Root 
{
	
	static{
		System.out.println("Root's static initial");
		//a=9;	
	}

	{
		System.out.println("Root's  initial");
	}

	//int a=6;
	
	/*public void main(String[] args) 
	{
		System.out.println(this.a);
	}*/
	Root()
	{
		System.out.println("Root's constructor without parameters");
	}

}

class Mid extends Root 
{
	
	static{
		System.out.println("Mid's static initial");
		//a=9;	
	}

	{
		System.out.println("Mid's  initial");
	}

	//int a=6;
	
	/*public void main(String[] args) 
	{
		System.out.println(this.a);
	}*/
	Mid()
	{
		System.out.println("Mid's constructor without parameters");
	}
	Mid(String gooo)
	{
		this();
		System.out.println("Mid's constructor with parameter,which is "+gooo);
	}


}

class leef extends Mid 
{
	
	static{
		System.out.println("leef's static initial");
		//a=9;	
	}

	{
		System.out.println("leef's  initial");
	}

	//int a=6;
	
	/*public void main(String[] args) 
	{
		System.out.println(this.a);
	}*/
	leef()
	{
		super("Mid�ְֵĹ�����");
		System.out.println("Mit's constructor without parameters");

	}
	/*Mit(String gooo)
	{
		this();
		System.out.println("Mit's constructor with parameter,which is "+goo);
	}*/


}


public class Initest 
{
	public static void main(String[] args)
	{
		new leef();
		new leef();
	}
}



