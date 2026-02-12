public class Gift implements Runnable {
    String color;
    double positionsX;
    double positionsY;
    public Gift(String color){
        this.color = color;
    }

    public Gift(String color, double positionsX, double positionsY){
        this.color = color;
        this.positionsX = positionsX;
        this.positionsY = positionsY;
    }

    public void run(){
        Turtle bob = new Turtle(this.positionsX,this.positionsY);
        String Cocolor = this.color;
        bob.penColor(Cocolor);
        bob.width(5);
        bob.speed(2);
        for (int i =0; i < 6; i++ ) {
            bob.forward(200);    // move 30 units (pen down = draw a line)
            bob.left(90);
        }
        bob.up();
        bob.forward(175);
        bob.left(90);
        bob.down();
        for (int j =0; j < 6; j++ ) {
            bob.forward(200);
            bob.left(90);
            bob.forward(25);
            bob.left(90);
        }
        bob.right(90);
        bob.forward(25);
        bob.left(90);
        bob.forward(50);
        bob.left(90);
        for (int j =0; j < 6; j++ ) {
            bob.forward(200);
            bob.left(90);
            bob.forward(25);
            bob.left(90);
        }
        bob.forward(50);
        bob.left(90);
        bob.up();
        bob.forward(12.5);
        bob.down();
        for (int i = 0; i < 36; i++) {
            bob.forward(2);
            bob.left(10);
        }
        bob.up();
        bob.down();
        bob.setDirection(0);
        bob.penColor("Red");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                bob.forward(4);
                bob.left(6);
            }
            bob.left(45);
            for (int j = 0; j < 20; j++) {
                bob.forward(4);
                bob.left(6);
            }

        }
        bob.up();
        bob.hide();
    }
}
