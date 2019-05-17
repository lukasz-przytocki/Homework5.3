public class LongerLine {

    Line LongerLine(Line line1, Line line2){
        if(line1.Lenght()>line2.Lenght()){
            return line1;

        }else if(line1.Lenght()>line2.Lenght()){
            return  line2;

        }
        else{
            return line1; //assumption to return line1 when length is equal.
        }
    }
}
