public class Point {
    private double coordinateAx;
    private double coordinateAy;
    private double coordinateBx;
    private double coordinateBy;

    public Point(double coordinateAx, double coordinateAy, double coordinateBx, double coordinateBy) {
        this.coordinateAx = coordinateAx;
        this.coordinateAy = coordinateAy;
        this.coordinateBx = coordinateBx;
        this.coordinateBy = coordinateBy;
    }

    public double getCoordinateAx() {
        return coordinateAx;
    }

    public double getCoordinateAy() {
        return coordinateAy;
    }

    public double getCoordinateBx() {
        return coordinateBx;
    }

    public double getCoordinateBy() {
        return coordinateBy;
    }

}
