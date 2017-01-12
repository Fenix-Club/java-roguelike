package logic.map;

import logic.map.ground.GroundType;

/**
 * Created by npotocka on 05.01.17.
 */

public class LevelTile {
    private GroundType ground;

    public LevelTile(GroundType ground){
        this.ground = ground;
    }

    public GroundType getGround() {
        return ground;
    }

    public void setGround(GroundType ground) {
        this.ground = ground;
    }

    @Override
    public String toString() {
        return ground.toString();
    }
}
