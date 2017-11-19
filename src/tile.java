import javax.swing.*;

public abstract class tile extends JButton{
    private labeltypes label;
    public tile(labeltypes label) {
        this.label = label;
    }
    public labeltypes getTileLabel(){
        return(this.label);
    }
}
