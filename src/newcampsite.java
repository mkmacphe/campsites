import javax.swing.*;

public class newcampsite{
    private Integer size;
    private board campsiteboard;
    private JFrame frame;
    public newcampsite(Integer size){
        this.size = size;
        campsiteboard = new board(size);
        frame.add(new boardview(campsiteboard));
        frame.setVisible(true);
    }

    public static void main(String[] args){
        newcampsite testsite = new newcampsite(10);
    }
}
