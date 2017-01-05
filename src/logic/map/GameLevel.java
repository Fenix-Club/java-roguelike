package logic.map;


import java.util.Random;

/**
 * Created by npotocka on 05.01.17.
 */
public class GameLevel {
    int n; //dimensions
    LevelTile[][] map = new LevelTile[n][n];

    public GameLevel(int n, String type){
        this.n = n;
        switch (type){
            case "random":
                this.GroundGenerator(n);
                break;
            case "file":
                System.out.println("TO BE DONE, randomly generating");
                this.GroundGenerator(n);
                break;

        }

    }

    public GameLevel(int n){
        this.n = n;
        for(int i = 0; i < this.n; i++){
            for(int j =0; j < this.n; j++){
                this.map[i][j] = new LevelTile("Soil");
            }
        }
    }

    public int getN() {
        return n;
    }


    private void GroundGenerator(int n){
        Random rnd = new Random();
        int grdTypeNumber = rnd.nextInt(3);
        for(int i = 0; i < n; i++){
            for(int j =0; j < this.n; j++){
                switch (grdTypeNumber){
                    case 0:
                        this.map[i][j] = new LevelTile("Soil");
                        break;
                    case 1:
                        this.map[i][j] = new LevelTile("Tree");
                        break;
                    case 2:
                        this.map[i][j] = new LevelTile("Wall");
                        break;
                }
            }
        }
    }


}
