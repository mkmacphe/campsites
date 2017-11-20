import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class nottreeview extends JButton implements Observer {
    private nottree tile;

    public nottreeview(nottree tile){
        this.tile = tile;
        this.tile.addObserver(this);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1){
                    tile.setTent();
                } else if(e.getButton() == MouseEvent.BUTTON3){
                    tile.setDirt();
                }

            }
        });
    }

    public void update(Observable obs, Object obj){
        if(tile.getGuess() == labeltypes.TENT){
            try {
                Image img = ImageIO.read(getClass().getResource("resources/tent.png"));
                setIcon(new ImageIcon(img));
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        else if(tile.getGuess() == labeltypes.DIRT){
            try {
                Image img = ImageIO.read(getClass().getResource("resources/dirt.png"));
                setIcon(new ImageIcon(img));
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        else{
            setIcon(null);
        }
    }
}
