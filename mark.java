import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class mark extends JFrame implements ActionListener
{
	TextField t1,t2,t3,t4,t5,t6;
	Label l1,l2,l3,l4,l5,l6,l;
	public mark()
	{
		 l1=new Label("STUDENT NAME");
		 l2=new Label("FATHER NAME");
		 l3=new Label("MOTHER NAME");
		 l4=new Label("MARKS IN PHYSICS");
		 l5=new Label("CHEMISTRY");
		 l6=new Label("MARKS IN MATH");
		 l=new Label("MAKE RESULTSHEET");
		t1=new TextField(25);
		t2=new TextField(25);
		t3=new TextField(25);
		t4=new TextField(25);
		t5=new TextField(25);
		t6=new TextField(25);
		Button b1=new Button("get");
		JFrame f1=new JFrame();
		f1.setTitle("student login");
		f1.setSize(500,500);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setLayout(null);
		f1.add(l1);
		f1.add(l2);
		f1.add(l3);
		f1.add(l4);
		f1.add(l5);
		f1.add(l6);
		f1.add(t1);
		f1.add(t2);
		f1.add(t3);
		f1.add(t4);
		f1.add(t5);
		f1.add(t6);
		f1.add(b1);
		f1.add(l);
		l.setBounds(250,50,150,50);
		l1.setBounds(200,100,100,50);
		l2.setBounds(200,150,100,50);
		l3.setBounds(200,200,100,50);
		l4.setBounds(200,260,100,50);
		l5.setBounds(200,300,100,50);
		l6.setBounds(200,350,100,50);
		t1.setBounds(300,100,100,50);
		t2.setBounds(300,150,100,50);
		t3.setBounds(300,200,100,50);
		t4.setBounds(300,250,100,50);
		t5.setBounds(300,300,100,50);
		t6.setBounds(300,350,100,50);
		b1.setBounds(320,400,50,30);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent et)
	{
		Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28;
	    JFrame f;
		float d=Integer.parseInt(t4.getText());
		float e=Integer.parseInt(t5.getText());
		float G=Integer.parseInt(t6.getText());
		float p;
		p=((d+e+G)/3);
		
		 l1=new Label("S.K.INTER COLLEGE");
		 l2=new Label("(2017-2018)");
		 l3=new Label("STUDENT NAME");
		 l4=new Label("FATHER NAME");
		 l5=new Label("MOTHER NAME");
		 l6=new Label(t1.getText());
		 l7=new Label(t2.getText());
		 l8=new Label(t3.getText());
		 l9=new Label("SUBJECT"); 
		 l10=new Label("PHYSICS");
		 l11=new Label("CHEMISTRY");
		 l12=new Label("MATH");
		 l13=new Label("MARKS");
		 l14=new Label(t4.getText());
		 l15=new Label(t5.getText());
		 l16=new Label(t6.getText());
		 l17=new Label("OUT OF");
		 l18=new Label("100");
		 l19=new Label("100");
		 l20=new Label("100");
		 l21=new Label("RESULT");
		 l22=new Label();
		 l23=new Label("STANDARD");
		 l24=new Label("11th");
		 l25=new Label("BOARD");
		 l26=new Label("UP");
		  l27=new Label("PERCENTAGE");
		   l28=new Label(""+p+"%");
		 f=new JFrame();
		f.setTitle("marksheet");
		f.setSize(1000,1000);
		f.setVisible(true);
		f.setLayout(null);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(l4);
		f.add(l5);
		f.add(l6);
		f.add(l7);
		f.add(l8);
		f.add(l9);
		f.add(l10);
		f.add(l11);
		f.add(l12);
		f.add(l13);
		f.add(l14);
		f.add(l15);
		f.add(l16);
		f.add(l17);
		f.add(l18);
		f.add(l19);
		f.add(l20);
		f.add(l21);
		f.add(l22);
		f.add(l23);
		f.add(l24);
		f.add(l25);
		f.add(l26);
		f.add(l27);
		f.add(l28);
		l1.setBounds(350,50,150,30);
		l2.setBounds(370,60,100,50);
		l3.setBounds(200,100,100,50);
		l4.setBounds(200,150,100,50);
		l5.setBounds(200,200,100,50);
		l6.setBounds(350,100,100,50);
		l7.setBounds(350,150,100,50);
		l8.setBounds(350,200,100,50);
		l9.setBounds(200,300,100,50);
		l10.setBounds(200,400,100,50);
		l11.setBounds(200,450,100,50);
		l12.setBounds(200,500,100,50);
		l13.setBounds(300,300,100,50);
		l14.setBounds(300,400,100,50);
		l15.setBounds(300,450,100,50);
		l16.setBounds(300,500,100,50);
		l17.setBounds(400,300,100,50);
		l18.setBounds(400,400,100,50);
		l19.setBounds(400,450,100,50);
		l20.setBounds(400,500,100,50);
		l21.setBounds(500,300,100,50);
		l22.setBounds(500,450,100,50);
		l23.setBounds(500,100,100,50);
		l24.setBounds(600,100,100,50);
		l25.setBounds(500,150,100,50);
		l26.setBounds(600,150,100,50);
		l27.setBounds(600,300,100,50);
		l28.setBounds(600,450,100,50);
		if(d<35||e<35||G<35)
		{
			l22.setText("FAIL");
			l28.setText("Invalid");
		}
		else
		{
			l22.setText("PASS");
		}
	}
	public static void main(String args[])
{
	mark i=new mark();
}
}