import java.awt.event.*;
import java.awt.*;
class Lab7P1{
	public static void main(String...args){
		 int a[] = {1};
		Frame f = new Frame();
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		f.setSize(300, 300);
		TextField tf = new TextField(20);
		Button b = new Button("Click");
		b.setSize(20, 40);
		Label l = new Label();
		l.setPreferredSize(new Dimension(200, 40));
		f.add(tf);
        		f.add(b);
        		f.add(l);

		
		b.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent ae){
		System.out.println("Hello");
		l.setText(tf.getText()+" "+a[0]);
		a[0]++;

		}
		});
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
            		public void windowClosing(WindowEvent we) {
                		f.dispose();
		}
		});
	}
}             


                                                                                       
