import java.awt.*;
import java.awt.event.*;

public class WindowAdapterT //�ڲ��࣬extends��implements����д���෽��  
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
			System.exit(0);//�˳����򣬷���0������
			System.out.println("closing\n");

		
		}
		
	}	
		
	
	
	
	
	
	public static void main(String[] args) //�����������������ִ�У��������
	{
		
		new WindowAdapterT().init();
		
		//System.out.println("Hello World!");
	}
}

