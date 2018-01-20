import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.net.*;
public class gameclient implements ActionListener,Runnable
{
JFrame jf;
Container c;
JPanel jp1,jp2;
JTextField tf1;
TextArea ta;
JButton b1;
BufferedReader br;
PrintWriter pw;
Thread t;
Socket s;
Color c1;
int port=1234;
String name="";
Label l1;
JButton clear;
JLabel jl1;
JButton jb3;
JButton one,two,three,four,five,six,seven,eight,nine;
public gameclient()
{
name=JOptionPane.showInputDialog(null,"Enter Your Name ");
if(name.equals(""))
{
JOptionPane.showMessageDialog(null,"Sorry Invalid Name.Good Bye");
System.exit(0);
}
jf=new JFrame("Tic-Tac Toe");
jf.setResizable(false);
c=jf.getContentPane();
c.setLayout(null);
c.setBackground(Color.black);
jf.setVisible(true);
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
jf.setSize((int)d.getWidth(),(int)d.getHeight());
l1=new Label("");
jp1=new JPanel();
jp1.setLayout(null);
jp1.setBackground(Color.gray);
jp1.setBounds(20,20,800,620);
jp2=new JPanel();
jp2.setBackground(Color.blue);
jp2.setLayout(new FlowLayout());
JLabel jl=new JLabel("Name : "+name);
jl.setFont(new Font("Arial",Font.BOLD,20));
jl.setBounds(600,30,150,30);
jl1=new JLabel("");
jl1.setForeground(Color.red);
jl1.setForeground(Color.red);
jl1.setFont(new Font("Arial",Font.BOLD,16));
jl1.setBounds(600,70,200,30);
jp1.add(jl1);
jp1.add(jl);
tf1=new JTextField(40);
ta=new TextArea(30,60);
b1=new JButton("Send");
b1.addActionListener(this);
//ta.setBounds(870,30,430,500);
jp2.add(ta);
jp2.add(tf1);
jp2.add(b1);
jb3=new JButton("Connect");
jb3.addActionListener(this);
jb3.setBounds(700,580,90,30);
jp1.add(jb3);
JPanel p1=new JPanel();
p1.setBackground(Color.yellow);
p1.setBounds(150,250,300,5);
jp1.add(p1);
JPanel p2=new JPanel();
p2.setBackground(Color.yellow);
p2.setBounds(150,350,300,5);
jp1.add(p2);

JPanel p3=new JPanel();
p3.setBackground(Color.yellow);
p3.setBounds(250,150,5,300);
jp1.add(p3);

JPanel p4=new JPanel();
p4.setBackground(Color.yellow);
p4.setBounds(350,150,5,300);
jp1.add(p4);
one=new JButton();
two=new JButton();
three=new JButton();
four=new JButton();
five=new JButton();
six=new JButton();
seven=new JButton();
eight=new JButton();
nine=new JButton();
one.addActionListener(this);
two.addActionListener(this);
three.addActionListener(this);
four.addActionListener(this);
five.addActionListener(this);
six.addActionListener(this);
seven.addActionListener(this);
eight.addActionListener(this);
nine.addActionListener(this);
c1=one.getBackground();
one.setBounds(190,190,50,50);
jp1.add(one);
two.setBounds(280,190,50,50);
jp1.add(two);
three.setBounds(370,190,50,50);
jp1.add(three);

seven.setBounds(190,380,50,50);
jp1.add(seven);
eight.setBounds(280,380,50,50);
jp1.add(eight);
nine.setBounds(370,380,50,50);
jp1.add(nine);

four.setBounds(190,280,50,50);
jp1.add(four);
five.setBounds(280,280,50,50);
jp1.add(five);
six.setBounds(370,280,50,50);
jp1.add(six);

jp2.setBounds(850,20,470,620);
clear=new JButton("New");
clear.addActionListener(this);
clear.setBounds(600,580,80,30);
jp1.add(clear);
c.add(jp1);
c.add(jp2);
t=new Thread(this);
t.start();
}
public void run()
{
while(true)
{
try
{
String client=br.readLine();



if(client.equals("one"))
{
if(one.getText().equals(""))
{
one.setBackground(Color.red);
one.setText("*");
}
if(one.getText().equals("*")&&two.getText().equals("*")&&three.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(one.getText().equals("*")&&four.getText().equals("*")&&seven.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(one.getText().equals("*")&&five.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}


}

if(client.equals("two"))
{
if(two.getText().equals(""))
{
two.setBackground(Color.red);
two.setText("*");
}
if(two.getText().equals("*")&&three.getText().equals("*")&&one.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(two.getText().equals("*")&&five.getText().equals("*")&&eight.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}

}

if(client.equals("three"))
{
if(three.getText().equals(""))
{
three.setBackground(Color.red);
three.setText("*");
}
if(one.getText().equals("*")&&two.getText().equals("*")&&three.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(three.getText().equals("*")&&five.getText().equals("*")&&seven.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(three.getText().equals("*")&&six.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}

}

if(client.equals("four"))
{
if(four.getText().equals(""))
{
four.setBackground(Color.red);
four.setText("*");
}
if(one.getText().equals("*")&&four.getText().equals("*")&&seven.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(four.getText().equals("*")&&five.getText().equals("*")&&six.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}

}

if(client.equals("five"))
{
if(five.getText().equals(""))
{
five.setBackground(Color.red);
five.setText("*");
}
if(two.getText().equals("*")&&five.getText().equals("*")&&eight.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(four.getText().equals("*")&&five.getText().equals("*")&&six.getText().equals("*"))
{
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(seven.getText().equals("*")&&five.getText().equals("*")&&three.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(one.getText().equals("*")&&five.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}


}

if(client.equals("six"))
{
if(six.getText().equals(""))
{
six.setBackground(Color.red);
six.setText("*");
}
if(six.getText().equals("*")&&three.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(six.getText().equals("*")&&five.getText().equals("*")&&four.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}

}
if(client.equals("seven"))
{
if(seven.getText().equals(""))
{
seven.setBackground(Color.red);
seven.setText("*");
}
if(one.getText().equals("*")&&four.getText().equals("*")&&seven.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(five.getText().equals("*")&&three.getText().equals("*")&&seven.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(eight.getText().equals("*")&&seven.getText().equals("*")&&nine.getText().equals("*"))
{
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}


}

if(client.equals("eight"))
{
if(eight.getText().equals(""))
{
eight.setBackground(Color.red);
eight.setText("*");
}
if(eight.getText().equals("*")&&seven.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(eight.getText().equals("*")&&five.getText().equals("*")&&two.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}


}
if(client.equals("nine"))
{
if(nine.getText().equals(""))
{
nine.setBackground(Color.red);
nine.setText("*");
}
if(one.getText().equals("*")&&five.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(eight.getText().equals("*")&&seven.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(three.getText().equals("*")&&six.getText().equals("*")&&nine.getText().equals("*"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Lost The Game");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}

}

String a[]=client.split(" ");
int length1=a.length;
if(length1>1)
{
System.out.println(a[length1-1]);
if(a[length1-1].equals("msg"))
{
for(int i=0;i<length1-1;i++)
{
ta.append(a[i]+" ");
}
ta.append("\n");
}

}


}
catch(Exception e)
{}
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==clear)
{
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}

if(ae.getSource()==one)
{
pw.println("one");
if(one.getText().equals(""))
{
one.setText("0");
one.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already reserved");
}
if(one.getText().equals("0")&&two.getText().equals("0")&&three.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(one.getText().equals("0")&&four.getText().equals("0")&&seven.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(one.getText().equals("0")&&five.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==two)
{
pw.println("two");
if(two.getText().equals(""))
{
two.setText("0");
two.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(two.getText().equals("0")&&three.getText().equals("0")&&one.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(two.getText().equals("0")&&five.getText().equals("0")&&eight.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==three)
{
pw.println("three");
if(three.getText().equals(""))
{
three.setText("0");
three.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(one.getText().equals("0")&&two.getText().equals("0")&&three.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(three.getText().equals("0")&&five.getText().equals("0")&&seven.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(three.getText().equals("0")&&six.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==four)
{
pw.println("four");
if(four.getText().equals(""))
{
four.setText("0");
four.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(one.getText().equals("0")&&four.getText().equals("0")&&seven.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(four.getText().equals("0")&&five.getText().equals("0")&&six.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==five)
{
pw.println("five");
if(five.getText().equals(""))
{
five.setText("0");
five.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(two.getText().equals("0")&&five.getText().equals("0")&&eight.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(four.getText().equals("0")&&five.getText().equals("0")&&six.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(seven.getText().equals("0")&&five.getText().equals("0")&&three.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(one.getText().equals("0")&&five.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==six)
{
pw.println("six");
if(six.getText().equals(""))
{
six.setText("0");
six.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(six.getText().equals("0")&&three.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(six.getText().equals("0")&&five.getText().equals("0")&&four.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==seven)
{
pw.println("seven");
if(seven.getText().equals(""))
{
seven.setText("0");
seven.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(one.getText().equals("0")&&four.getText().equals("0")&&seven.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(five.getText().equals("0")&&three.getText().equals("0")&&seven.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(eight.getText().equals("0")&&seven.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==eight)
{
pw.println("eight");
if(eight.getText().equals(""))
{
eight.setText("0");
eight.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(eight.getText().equals("0")&&seven.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(eight.getText().equals("0")&&five.getText().equals("0")&&two.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}

if(ae.getSource()==nine)
{
pw.println("nine");
if(nine.getText().equals(""))
{
nine.setText("0");
nine.setBackground(Color.green);
}
else
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"Sorry It's Already Reserved");
}
if(one.getText().equals("0")&&five.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(eight.getText().equals("0")&&seven.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
if(three.getText().equals("0")&&six.getText().equals("0")&&nine.getText().equals("0"))
{
Toolkit.getDefaultToolkit().beep();
JOptionPane.showMessageDialog(null,"You Won The Match");
one.setText("");
one.setBackground(c1);
two.setText("");
two.setBackground(c1);
three.setText("");
three.setBackground(c1);
four.setText("");
four.setBackground(c1);
five.setText("");
five.setBackground(c1);
six.setText("");
six.setBackground(c1);
seven.setText("");
seven.setBackground(c1);
eight.setText("");
eight.setBackground(c1);
nine.setText("");
nine.setBackground(c1);
}
}
if(ae.getSource()==jb3)
{
String ss=JOptionPane.showInputDialog(null,"Enter The Opponent Ip Address ");
try
{
s=new Socket(ss,port);
if(s!=null)
{
jl1.setForeground(Color.green);
jl1.setText("Oposition is Ready.");
}
br=new BufferedReader(new InputStreamReader(s.getInputStream()));
pw=new PrintWriter(s.getOutputStream(),true);
}
catch(Exception e)
{}
}
if(ae.getSource()==b1)
{
try
{
String msg=tf1.getText()+" msg";
pw.println(msg);
tf1.setText("");
}
catch(Exception e)
{}
}
}
public static void main(String args[])
{
new gameclient();
}
}
