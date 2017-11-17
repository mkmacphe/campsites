public abstract class tile {
    private labeltypes label;
    public tile(labeltypes label) {
        this.label = label;
    }
    public labeltypes getLabel(){
        return(this.label);
    }
}
