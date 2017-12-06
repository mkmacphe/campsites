import java.util.Observable;
import java.util.Observer;
public class rowcount extends Observable{
    private int tentcount = 0;
    public rowcount(tile[] tilerow){
        for(Integer i = 0; i < tilerow.length; i++){
            if(tilerow[i].getTileLabel() == labeltypes.TENT){
                tentcount++;
            }
        }
    }
    public Integer getCount(){
        return(tentcount);
    }
}
