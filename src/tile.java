import javax.swing.*;
import java.util.Observable;
import java.util.Observer;

public abstract class tile extends Observable{
    private labeltypes label;
    public tile(labeltypes label) {
        this.label = label;
    }
    public labeltypes getTileLabel(){
        return(this.label);
    }
}
