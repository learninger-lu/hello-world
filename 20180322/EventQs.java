import java.awt.*;//awt���
import java.awt.event.*;//awt�¼���Ӧ
//import javaxsss.swing.*;//swing���

public class  EventQs
{
	private Frame f = new Frame("�����¼�");//��������,����������
	private Button ok = new Button("ȷ��");//���ð�ť
	private TextField tf = new TextField (45);//�ı��򼰳���
	public void init()
	{
		ok.addActionListener(new OkListener());//ok��ť��Ӧ������OkListener
		f.add(tf);//����ı���
		f.add(ok, BorderLayout.SOUTH);//���ok��ť,ʹ��borderlayout������
		f.pack();//ʹ��pack����,����
		f.setVisible(true);//��ʾ����.��������Ϊ����

	
	}
	class OkListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			System.out.println("�û�����OK��ť");
			tf.setText("hello world");

		}

	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new EventQs().init();


	}
}
