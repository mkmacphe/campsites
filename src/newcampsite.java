import javax.swing.*;
import java.awt.BorderLayout;

public class newcampsite{
    private Integer size;
    private board campsiteboard;
    private JFrame frame;
    public newcampsite(Integer size){
        this.size = size;
        this.frame = new JFrame("Campsites");
        frame.setBounds(100, 100, 500, 500);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        campsiteboard = new board(size);
        frame.add(new boardview(campsiteboard));
        /*frame.add(new rightcolumnview(new rightcolumn(campsiteboard)));*/
        frame.setVisible(true);
    }

    public static void main(String[] args){
        newcampsite testsite = new newcampsite(10);
    }
}
