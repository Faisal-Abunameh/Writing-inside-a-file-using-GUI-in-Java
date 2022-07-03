import java.util.;
import java.awt.event.;
import javax.swing.;
import java.io.;

public class GUIwWrittingFile implements ActionListener {
private JFrame f1;
private JLabel l1, l2, l3;
private JTextField tf1, tf2, tf3;
private JButton b1;
private JPanel p1;
private BufferedWriter bf;
private FileWriter fw;

public GUIwWrittingFile(){
    method();
}

public void method(){
    f1 = new JFrame(Database);
    f1.setSize(250,300);

    l1 = new JLabel(Name );
    l2 = new JLabel(Country );
    l3 = new JLabel(Telephone number );
    tf1 = new JTextField(20);
    tf2 = new JTextField(20);
    tf3 = new JTextField(20);
    b1 = new JButton(Save to database);
    p1 = new JPanel();

    b1.addActionListener(this);

    p1.add(l1);
    p1.add(tf1);
    p1.add(l2);
    p1.add(tf2);
    p1.add(l3);
    p1.add(tf3);
    p1.add(b1);
    f1.getContentPane().add(p1);

    f1.setVisible(true);
}

public void actionPerformed(ActionEvent d){
    if (d.getSource() == b1){
        try{
            fw = new FileWriter(CUsers);    write here the path of the file with its extension
            bf = new BufferedWriter(fw);
            bf.write(tf1.getText() + n);
            bf.write(tf2.getText() + n);
            bf.write(tf3.getText() + n);
            bf.close();
            fw.close();

            JOptionPane.showMessageDialog(f1,This action has been performed successfully);    a message to show that it has been performed successfully
        }catch(IOException ex){
            System.out.println(Error!!);
        }
    }
}
}