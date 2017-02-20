import java.util.Random;
public class Animals {
    private  String name;
    private int x = 0;
    private int y = 0;

    public int getRandom(){
        Random rand = new Random();
        return rand.nextInt(1) + 1;
    }

    public void move(){
    // Randomize increments of x or y value
    Random rand = new Random();
    this.x = this.x + rand.nextInt(1) + 1;
    this.y = this.y + rand.nextInt(1) + 1;
    }
    public void setLocation(){
    // Randomize x & y values between 1 og 10
    Random rand = new Random();
    this.x = rand.nextInt(10) + 1;
    this.y = rand.nextInt(10) + 1;
    }
    public String getLocation(){
        String newX = "";
        String newY = ""; 
        if (x < 10){
            newX = String.format("0%d", x);
        } else {
            newX = "" + x;
        }
        if (y < 10){
            newY = String.format("0%d", y);
        } else {
            newY = "" + y;
        }

        return "" + newX + ", " + newY;

    }

    public void printLocation(){
        System.out.println("I am location " + x + " " + y);
    }

}