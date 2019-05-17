public class LineTest {
    public static void main(String[] args) {
        Line line1 = new Line();
        line1.point = new Point(1,4,-3,-2);

        Line line2 = new Line();
        line2.point = new Point(1,5,-3,-2);

        LongerLine longerLine = new LongerLine();
        System.out.println("Longer line coordinates: ("+longerLine.LongerLine(line1,line2).point.getCoordinateAx()+ "."+
                longerLine.LongerLine(line1,line2).point.getCoordinateAy() + ";"+longerLine.LongerLine(line1,line2).point.getCoordinateBx()+ "."+
                longerLine.LongerLine(line1,line2).point.getCoordinateBy() +") Lenght:"+ longerLine.LongerLine(line1,line2).Lenght());
    }
}
