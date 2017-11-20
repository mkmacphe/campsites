import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class treeview extends JButton{
    private tree tile;
    public treeview(tree tile){
        this.tile=tile;
        try {
            Image img = ImageIO.read(getClass().getResource("resources/tree.png"));
            setIcon(new ImageIcon(img));
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
