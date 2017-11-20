import javax.swing.*;
import java.awt.*;

public class boardview extends JPanel{
    private board campsite;
    public boardview(board campsite){
        this.campsite = campsite;
        makeGrid(campsite.getSize());
    }
    private void makeGrid(int size){
        setLayout(new GridLayout(size,size));
        for(Integer i = 0; i < (size+2); i++) {
            for (Integer j = 0; j < (size+2); j++) {
                if (i > 0 && i < (size + 1)
                        && j > 0 && j < (size + 1)) {
                    if(campsite.getTiles()[i][j].getTileLabel() != labeltypes.TREE){
                        add(new nottreeview((nottree)campsite.getTiles()[i][j]));
                    }
                    else{
                        add(new treeview((tree)campsite.getTiles()[i][j]));
                    }

                }
            }
        }
    }
}
