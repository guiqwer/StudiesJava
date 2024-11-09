package application;

import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Program {
    public static void main(String[] args) {
        AbstractShape shape01 = new Circle(Color.BLACK, 2.0);
        AbstractShape shape02 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Circle color: " + shape01.getColor());
        System.out.println("Circle area: " + String.format("%.3f", shape01.area()));
        System.out.println("Rectangle color: " + shape02.getColor());
        System.out.println("Rectangle area: " + String.format("%.3f", shape02.area()));
    }
}
