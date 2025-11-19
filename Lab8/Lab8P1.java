import java.awt.event.*;
import java.awt.*;
class Lab8P1 extends Frame implements ActionListener{
	Label l;
	
	Lab8P1(){
	super("MenuBar"); 
	MenuBar mb = new MenuBar();
	setMenuBar(mb);
	BorderLayout bl = new BorderLayout();
	setLayout(bl);
	l = new Label();
	l.setFont(new Font("Arial" , Font.BOLD,40));
	l.setAlignment(Label.CENTER);
	//l.setBounds(10, 10, 100, 500);

	add(l,bl.CENTER);
	Menu file = new Menu("File");
	String[] menus = {"File","Edit","Help"};
	String[][] items = {
            {"Open", "Save", "Close"},
            {"Cut", "Copy", "Paste"},
            {"About", "Update", "Liscense"},
        };
	int x = 0, y = 0;	
	Button b = new Button();
	for(String s : menus){
		y = 0;
		Menu m = new Menu(s);
		
		for(int i=0;i<3;i++){
		MenuItem mmi = new MenuItem(items[x][y]);
		mmi.addActionListener(this);
		m.add(mmi);
		y++;
		}
		x++;
		mb.add(m);
		}	
		setSize(400,400);
		setVisible(true);
		
		
		b.addActionListener(
			new ActionListener(){
		public void actionPerformed(ActionEvent ae){
			String mstr = ae.getActionCommand();
			if(mstr.equals("Close")){
				System.exit(0);
				}else{
				l.setText(mstr);
				}
			}
		}); 
		
		addWindowListener(new WindowAdapter() {
            		public void windowClosing(WindowEvent we) {
                		dispose();
			
	}
	
	});
	}	
public static void main(String...args){
	new Lab8P1();
}
}
