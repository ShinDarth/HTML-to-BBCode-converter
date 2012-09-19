import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame
{
	public static myFrame frame = new myFrame();
	private JMenuBar myMenuBar = new JMenuBar();
	
	private JMenu File = new JMenu();
	private JMenu Tools = new JMenu();

	// File
	private JMenuItem ImportHTML = new JMenuItem();
	private JMenuItem ImportBBCode = new JMenuItem();
	private JMenuItem SaveHTML = new JMenuItem();
	private JMenuItem SaveBBCode = new JMenuItem();
	private JMenuItem Exit = new JMenuItem();
	
	// Tools
	private JMenuItem Palette = new JMenuItem();
	
	private myFrame()	{ initFrame(); }
	private void initFrame()
	{
		Toolkit myKit=Toolkit.getDefaultToolkit();
		Dimension myScreenSize = myKit.getScreenSize();
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("HTML-BBCode converter");
		this.setVisible(true);
		this.setSize(myScreenSize.width/2, myScreenSize.height/2);
		this.setLocation(myScreenSize.width/4, myScreenSize.height/4);
		
		File.setText("File");
		Tools.setText("Tools");
		
		ImportHTML.setText("Import HTML..");
		ImportBBCode.setText("Import BBCode..");
		SaveHTML.setText("Save HTML");
		SaveBBCode.setText("Save BBCode");
		Exit.setText("Exit");
		
		this.setJMenuBar(myMenuBar);
		
		myMenuBar.add(File);
		myMenuBar.add(Tools);
		
		File.add(ImportHTML);
		File.add(ImportBBCode);
		File.add(SaveHTML);
		File.add(SaveBBCode);
		File.add(Exit);
	}
	
	public static myFrame getFrame()	{ return frame; }
	
}
