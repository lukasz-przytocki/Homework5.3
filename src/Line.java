public class Line {
    Point point;

    double Lenght(){
        return Math.abs(Math.sqrt(Math.pow((point.getCoordinateAx()-point.getCoordinateBx()),2) + (Math.pow((point.getCoordinateAy()-point.getCoordinateBy()),2))));
    }

}
