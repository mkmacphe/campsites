import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class nottree extends tile {
    private labeltypes guess = labeltypes.EMPTY;
    public nottree(labeltypes tentOrDirt) {
        super(tentOrDirt);
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

