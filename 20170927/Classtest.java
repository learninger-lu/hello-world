public class  Classtest
{
	public static void main(String[] args) 
	{
		VariableNumber p=new VariableNumber();
		VariableNumber q=new VariableNumber();
		//System.out.println(VariableNumber.a);
		p.printf("babaxuehuile","guiyixiaofendui ","tebieguiyixiaofendui11");
		q.a=15;
		p.b=20;
		System.out.println(p.a);
		System.out.println(q.b);

		
		//System.out.println("Hello World!");



	}
}


class VariableNumber
{
	int a=5;
	int b=5;
	public void printf(String ... books)
	{
		//System.out.println(VariableNumber.a);
		System.out.println(this.b);
		for (String tmp:books)
		{
			System.out.println("��δ�ӡ�Ķ�����"+books[1]);
		}

		
	}

}