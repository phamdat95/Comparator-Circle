import java.util.Arrays;

public class ComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3,"Blue");
        circles[1] = new Circle(4,"Red");
        circles[2] = new Circle(1,"Green");

        System.out.println("before: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        ComparatorCircle comparatorCircle = new ComparatorCircle();
        Arrays.sort(circles,comparatorCircle);

        System.out.println("after:");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
