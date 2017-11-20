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
        }
        else{
            makeGuess(labeltypes.EMPTY);
        }
        setChanged();
        notifyObservers();
    }

    public void setDirt(){
        if(guess != labeltypes.DIRT){
            makeGuess(labeltypes.DIRT);
        }
        else{
            makeGuess(labeltypes.EMPTY);
        }
        setChanged();
        notifyObservers();
    }


}

