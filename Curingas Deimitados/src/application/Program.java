package application;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<Shape>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Rectangle(2.0, 4.0));

        List<Circle> myCircle = new ArrayList<>();
        myCircle.add(new Circle(3.0));
        myCircle.add(new Circle(4.0));

        System.out.println("Total Sum: " + totalAreaList(myShapes));

    }

    //Para que eu possa fazer a soma de qualquer tipo de shape
    //Preciso passar como parametro da seguinte forma
    //List<? extends Shape> onde shape funciona como a superclasse e então
    //as "subclasses" como circle e rectangle irão poder ser associadas
    //resumidamente agora as filhas de shape<circle e rectangle> podem fazer as operações
    public static double totalAreaList(List<? extends Shape> myShapes) {
        double sum = 0;
        for(Shape s : myShapes) {
            sum+= s.area();
        }
        return sum;
    }
}
