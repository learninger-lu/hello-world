public class Overwrite 
{
	public String name;
	public String color;
	public String weigh;

	public Overwrite(String name,String color)
	{
		this.name=name;
		this.color=color;

	}

	public Overwrite(String name, String color,String weigh)
	{
		this(name,color);
		this.weigh=weigh;
	}



	public static void main(String[] args) 
	{
		Overwrite t1= new Overwrite("bao","zi");
		Overwrite t2= new Overwrite("gou","bu","li");
		
		
		System.out.println(t1.name+t1.color+t1.weigh);
		System.out.println(t2.name+t2.color+t2.weigh);
	}
}
