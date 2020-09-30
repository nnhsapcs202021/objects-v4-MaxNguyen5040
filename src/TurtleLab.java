import java.awt.Color;
import java.lang.reflect.Array;

public class TurtleLab
{
    static Color[] colors = {Color.red,Color.pink,Color.orange,Color.yellow,Color.green,Color.cyan,Color.blue,Color.magenta};


    public static void main(String[] args)
    {
        World Earth = new World();
        Turtle bob = new Turtle(Earth);
        //Turtle rob = new Turtle(Earth);
        triangleMaker(1, bob,400,3,5, 0);
        //triangleMaker(1, rob,400,-3,5);

    }

    public static int triangleMaker(int side_length, Turtle turtle_name, int end_side_length,int degrees_turned,int increaser, int color_value){
        if(side_length >= end_side_length) {
            return 1;
        }

        else {
            if(color_value > 7){
                color_value = 0; }
            turtle_name.setPenColor(colors[color_value]);
            for (int i = 0; i < 3; i++) {
                turtle_name.forward(side_length);
                turtle_name.turn(120); }
            turtle_name.turn(degrees_turned);
            return triangleMaker(side_length + increaser,turtle_name,end_side_length,degrees_turned, increaser,color_value+1);

        }

    }


}
