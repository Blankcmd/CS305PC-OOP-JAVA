import java.awt.event.*;
import java.awt.*;
class Lab7P2 implements ActionListener{
	int a = 1;
	Frame f = new Frame();
	FlowLayout fl = new FlowLayout();
	Button b = new Button("Click");
	Label l = new Label();
	TextField tf = new TextField(20);
	Lab7P2(){
		f.setLayout(fl);
		f.setSize(300, 300);
		b.addActionListener(this);
		f.addWindowListener(new WindowAdapter() {
            		public void windowClosing(WindowEvent we) {
                		f.dispose();
		}
		});
		b.setSize(20, 40);
		l.setPreferredSize(new Dimension(200, 40));
		f.add(tf);
        		f.add(b);
        		f.add(l);
        		f.setVisible(true);
        		
		}
	
		
		
		public void actionPerformed(ActionEvent ae){
		System.out.println("Hello");
		l.setText(tf.getText()+" "+a);
		a++;

		}
		public static void main(String...args){
		 	new Lab7P2();
		}	
		
	
}
