//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;//����swing��

public class FirstTryOnSwing //�ڲ��࣬extends��implements����д���෽��  
{
	
	public static void main(String[] args) //�����������������ִ�У��������
	{
		
		//new WindowAdapterT().init();
		
		System.out.println("LAF that can be used in system");
		for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
		{
			System.out.println(info.getName()+"--->"+info);
		}
	}
}


