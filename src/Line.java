public class Line {
    Point point;

    double Lenght(){
        return Math.abs(point.getStartPoint() - point.getEndPoint());
    }

}
