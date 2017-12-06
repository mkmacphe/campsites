import java.util.Observable;
import java.util.Observer;

public class rightcolumn extends Observable{
    private board campsiteboard;
    private rowcount[] tenttotals;
    private Integer size;
    public rightcolumn(board campsiteboard){
        this.campsiteboard = campsiteboard;
        this.size = campsiteboard.getSize();
        tenttotals = new rowcount[campsiteboard.getSize()];
        for(Integer i = 1; i < (size + 1); i++) {
            tenttotals[(i-1)] = new rowcount(campsiteboard.getTiles()[i]);
        }

    }
    public Integer getSize(){
        return size;
    }
    public rowcount[] getTenttotals(){
        return tenttotals;
    }
}
