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
}

