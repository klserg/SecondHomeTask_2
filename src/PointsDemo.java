import java.util.Scanner;

public class PointsDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PointList pointList = new PointList();
        int userChoice;
        int amountOfPoints = 0;
        do {
            System.out.println("Enter point coordinates:");
            System.out.print("X: ");
            int coordinateX = scanner.nextInt();
            System.out.print("Y: ");
            int coordinateY = scanner.nextInt();
            Point point = new Point(coordinateX, coordinateY);
            amountOfPoints = point.getCount();
            pointList.addPoint(amountOfPoints, point);
            System.out.println("Would you like to add more points? (1 - YES, 2 - NO) ");
            System.out.print("Your choice: ");
            userChoice = scanner.nextInt();
            if (userChoice !=1 && userChoice !=2) {
                System.out.println("Incorrect command. Command is set to 2 by default");
            }
            System.out.println();
        } while (userChoice > 0 && userChoice < 2);


        System.out.println("Enter center coordinates:");
        System.out.print("X: ");
        int centerCoordinateX = scanner.nextInt();
        System.out.print("Y: ");
        int centerCoordinateY = scanner.nextInt();
        System.out.println("Enter circuit radius:");
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(new Point(centerCoordinateX, centerCoordinateY), radius);
        System.out.println("All entered points:");
        for (int i = 0; i < pointList.size(); i++)
                System.out.println(pointList.getPoint(i));
        System.out.println();
        System.out.println("All included in circle points:");
        for (int i = 0; i < pointList.size(); i++)
            if (circle.containsPoint(pointList.getPoint(i)))
            System.out.println(pointList.getPoint(i));
    }
}
