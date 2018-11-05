import java.util.Comparator;

public class ComparatorCircle extends Circle implements Comparator<Circle> {
    public int compare(Circle circle1, Circle circle2){
        if (circle1.getRadius() > circle2.getRadius()) return 1;
        else if (circle1.getRadius()<circle2.getRadius()) return -1;
        else return 0;
    }
}
