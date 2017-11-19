import javax.swing.*;
import java.awt.*;

public class newcampsite extends JFrame{
    private Integer size;
    private board campsite;
    private JFrame frame;
    public newcampsite(Integer size){
        this.size = size;
        campsite = new board(size);
        makeGrid();
        frame.setVisible(true);
    }

    private void makeGrid(){
        this.frame = new JFrame("Campsites");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        JPanel p = new JPanel(new GridLayout(size,size));
        for(Integer i = 0; i < (size+2); i++) {
            for (Integer j = 0; j < (size+2); j++) {
                if (i > 0 && i < (size + 1)
                        && j > 0 && j < (size + 1)) {
                    p.add(campsite.getTiles()[i][j]);
                }
            }
        }
        frame.add(p);
    }
    public static void main(String[] args){
        newcampsite testsite = new newcampsite(5);
    }
}
