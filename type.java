import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class type implements ActionListener
{
JFrame jf;
Container c;
JButton b1,b2;
public type()
{
jf=new JFrame("Type");
c=jf.getContentPane();
c.setLayout(null);
b1=new JButton("CREATE");
b2=new JButton("JOIN");
b1.addActionListener(this);
b2.addActionListener(this);
b1.setBounds(100,55,100,40);
b2.setBounds(100,125,100,40);
b1.setBackground(Color.red);
b2.setBackground(Color.red);
b1.setForeground(Color.BLUE);
b2.setForeground(Color.BLUE);
c.add(b1);
c.add(b2);
c.setBackground(Color.black);
jf.setSize(300,230);
jf.setVisible(true);
jf.setLocationRelativeTo(null);
jf.setResizable(false);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
jf.setVisible(false);
new gameserver();
}
if(ae.getSource()==b2)
{
jf.setVisible(false);
new gameclient();
}
}
public static void main(String arhs[])
{
new type();
}
}