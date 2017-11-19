import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class nottree extends tile {
    private labeltypes guess = labeltypes.EMPTY;
    public nottree(labeltypes tentOrDirt) {
        super(tentOrDirt);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(e.getButton() == MouseEvent.BUTTON1){
                    setTent();
                } else if(e.getButton() == MouseEvent.BUTTON3){
                    setDirt();
                }

            }
        });
    }
    public void makeGuess(labeltypes guess){
        this.guess = guess;
    }
    public labeltypes getGuess(){
        return(this.guess);
    }
    public void setTent(){
        if(guess != labeltypes.TENT){
            makeGuess(labeltypes.TENT);
            try {
                Image img = ImageIO.read(getClass().getResource("resources/tent.png"));
                setIcon(new ImageIcon(img));
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        else{
            makeGuess(labeltypes.EMPTY);
            setIcon(null);
        }
    }

    public void setDirt(){
        if(guess != labeltypes.DIRT){
            makeGuess(labeltypes.DIRT);
            try {
                Image img = ImageIO.read(getClass().getResource("resources/dirt.png"));
                setIcon(new ImageIcon(img));
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
        else{
            makeGuess(labeltypes.EMPTY);
            setIcon(null);
        }
    }


}

