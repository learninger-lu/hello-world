//import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;//引入swing包

public class FirstTryOnSwing //内部类，extends和implements，重写父类方法  
{
	
	public static void main(String[] args) //有这个方法的类最先执行，程序入口
	{
		
		//new WindowAdapterT().init();
		
		System.out.println("LAF that can be used in system");
		for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels())
		{
			System.out.println(info.getName()+"--->"+info);
		}
	}
}


