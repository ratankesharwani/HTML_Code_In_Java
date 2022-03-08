import javax.swing.*;
public class MainClass {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ratan Kesharwani");
        JButton button = new JButton();
        button.setText ("<html><font face='Tahoma'" + " color=blue><b>This text has an HTML Code<b></font><br><font face='courier new'" +
                " color=red><center>Sourcecodester<center></font></html>");

        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
