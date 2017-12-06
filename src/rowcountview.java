import java.util.Observable;
import java.util.Observer;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
public class rowcountview extends JButton implements Observer {
    private rowcount row;
    public rowcountview(rowcount row){
        this.row = row;
        this.row.addObserver(this);
        this.setText(row.getCount().toString());
    }
    public void update(Observable obs, Object obj) {
    }
}
