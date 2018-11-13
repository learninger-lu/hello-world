import java.awt.*;
import java.awt.event.*;

public class MultiListener 
{
	private Frame f = new Frame("test");
	private TextArea ta = new TextArea(6,40);
	private Button b1 = new Button ("b1");
	private Button b2 = new Button("b2");
	public void init()
	{
		FirstListener f1 = new FirstListener();
		b1.addActionListener(f1);// add f1 to listener of b1
		b1.addActionListener(new SecondListener());// add SecondListener to b1��b1��ͬʱ��Ӧ��������
		b2.addActionListener(f1);//add f1 ��B2��ť������B2���к�B1��ͬ����Ӧ
		f.add(ta);
		Panel p = new Panel();
		p.add (b1);
		p.add(b2);
		f.add(p,BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	
	}

	
		class FirstListener implements ActionListener//��Ҫ��MulitListener �����ڶ���
		{
			public void actionPerformed(ActionEvent e)
			{
				ta.append("first action listener has been tripped" + e.getActionCommand()+"\n");
				//ta.append("first action listener has been tripped");
			}		

		}
		 class SecondListener implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				ta.append("clicked b2"+e.getActionCommand()+"\n");
			}


		}
		
	
	
	
	
	
	public static void main(String[] args) 
	{
		
		new MultiListener().init();
		
		//System.out.println("Hello World!");
	}
}


