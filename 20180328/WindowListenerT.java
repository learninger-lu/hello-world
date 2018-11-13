import java.awt.*;
import java.awt.event.*;

public class WindowListenerT 
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

	
	class FirstListener implements WindowListener
	{
		public void windowActivated(WindowEvent e)
		{
			ta.append("Activated\n");
			System.out.println("Activated\n");
		}
		public void windowClosing(WindowEvent e)
		{
			ta.append("windowClosing\n");
			System.exit(0);//退出程序，返回0（？）
			System.out.println("closing\n");

		
		}
			public void windowClosed(WindowEvent e)
		{
			ta.append("windowClosed\n");
			System.exit(0);//退出程序，返回0（？）
			System.out.println("closed\n");
		
		}
		public void windowDeactivated(WindowEvent e)
		{
			ta.append("deactivated\n");
			System.out.println("deactivated\n");
		}

		public void windowDeiconified(WindowEvent e)
		{
			ta.append("Deiconified\n");
			System.out.println("Deiconified\n");
		}
		public void windowIconified(WindowEvent e)
		{
			ta.append("");
			System.out.println("iconified\n");
		}
		 public void windowOpened(WindowEvent e)
		{
			ta.append("windowOpened\n");
			System.out.println("windowOpened@\n");
		 }

	}	
		
	
	
	
	
	
	public static void main(String[] args) //有这个方法的类最先执行，程序入口
	{
		
		new WindowListenerT().init();
		
		//System.out.println("Hello World!");
	}
}


