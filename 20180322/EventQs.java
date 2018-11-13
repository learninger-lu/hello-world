import java.awt.*;//awt组件
import java.awt.event.*;//awt事件响应
//import javaxsss.swing.*;//swing组件

public class  EventQs
{
	private Frame f = new Frame("测试事件");//设置容器,及容器名称
	private Button ok = new Button("确定");//设置按钮
	private TextField tf = new TextField (45);//文本框及长度
	public void init()
	{
		ok.addActionListener(new OkListener());//ok按钮对应监听器OkListener
		f.add(tf);//添加文本框
		f.add(ok, BorderLayout.SOUTH);//添加ok按钮,使用borderlayout布局器
		f.pack();//使用pack方法,布局
		f.setVisible(true);//显示窗口.正常窗口为隐藏

	
	}
	class OkListener implements ActionListener
	{
		public void actionPerformed (ActionEvent e)
		{
			System.out.println("用户单击OK按钮");
			tf.setText("hello world");

		}

	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		new EventQs().init();


	}
}
