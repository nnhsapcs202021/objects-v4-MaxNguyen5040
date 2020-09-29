import java.awt.Color;

public class TurtleLab
{

    public static void main(String[] args)
    {
        World Earth = new World();
        Turtle bob = new Turtle(Earth);
        //Turtle rob = new Turtle(Earth);
        triangleMaker(1, bob,100);

    }

    public static int triangleMaker(int side_length, Turtle turtle_name, int end_side_length){
        if(side_length == end_side_length) {
            return 1;
        }

        else {
            for (int i = 0; i < 3; i++) {
                turtle_name.forward(side_length);
                turtle_name.turn(120); }
            turtle_name.turn(1);
            return triangleMaker(side_length + 1,turtle_name,end_side_length);

        }

    }


}
