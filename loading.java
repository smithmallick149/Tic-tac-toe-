import java.awt.*;
import javax.swing.*;
public class loading extends JFrame
{
JLabel l1,l2,l3,l4,l5;
JFrame jf;
String s1="";
int j=0;
Container c;
JProgressBar jp;
public loading()
{
jf=new JFrame("Tic-Tac Toe");
jf.setResizable(false);
jf.setUndecorated(true);
jf.getRootPane().setWindowDecorationStyle(JRootPane.FRAME);
c=jf.getContentPane();
c.setLayout(null);
l1=new JLabel("Tic-Tac Toe");
l1.setFont(new Font("Arial",Font.BOLD,25));
l1.setBounds(600,40,200,30);
l1.setForeground(Color.RED);
l1.setBackground(Color.black);
c.setBackground(Color.blue);
jp=new JProgressBar(0,100);
jp.setStringPainted(true);
jp.setBackground(Color.yellow);
jp.setForeground(Color.red);
jp.setBounds(40,600,500,40);
c.add(jp);
c.add(l1);
l2=new JLabel("Designed By   :  ");
l2.setFont(new Font("Arial",Font.BOLD,20));
l2.setBounds(900,500,200,30);
l2.setForeground(Color.RED);
c.add(l2);

l5=new JLabel("");
l5.setFont(new Font("Arial",Font.BOLD,72));
l5.setBounds(400,200,650,130);
l5.setForeground(Color.GREEN);
c.add(l5);


l4=new JLabel("smith mallick");
l4.setFont(new Font("Arial",Font.BOLD,18));
l4.setBounds(900,580,250,30);
l4.setForeground(Color.GREEN);
c.add(l4);


Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
jf.setSize((int)d.getWidth(),(int)d.getHeight());
jf.setVisible(true);
//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jpr();
}
public void jpr()
{
for(int i=1;i<=100;i++)
{
if(i>1&&i<13)
{
s1="W";
l5.setText(s1);
}
if(i>13&&i<26)
{
s1="WE";
l5.setText(s1);
}
if(i>26&&i<39)
{
s1="WEL";
l5.setText(s1);
}
if(i>39&&i<52)
{
s1="WELC";
l5.setText(s1);
}
if(i>52&&i<65)
{
s1="WELCO";
l5.setText(s1);
}
if(i>65&&i<78)
{
s1="WELCOM";
l5.setText(s1);
}
if(i>78&&i<91)
{
s1="WELCOME";
l5.setText(s1);
}
try
{
Thread.sleep(100);
}
catch(Exception e)
{}
jp.setValue(i);
if(i==100)
{
jf.setVisible(false);
new mode();
}

}

}
public static void main(String stjs[])
{
new loading();
}
}