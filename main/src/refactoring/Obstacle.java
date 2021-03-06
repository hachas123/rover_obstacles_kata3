package refactoring;

public class Obstacle {
    private Dimensions dimensions;
    private Position position;

    public Obstacle(Dimensions dimensions, int xPos, int yPos) {
        this.dimensions = dimensions;
        position = new Position(xPos, yPos);
    }

    public Obstacle(int xDim, int yDim, int xPos, int yPos) {
        dimensions = new Dimensions(xDim, yDim);
        position = new Position(xPos, yPos);
    }

    public Obstacle(int xDim, int yDim, Position position) {
        dimensions = new Dimensions(xDim, yDim);
        this.position = position;
    }

    public int dimensionX() { return dimensions.x_length(); }

    public int dimensionY() {
        return dimensions.y_length();
    }

    public String dimensions() { return dimensions.toString(); }

    public int positionX() { return position.x_position(); }

    public int positionY() { return position.y_position(); }

    public String position() { return position.toString(); }

    public int finalPositionX() { return dimensionX()+positionX()-1; }

    public int finalPositionY() { return dimensionY()+positionY()-1; }

    public Position finalPosition() { return new Position(finalPositionX(),finalPositionY()); }






    public static class Dimensions {
        private int x_length;
        private int y_length;

        public Dimensions(int x_length, int y_length) {
            this.x_length = x_length;
            this.y_length = y_length;
        }

        public int x_length() {
            return x_length;
        }

        public int y_length() {
            return y_length;
        }

        @Override
        public String toString() {
            return "El obstaculo tiene una dimensión de " + x_length
                    + "x" + y_length;
        }
    }

    public static class Position {
        private int x;
        private int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "The obstacle position is " + x + " " + y;
        }

        public int x_position() { return x; }

        public int y_position() { return y; }
    }
}
