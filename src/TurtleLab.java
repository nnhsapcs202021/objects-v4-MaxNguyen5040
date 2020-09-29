import java.awt.Color;

public class TurtleLab
{
    public static void main(String[] args)
    {
        World Earth = new World();
        Turtle bob = new Turtle(Earth);
        Turtle rob = new Turtle(Earth);
        bob.forward(20);
        rob.backward(20);

    }
}
