import java.awt.*;
import javax.swing.*;
import javax.imageio.*;

public class tree extends tile {
    public tree(){
        super(labeltypes.TREE);
        try {
            Image img = ImageIO.read(getClass().getResource("resources/tree.png"));
            setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
