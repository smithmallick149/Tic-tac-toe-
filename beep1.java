import java.awt.*;
import java.awt.event.*;
public class beep1 implements ActionListener
{
public beep1()
{
Frame f=new Frame("HI");
f.setLayout(new FlowLayout());
Button b=new Button("Beep");
b.addActionListener(this);
f.add(b);
f.setSize(300,300);
f.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
Toolkit.getDefaultToolkit().beep();
}
public static void main(String args[])
{
new beep1();
}
}