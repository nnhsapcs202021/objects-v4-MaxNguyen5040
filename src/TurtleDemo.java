import java.awt.Color;

public class TurtleDemo{

    public static void main(String[] args) {
        //GOT IT WORKING!!!!!
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        crush.setPenColor(Color.ORANGE);
        crush.penDown();
        crush.forward(50);

    }
    public static void drawline(){
        /*
        Have attributes

         */
        World ocean = new World();
        Turtle crush = new Turtle(ocean);
        int width = 20;
        

    }
}
