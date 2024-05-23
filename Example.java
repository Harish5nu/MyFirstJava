import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class Example extends JFrame{
    Example(){
        JLabel lbl=new JLabel("User Id:");
        lbl.setBounds(30,67,150,10);
        add(lbl);

        JTextField txt=new JTextField();
        txt.setBounds(90,60,150,30);
        add(txt);

        setSize(500, 500);
        setLayout(null);
        setVisible(true);

        JLabel lbl1=new JLabel("Password:");
        lbl1.setBounds(30,107,100,10);
        add(lbl1);

        JTextField txt1=new JTextField();
        txt1.setBounds(90,100,150,30);
        add(txt1);

        JButton btn=new JButton("Reset");
        btn.setBounds(10,200,140,30);
        add(btn);

        JButton btn1=new JButton("Submit");
        btn1.setBounds(200,200,140,30);
        add(btn1);

        JCheckBox showPassword = new JCheckBox("Show Password");
        showPassword.setBounds(250, 100, 150, 30);
        add(showPassword);

        }
    public void main(String[] args){
     Example example =new Example();
    }

}

