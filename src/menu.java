import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton saveButton;
    private JButton openButton;
    private JButton newButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("menu");
        frame.setContentPane(new menu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public menu() {
        JFrame frame = new JFrame("JFileChooser Popup");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               textArea1.setText("");
            }
        });


        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog("Filnamn?");
            }


        });
    }
}


