package logic.map.ground;

/**
 * Created by npotocka on 05.01.17.
 */
/*public abstract class GroundType {
    String name;
}*/


public enum GroundType {
    SOIL("Soil"),
    TREE("Tree"),
    WALL("Wall");

    private String type;

    private GroundType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.type;
    }
}