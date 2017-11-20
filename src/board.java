import java.util.*;
public class board {
    private tile[][] tiles;
    private Integer gridsize;
    private ArrayList<Integer> tilesAvailableForTree;
    private ArrayList<Integer> tilesAvailableForTent;
    public board(Integer size){
        this.gridsize = size + 2;
        this.tiles = new tile[gridsize][gridsize];
        for(Integer i = 0; i < (gridsize * gridsize); i++){
            tiles[i % gridsize][i / gridsize] = new dirt();
        }
        this.tilesAvailableForTree = new ArrayList<Integer>();
        this.tilesAvailableForTent = new ArrayList<Integer>();
        initialAvailableTiles();
        for(Integer i = 0; i < (size * size)/5; i++){
            placeTreeAndTent();
        }
    }
    private void initialAvailableTiles(){
        for (Integer i = 0; i < gridsize * gridsize; i++){
            if(i > gridsize && i < (gridsize * gridsize - gridsize)
                    && (i % gridsize) != 0
                    && (i % gridsize) != (gridsize - 1)){
                tilesAvailableForTree.add(i);
                tilesAvailableForTent.add(i);
            }
        }
    }

    private void placeTreeAndTent(){
        Random rand = new Random();
        ArrayList<Integer> possibleTents;
        Integer tentPlaced = 0;
        Integer randomTree = tilesAvailableForTree.get(rand.nextInt(tilesAvailableForTree.size()));
        possibleTents = new ArrayList<Integer>();
        possibleTents.add(randomTree - gridsize);
        possibleTents.add(randomTree - 1);
        possibleTents.add(randomTree + 1);
        possibleTents.add(randomTree + gridsize);
        Collections.shuffle(possibleTents);
        for(Integer randomTent : possibleTents){
            if(tilesAvailableForTent.contains(randomTent)){
                placeTent(randomTent);
                placeTree(randomTree);
                removeAvailableTiles(randomTree, randomTent);
                tentPlaced = 1;
                break;
            }
        }
        if (tentPlaced == 0){
            tilesAvailableForTree.remove(randomTree);
            tilesAvailableForTent.remove(randomTree);
        }
    }

    private void removeAvailableTiles(Integer treeTile, Integer tentTile){
        Integer a = tentTile - (gridsize+1);
        Integer b = tentTile - gridsize;
        Integer c = tentTile - (gridsize - 1);
        Integer d = tentTile - 1;
        Integer e = tentTile + 1;
        Integer f = tentTile + (gridsize + 1);
        Integer g = tentTile + gridsize;
        Integer h = tentTile + (gridsize - 1);
        tilesAvailableForTree.remove(Integer.valueOf(treeTile));
        tilesAvailableForTree.remove(Integer.valueOf(tentTile));
        tilesAvailableForTent.remove(Integer.valueOf(treeTile));
        tilesAvailableForTent.remove(Integer.valueOf(tentTile));
        tilesAvailableForTent.remove(Integer.valueOf(a));
        tilesAvailableForTent.remove(Integer.valueOf(b));
        tilesAvailableForTent.remove(Integer.valueOf(c));
        tilesAvailableForTent.remove(Integer.valueOf(d));
        tilesAvailableForTent.remove(Integer.valueOf(e));
        tilesAvailableForTent.remove(Integer.valueOf(f));
        tilesAvailableForTent.remove(Integer.valueOf(g));
        tilesAvailableForTent.remove(Integer.valueOf(h));
    }

    private void placeTent(Integer tentTile){
        tiles[(tentTile % gridsize)][(tentTile / gridsize)] = new tent();
    }

    private void placeTree(Integer treeTile){
        tiles[(treeTile % gridsize)][(treeTile / gridsize)] = new tree();
    }

    public void printBoard(){
        for(Integer i = 0; i < gridsize; i++) {
            for (Integer j = 0; j < gridsize; j++) {
                if(i > 0 && i < gridsize-1
                        && j > 0 && j < gridsize-1) {
                    System.out.printf(tiles[i][j].getTileLabel().name() + " ");
                }
            }
            System.out.println();
        }
    }
    public tile[][] getTiles(){
        return(tiles);
    }
    public Integer getSize(){return (gridsize - 2);}
}
