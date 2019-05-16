public class LineTest {
    public static void main(String[] args) {
        Line line1 = new Line();
        line1.point = new Point(-5,10);

        Line line2 = new Line();
        line2.point = new Point(1,14);

        LongerLine longerLine = new LongerLine();
        System.out.println("Longer line coordinates: ("+longerLine.LongerLine(line1,line2).point.getStartPoint()+ ";"+
                longerLine.LongerLine(line1,line2).point.getEndPoint() +") Lenght:"+ longerLine.LongerLine(line1,line2).Lenght());
    }
}
