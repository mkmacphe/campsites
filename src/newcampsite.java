import javax.swing.*;
import java.awt.*;

public class newcampsite{
    private Integer size;
    private board campsiteboard;
    private JPanel panel;
    private JFrame frame;
    public newcampsite(Integer size){
        this.size = size;
        this.panel = new JPanel();
        panel.setLayout(new GridLayout(1,2));
        campsiteboard = new board(size);
        panel.add(new boardview(campsiteboard));
        panel.add(new rightcolumnview(new rightcolumn(campsiteboard)));
        this.frame = new JFrame("Campsites");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*frame.setBounds(100, 100, 500, 500);*/
        frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args){
        newcampsite testsite = new newcampsite(10);
    }
}
