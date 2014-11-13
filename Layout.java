/*
 *LEXITRON!!!!!!!!!!!!!!!!
 *add a msgbox after give up and game over asking play again!
 *AWESOME Algo:
 *set position using random!!
 *set button labels as in order of word :D
 *have 7 labels
 *when a letter pressed
 *button goes invisible
 *label gets visible*/
import java.util.*;
import javax.imageio.*;
import java.io.*;
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
class MyFrame extends Frame
{
	Toolkit toolkit1 = Toolkit.getDefaultToolkit();
	Image try1 = toolkit1.getImage("try8.jpg");
	Font e1 = new Font("Comic Sans MS",Font.BOLD|Font.ITALIC,25);
	Font e2 = new Font("Verdana",Font.BOLD,11);
	public MyFrame(String s)
	{
		super(s);
		//setBackground(Color.yellow);
		setForeground(Color.red);
		setSize(400,300);
		MyWindowAdapter adapter=new MyWindowAdapter(this);
		addWindowListener(adapter);
	}
	public void paint(Graphics g)
	{
		g.drawImage(try1,0,0,this);
		g.setColor(Color.black);
		g.setFont(e1);
		g.drawString("Rules:",150,75);
		g.setFont(e2);
		g.drawString("You are given a seven letter jumbled word",20,100);
		g.drawString("Your aim is to guess it",20,125);
		g.drawString("Click on each letter to form the word",20,150);
		g.drawString("Qualify for the next round by entering the correct word!",20,175);
		g.drawString("You have unlimited tries",20,200);
		g.drawString("If you give up your game is over",20,225);
	}
}
class MyWindowAdapter extends WindowAdapter
{
	MyFrame myframe;
	public MyWindowAdapter(MyFrame myframe)
	{
		this.myframe=myframe;
	}
	public void windowClosing(WindowEvent we)
	{
		myframe.setVisible(false);
	}
}
public class Layout extends Applet implements ActionListener
{
	Random r=new Random();
	int lineno=r.nextInt(330);
	String line=Read(lineno);
	Frame f;
	Toolkit toolkit = Toolkit.getDefaultToolkit();
	Image bground = toolkit.getImage("try7_1.jpg");
	//Image try1 = toolkit.getImage("try5.jpg");
	Font f1=new Font("Charlemagne Std",Font.BOLD,24);
	Font f2=new Font("Comic Sans MS",Font.BOLD,15);
	Font f3=new Font("Charlemagne Std",Font.ITALIC,15);
	Font f4=new Font("Cambria",Font.PLAIN,12);
	Font f5=new Font("Monotype Corsiva",Font.BOLD,24);
	int count=0;
	int level=1;
	String Action;
	private Button Letter1;
	private Button Letter2;
	private Button Letter3;
	private Button Letter4;
	private Button Letter5;
	private Button Letter6;
	private Button Letter7;
	private Button Show1;
	private Button Show2;
	private Button Show3;
	private Button Show4;
	private Button Show5;
	private Button Show6;
	private Button Show7;
	private Button Enter;
	private Button Rules;
	private Button Clear;
	private Button NextRound;
	private Button GiveUp;
	String userString;
	String word=line;
	String msgdisp="Your Word Here:";
	Color c= new Color(85,0,195,0);
	Color c3=new Color(135,0,255,0);
	public void init()
	{
		f=new MyFrame("Rules");
	}
	public void start()
	{
	f.setVisible(false);
	}
	public Layout()
	{
		Letter1=new Button(""+word.charAt(2));
		Letter2=new Button(""+word.charAt(5));
		Letter3=new Button(""+word.charAt(1));
		Letter4=new Button(""+word.charAt(6));
		Letter5=new Button(""+word.charAt(4));
		Letter6=new Button(""+word.charAt(0));
		Letter7=new Button(""+word.charAt(3));
		Show1=new Button();
		Show2=new Button();
		Show3=new Button();
		Show4=new Button();
		Show5=new Button();
		Show6=new Button();
		Show7=new Button();
		Enter=new Button("Enter");
		Clear=new Button("Clear");
		Rules=new Button("Rules");
		NextRound=new Button("Next Round");	
		GiveUp=new Button("Give Up");
		add(Letter1);
		add(Letter2);
		add(Letter3);
		add(Letter4);
		add(Letter5);
		add(Letter6);
		add(Letter7);
		add(Show1);
		add(Show2);
		add(Show3);
		add(Show4);
		add(Show5);
		add(Show6);
		add(Show7);
		add(Enter);
		add(Rules);
		add(Clear);
		add(NextRound);
		add(GiveUp);
		Letter1.addActionListener(this);
		Letter1.setActionCommand("Letter1");
		Letter2.addActionListener(this);
		Letter2.setActionCommand("Letter2");
		Letter3.addActionListener(this);
		Letter3.setActionCommand("Letter3");
		Letter4.addActionListener(this);
		Letter4.setActionCommand("Letter4");
		Letter5.addActionListener(this);
		Letter5.setActionCommand("Letter5");
		Letter6.addActionListener(this);
		Letter6.setActionCommand("Letter6");
		Letter7.addActionListener(this);
		Letter7.setActionCommand("Letter7");
		Enter.addActionListener(this);
		Enter.setActionCommand("Enter");
		Clear.addActionListener(this);
		Clear.setActionCommand("Clear");
		Rules.addActionListener(this);
		Rules.setActionCommand("Rules");
		NextRound.addActionListener(this);
		NextRound.setActionCommand("NextRound");
		NextRound.setEnabled(false);
		GiveUp.addActionListener(this);
		GiveUp.setActionCommand("GiveUp");
		Show1.setEnabled(false);
		Show2.setEnabled(false);
		Show3.setEnabled(false);
		Show4.setEnabled(false);
		Show5.setEnabled(false);
		Show6.setEnabled(false);
		Show7.setEnabled(false);
		/*this.myButton.setLocation(25, 50);
        this.myButton.setSize(30, 40);
*/
	}
	public void actionPerformed(ActionEvent e)
	{
		//String Action;
		Action=e.getActionCommand();
		if(Action.equals("Letter1"))
		{
			count++;
			Letter1.setEnabled(false);
			if(count==1)
				Show1.setLabel(Letter1.getLabel());
			else if(count==2)
				Show2.setLabel(Letter1.getLabel());
			else if(count==3)
				Show3.setLabel(Letter1.getLabel());
			else if(count==4)
				Show4.setLabel(Letter1.getLabel());
			else if(count==5)
				Show5.setLabel(Letter1.getLabel());
			else if(count==6)
				Show6.setLabel(Letter1.getLabel());
			else if(count==7)
				Show7.setLabel(Letter1.getLabel());
		}
		if(Action.equals("Letter2"))
		{
			count++;
			Letter2.setEnabled(false);
			if(count==1)
				Show1.setLabel(Letter2.getLabel());
			else if(count==2)
				Show2.setLabel(Letter2.getLabel());
			else if(count==3)
				Show3.setLabel(Letter2.getLabel());
			else if(count==4)
				Show4.setLabel(Letter2.getLabel());
			else if(count==5)
				Show5.setLabel(Letter2.getLabel());
			else if(count==6)
				Show6.setLabel(Letter2.getLabel());
			else if(count==7)
				Show7.setLabel(Letter2.getLabel());
		}
		if(Action.equals("Letter3"))
		{
			count++;
			Letter3.setEnabled(false);
			if(count==1)
				Show1.setLabel(Letter3.getLabel());
			else if(count==2)
				Show2.setLabel(Letter3.getLabel());
			else if(count==3)
				Show3.setLabel(Letter3.getLabel());
			else if(count==4)
				Show4.setLabel(Letter3.getLabel());
			else if(count==5)
				Show5.setLabel(Letter3.getLabel());
			else if(count==6)
				Show6.setLabel(Letter3.getLabel());
			else if(count==7)
				Show7.setLabel(Letter3.getLabel());
		}
		if(Action.equals("Letter4"))
		{
			count++;
			Letter4.setEnabled(false);
			if(count==1)
				Show1.setLabel(Letter4.getLabel());
			else if(count==2)
				Show2.setLabel(Letter4.getLabel());
			else if(count==3)
				Show3.setLabel(Letter4.getLabel());
			else if(count==4)
				Show4.setLabel(Letter4.getLabel());
			else if(count==5)
				Show5.setLabel(Letter4.getLabel());
			else if(count==6)
				Show6.setLabel(Letter4.getLabel());
			else if(count==7)
				Show7.setLabel(Letter4.getLabel());
		}
		if(Action.equals("Letter5"))
		{
			count++;
			Letter5.setEnabled(false);
			if(count==1)
				Show1.setLabel(Letter5.getLabel());
			else if(count==2)
				Show2.setLabel(Letter5.getLabel());
			else if(count==3)
				Show3.setLabel(Letter5.getLabel());
			else if(count==4)
				Show4.setLabel(Letter5.getLabel());
			else if(count==5)
				Show5.setLabel(Letter5.getLabel());
			else if(count==6)
				Show6.setLabel(Letter5.getLabel());
			else if(count==7)
				Show7.setLabel(Letter5.getLabel());
		}
		if(Action.equals("Letter6"))
		{
			count++;
			Letter6.setEnabled(false);
			if(count==1)
				Show1.setLabel(Letter6.getLabel());
			else if(count==2)
				Show2.setLabel(Letter6.getLabel());
			else if(count==3)
				Show3.setLabel(Letter6.getLabel());
			else if(count==4)
				Show4.setLabel(Letter6.getLabel());
			else if(count==5)
				Show5.setLabel(Letter6.getLabel());
			else if(count==6)
				Show6.setLabel(Letter6.getLabel());
			else if(count==7)
				Show7.setLabel(Letter6.getLabel());
		}
		if(Action.equals("Letter7"))
		{
			count++;
			Letter7.setEnabled(false);
			if(count==1)
				Show1.setLabel(Letter7.getLabel());
			else if(count==2)
				Show2.setLabel(Letter7.getLabel());
			else if(count==3)
				Show3.setLabel(Letter7.getLabel());
			else if(count==4)
				Show4.setLabel(Letter7.getLabel());
			else if(count==5)
				Show5.setLabel(Letter7.getLabel());
			else if(count==6)
				Show6.setLabel(Letter7.getLabel());
			else if(count==7)
				Show7.setLabel(Letter7.getLabel());
		}
		if(Action.equals("Enter"))
		{
			userString=Show1.getLabel()+Show2.getLabel()+Show3.getLabel()+Show4.getLabel()+Show5.getLabel()+Show6.getLabel()+Show7.getLabel();
			if(userString.equals(word))
			{
				msgdisp="Correct! Move to Next Level";
				Enter.setEnabled(false);
				Clear.setEnabled(false);
				//Twist.setEnabled(false);
				GiveUp.setEnabled(false);
				NextRound.setEnabled(true);
				repaint();
			}
			else
			{
				msgdisp="Wrong Word!";
				Show1.setLabel("");
				Show2.setLabel("");
				Show3.setLabel("");
				Show4.setLabel("");
				Show5.setLabel("");
				Show6.setLabel("");
				Show7.setLabel("");
				Letter1.setEnabled(true);
				Letter2.setEnabled(true);
				Letter3.setEnabled(true);
				Letter4.setEnabled(true);
				Letter5.setEnabled(true);
				Letter6.setEnabled(true);
				Letter7.setEnabled(true);
				count=0;
				repaint();
			}
		}
		if(Action.equals("Clear"))
		{
			msgdisp="Your word here:";
			Show1.setLabel("");
			Show2.setLabel("");
			Show3.setLabel("");
			Show4.setLabel("");
			Show5.setLabel("");
			Show6.setLabel("");
			Show7.setLabel("");
			Letter1.setEnabled(true);
			Letter2.setEnabled(true);
			Letter3.setEnabled(true);
			Letter4.setEnabled(true);
			Letter5.setEnabled(true);
			Letter6.setEnabled(true);
			Letter7.setEnabled(true);
			count=0;
		}
		if(Action.equals("Rules"))
		{
			f.setVisible(true);
		}
		/*if(Action.equals("Twist"))
		{
			//twist the labels
			Vector v=new Vector(7);
			for(int i=0;i<7;i++)
			{
				v.addElement(new Integer(i+1));
			}
			for(int i=0;i<7;i++)
			{
				int temp=r.nextInt(v.size());
				//now v[temp] is set to label i
				//and v[temp] is deleted from v
				int check=(Integer)v.elementAt(temp);
				char chara=word.charAt(check);
				if(i==0)
				{
					Letter1.setLabel(""+chara);
				}
				else if(i==1)
				{
					Letter2.setLabel(""+chara);
				}
				else if(i==2)
				{
					Letter3.setLabel(""+chara);
				}
				else if(i==3)
				{
					Letter4.setLabel(""+chara);
				}
				else if(i==4)
				{
					Letter5.setLabel(""+chara);
				}
				else if(i==5)
				{
					Letter6.setLabel(""+chara);
				}
				else if(i==6)
				{
					Letter7.setLabel(""+chara);
				}
				v.removeElementAt(check);
			}
		}*/
		if(Action.equals("NextRound"))
		{
			//I have to set my word to a random word now:
			lineno=r.nextInt(340);
			word=Read(lineno);
			Letter1.setLabel(""+word.charAt(2));
			Letter2.setLabel(""+word.charAt(5));
			Letter3.setLabel(""+word.charAt(6));
			Letter4.setLabel(""+word.charAt(1));
			Letter5.setLabel(""+word.charAt(0));
			Letter6.setLabel(""+word.charAt(3));
			Letter7.setLabel(""+word.charAt(4));
			Letter1.setEnabled(true);
			Letter2.setEnabled(true);
			Letter3.setEnabled(true);
			Letter4.setEnabled(true);
			Letter5.setEnabled(true);
			Letter6.setEnabled(true);
			Letter7.setEnabled(true);
			Show1.setLabel("");
			Show2.setLabel("");
			Show3.setLabel("");
			Show4.setLabel("");
			Show5.setLabel("");
			Show6.setLabel("");
			Show7.setLabel("");
			Enter.setEnabled(true);
			Rules.setEnabled(true);
			Clear.setEnabled(true);
			GiveUp.setEnabled(true);
			NextRound.setEnabled(false);
			count=0;
			level++;
			msgdisp="Your Word Here:";
			repaint();
		}
		if(Action.equals("GiveUp"))
		{
			Letter1.setEnabled(false);
			Letter2.setEnabled(false);
			Letter3.setEnabled(false);
			Letter4.setEnabled(false);
			Letter5.setEnabled(false);
			Letter6.setEnabled(false);
			Letter7.setEnabled(false);
			Enter.setEnabled(false);
			Rules.setEnabled(true);
			NextRound.setEnabled(false);
			Clear.setEnabled(false);
			Show1.setLabel(""+word.charAt(0));
			Show1.setEnabled(true);
			Show2.setLabel(""+word.charAt(1));
			Show2.setEnabled(true);
			Show3.setLabel(""+word.charAt(2));
			Show3.setEnabled(true);
			Show4.setLabel(""+word.charAt(3));
			Show4.setEnabled(true);
			Show5.setLabel(""+word.charAt(4));
			Show5.setEnabled(true);
			Show6.setLabel(""+word.charAt(5));
			Show6.setEnabled(true);
			Show7.setLabel(""+word.charAt(6));
			Show7.setEnabled(true);
			GiveUp.setEnabled(false);
			msgdisp="Game Over, Try Next Time!";
			repaint();
		}
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.white);
		g.drawImage(bground,0,0,this);
		g.setFont(f2);
		Color c2=new Color(150,150,250,0);
		Letter1.setBackground(c2);
		Letter1.setForeground(c);
		Letter1.setSize(30,30);
		Letter1.setFont(f3);
		Letter1.setLocation(65,90);
		Letter2.setBackground(c2);
		Letter2.setForeground(c);
		Letter2.setSize(30,30);
		Letter2.setFont(f3);
		Letter2.setLocation(115,90);
		Letter3.setBackground(c2);
		Letter3.setForeground(c);
		Letter3.setSize(30,30);
		Letter3.setFont(f3);
		Letter3.setLocation(165,90);
		Letter4.setBackground(c2);
		Letter4.setForeground(c);
		Letter4.setSize(30,30);
		Letter4.setFont(f3);
		Letter4.setLocation(215,90);
		Letter5.setBackground(c2);
		Letter5.setForeground(c);
		Letter5.setSize(30,30);
		Letter5.setFont(f3);
		Letter5.setLocation(265,90);
		Letter6.setBackground(c2);
		Letter6.setForeground(c);
		Letter6.setSize(30,30);
		Letter6.setFont(f3);
		Letter6.setLocation(315,90);
		Letter7.setBackground(c2);
		Letter7.setForeground(c);
		Letter7.setSize(30,30);
		Letter7.setFont(f3);
		Letter7.setLocation(375,90);
		Enter.setBackground(c2);
		Enter.setForeground(c);
		Enter.setSize(75,35);
		Enter.setFont(f4);
		Enter.setLocation(220,230);
		//g.drawImage(try1, 20, 230, null);
		//Twist.setBackground(Color.white);
		//Twist.setOpaque(false);
		Rules.setBackground(c2);
		//Twist.setIcon(try1);
		Rules.setForeground(c);
		Rules.setSize(75,35);
		Rules.setFont(f4);
		Rules.setLocation(20,230);
		Clear.setBackground(c2);
		Clear.setForeground(c);
		Clear.setSize(75,35);
		Clear.setFont(f4);
		Clear.setLocation(125,230);
		NextRound.setBackground(c2);
		NextRound.setForeground(c);
		NextRound.setSize(75,35);
		NextRound.setFont(f4);
		NextRound.setLocation(320,230);
		GiveUp.setBackground(c2);
		GiveUp.setForeground(c);
		GiveUp.setSize(75,35);
		GiveUp.setFont(f4);
		GiveUp.setLocation(420,230);
		Show1.setBackground(c);
		Show1.setForeground(Color.black);
		Show1.setSize(50,50);
		Show1.setFont(f1);
		Show2.setBackground(c);
		Show2.setForeground(Color.black);
		Show2.setSize(50,50);
		Show2.setFont(f1);
		Show3.setBackground(c);
		Show3.setForeground(Color.black);
		Show3.setSize(50,50);
		Show3.setFont(f1);
		Show4.setBackground(c);
		Show4.setForeground(Color.black);
		Show4.setSize(50,50);
		Show4.setFont(f1);
		Show5.setBackground(c);
		Show5.setForeground(Color.black);
		Show5.setSize(50,50);
		Show5.setFont(f1);
		Show6.setBackground(c);
		Show6.setForeground(Color.black);
		Show6.setSize(50,50);
		Show6.setFont(f1);
		Show7.setBackground(c);
		Show7.setForeground(Color.black);
		Show7.setSize(50,50);
		Show7.setFont(f1);
		g.drawString(msgdisp,130,150);
		g.setFont(f5);
		g.setColor(Color.black);
		g.drawString("LEVEL:  "+level,375,50);
		Show1.setLocation(45,165);
		Show2.setLocation(105,165);
		Show3.setLocation(165,165);
		Show4.setLocation(225,165);
		Show5.setLocation(285,165);
		Show6.setLocation(345,165);
		Show7.setLocation(405,165);
	}
	public static String Read(int l)
	{
		String line_here="";
		try
		{
			FileReader fr = new FileReader("youcandomore.txt");
			BufferedReader br = new BufferedReader(fr);
			for(int i=0;i<340;i++)
			{
				if(i==l)
				{
					line_here=br.readLine();
				}
				else
				{
					br.readLine();
				}
			}
		}
		catch(Exception e)
		{
		}
		return line_here;	
	}
}
/*left to do:
 *twist button ka algo soch which will also be applied to start of the word(using random class)...
 *display played til what level...
 *improve background ka pic(ask anish)...
 *button ka background to a picture...
 *button background ps...
 *file handling se first word bhi random ho******
 *aur next round mein bhi random ho*****
 *either word list should have many many words...
 *or make sure ki word doesnt repeat...
 *get a popup/msgbox after give up or game over asking if you want to play again******
 *GET BACK TO WORK!
 */
 /*Name suggestions:
  *Guess the word
  *Anagram (Something)
  *Shuffler (Something)
  *Word (something) eg: wonder
  */
  /*Also:
   *I can get the word list of all oxford words from Qpod dictionary
   *make a different program which will check fo 7 letter words and copy it to a new txt file/array 
   */
   /*It aint imp that file se hi word aaye
    *keep an array of words na
    */
    /*button color:
     *lighest
     *backgroung darker
     *txt darkest
     */