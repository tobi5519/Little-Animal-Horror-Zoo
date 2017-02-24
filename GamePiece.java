import java.util.Random;
public class GamePiece {
    
    // Attributes
    private  String name; // Bliver ikke brugt?
    private int x = 0;
    private int y = 0;

    // 'Anyone who considers arithmetical methods of producing random digits is, of course, in a state of sin.' – John von Neumann
    // PRNG
    public int getPRNG(int i){
        Random rand = new Random();
        return rand.nextInt(i) + 1;
    }
    // // TRNG
    // public int getTRNG(int i){
    //   SecureRandom rand = new SecureRandom();
    //   byte bytes[] = new byte[i];
    //   return rand.nextBytes(bytes);
    // }

    // Change value of x or y
    public void move(){
        if(getPRNG(2) == 1){            // if X
            if(this.x == 10){           // if 10
                this.x--;
            } else if (this.x == 1) {
                this.x++;
            } else {
                if (getPRNG(2) == 1){
                    this.x++;
                } else {
                    this.x--;
                }
            }                 
        } else {                        // When y
            if(this.y == 10){           // if 10
                this.y--;
            } else if (this.y == 1) {
                this.y++;
            } else {
                if (getPRNG(2) == 1){
                    this.y++;
                } else {
                    this.y--;
                }
            }
        }
    }

    // Set the starting location of either animal
    public void setLocation(){
        this.x = getPRNG(10);
        this.y = getPRNG(10);
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
    //  public void dialog(GamePiece snake, GamePiece rabbit){
    //     if (snake.getLocation("x") == rabbit.getLocation("x") -1 ||
    //         snake.getLocation("x") == rabbit.getLocation("x") +1 ||
    //         snake.getLocation("y") == rabbit.getLocation("y") -1 ||
    //         snake.getLocation("y") == rabbit.getLocation("y") +1 ){
    //         System.out.println("Wha' you frontin'?!");
    //     } else{
    //         System.out.println("Yo, where you at?");
    //     }
    // }
}