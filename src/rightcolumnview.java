import javax.swing.*;
import java.awt.*;

public class rightcolumnview extends JPanel{
    private rightcolumn tilecounts;
    public rightcolumnview(rightcolumn tilecounts){
        this.tilecounts = tilecounts;
        setLayout(new GridLayout(tilecounts.getSize(),1));
        for(rowcount total:tilecounts.getTenttotals()){
            add(new rowcountview(total));
        }
    }
}
