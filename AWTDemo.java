import java.awt.*;
import java.awt.event.*;

class AWTDemo extends Frame {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    AWTDemo() {
        super("CALC");

        // Labels
        l1 = new Label("Enter the first value:");
        l2 = new Label("Enter the second value:");
        l3 = new Label("Result:");
        l1.setBounds(100, 150, 150, 30);
        l2.setBounds(100, 200, 150, 30);
        l3.setBounds(100, 320, 150, 30);

        // Text Fields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();
        t1.setBounds(270, 150, 150, 30);
        t2.setBounds(270, 200, 150, 30);
        t3.setBounds(270, 320, 150, 30);

        add(l1);
        add(l2);
        add(l3);
        add(t1);
        add(t2);
        add(t3);

        // Buttons
        b1 = new Button("Add");
        b2 = new Button("Sub");
        b3 = new Button("Mul");
        b4 = new Button("Div");
        b1.setBounds(100, 260, 60, 30);
        b2.setBounds(170, 260, 60, 30);
        b3.setBounds(240, 260, 60, 30);
        b4.setBounds(310, 260, 60, 30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setLayout(null);
        setSize(600, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });

        // Action Listeners
        /*converts it into the integer 123 that can be 
        used in mathematical operations.
        This is necessary because user input from text fields 
        is always received as a String, not as a number.*/
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int val1 = Integer.parseInt(t1.getText());
                int val2 = Integer.parseInt(t2.getText());
                int sum = val1 + val2;
                t3.setText(String.valueOf(sum)); 
                /*to convert the int value to string because 
                the textfield only accepts the strings*/ 
            }
        });

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int val1 = Integer.parseInt(t1.getText());
                int val2 = Integer.parseInt(t2.getText());
                int sub = val1 - val2;
                t3.setText(String.valueOf(sub));  
            }
        });

        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int val1 = Integer.parseInt(t1.getText());
                int val2 = Integer.parseInt(t2.getText());
                int mul = val1 * val2;
                t3.setText(String.valueOf(mul));  
            }
        }); 

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int val1 = Integer.parseInt(t1.getText());
                int val2 = Integer.parseInt(t2.getText());
                if(val2 == 0) { // To Check division by zero
                    t3.setText("Error: Div by 0");
                } else {
                    int div = val1 / val2;
                    t3.setText(String.valueOf(div)); 
                }
            }
        });
    }

    public static void main(String... args) {
        new AWTDemo();
    }
}
