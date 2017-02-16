import java.util.Random;
public class Animals {
    private  String name;
    private int x = 0;
    private int y = 0;

    public void move(){
    // Randomize increments of x or y value
    }
    public void setLocation(){
    // Randomize x & y values between 1 og 10
    Random rand = new Random();
    this.x = rand.nextInt(10) + 1;
    this.y = rand.nextInt(10) + 1;

    }
    public String getLocation(){
        return x + " " + y;
    }

    public void printLocation(){
        System.out.println("I am location " + x + " " + y);
    }

}