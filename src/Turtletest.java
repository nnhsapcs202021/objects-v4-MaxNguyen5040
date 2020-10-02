public class Turtletest {
    public static void main(String[] args){
        World earth = new World();
        Turtle crush = new Turtle(earth);
        crush.turn(30);
        crush.forward(80);
        crush.turn(60);
        crush.forward(80);
        crush.turn(60);
        crush.forward(80);
    }
}
