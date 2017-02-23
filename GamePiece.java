import java.util.Random;
public class GamePiece {
    // Attributes
    // Overvej at lave en constructor til dette!
    private  String name; // hvad bruger vi name til?
    private int x = 0;
    private int y = 0;

    // RNG
    public int getRandom(int i){
        Random rand = new Random();
        return rand.nextInt(i) + 1;
    }
    public void printRandom(){
        System.out.println(getRandom(10));
    }
    // // Change value of x or y for either animal
    // public int move(){
    //     if(getRandom(2)=1){
    //         this.x += 1;
    //     } else {
    //         this.y += 1;
    //     }
    // }
    // Set the starting location of either animal
    public void setLocation(){
        this.x = getRandom(10);
        this.y = getRandom(10);
    }
    
    // Return the current location of either animal
    public int getLocation(String z){
        if (z.equals("x")){
            return x;
        } else {
            return y;
        }
    }
    // Prints a dialog if the animals location is adjecent
     public void dialog(GamePiece snake, GamePiece rabbit){
        if (snake.getLocation("x") == rabbit.getLocation("x") -1 ||
            snake.getLocation("x") == rabbit.getLocation("x") +1 ||
            snake.getLocation("y") == rabbit.getLocation("y") -1 ||
            snake.getLocation("y") == rabbit.getLocation("y") +1 ){
        } else{
            System.out.println("Yo, where you at?");
        }
    }
    // Prints game over and returns a value to end game
    public boolean fight(GamePiece snake, GamePiece rabbit){
        if (snake.getLocation("x") == rabbit.getLocation("x") &&
            snake.getLocation("y") == rabbit.getLocation("y") ){
            System.out.println("Game over!");
            return true;
        }
        return false;
    }
}