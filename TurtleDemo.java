import java.awt.Color;

public class TurtleDemo
{
    public static void main(String[] args)
    {
        //hi
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);
    }
}
