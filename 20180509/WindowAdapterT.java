import java.awt.*;
import java.awt.event.*;

public class WindowAdapterT //内部类，extends和implements，重写父类方法  
{
	private Frame f = new Frame("test");
	private TextArea ta = new TextArea(6,40);
	//private Button b1 = new Button ("b1");
	//private Button b2 = new Button("b2");
	public void init()
	{
		FirstListener f1 = new FirstListener();
		f.addWindowListener(f1);// add f1 to listener of b1
		
		f.add(ta);
		
		f.add(ta,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	
	}

	
	//class FirstListener implements WindowListener
	class  FirstListener extends	WindowAdapter
	{
		
		public void windowClosing(WindowEvent e)
		{
			ta.append("windowClosing\n");
			System.exit(0);//退出程序，返回0（？）
			System.out.println("closing\n");

		
		}
		
	}	
		
	
	
	
	
	
	public static void main(String[] args) //有这个方法的类最先执行，程序入口
	{
		
		new WindowAdapterT().init();
		
		//System.out.println("Hello World!");
	}
}


