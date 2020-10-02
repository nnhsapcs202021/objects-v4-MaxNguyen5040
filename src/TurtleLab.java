import java.awt.Color;

public class TurtleLab
{

    public static void main(String[] args)
    {
        World Earth = new World();
        Turtle bob = new Turtle(Earth);
        Turtle rob = new Turtle(Earth);
        bob.setBodyColor(Color.orange);
        bob.turn(10);
        triangleMaker(1, bob,300,20,5, Color.orange);
        triangleMaker(1, rob,300,20,5,Color.blue);

    }

    public static int triangleMaker(int side_length, Turtle turtle_name, int end_side_length,int degrees_turned,int increaser, Color color){
        if(side_length >= end_side_length) {
            return 1;
        }
        else {
            turtle_name.setPenColor(color);
            for (int i = 0; i < 3; i++) {
                turtle_name.forward(side_length);
                turtle_name.turn(120); } //positive for right, negative for left
            turtle_name.turn(degrees_turned);
            return triangleMaker(side_length + increaser,turtle_name,end_side_length,degrees_turned, increaser,color);

        }

    }


}
