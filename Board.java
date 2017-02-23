public class Board {
    public static void main(String[] args){
    
    // We make the animals
    GamePiece snake = new GamePiece();
    GamePiece rabbit = new GamePiece();
    // Making a generelt instance
    GamePiece gp = new GamePiece();
    
    // We place the animals in a 10x10
    rabbit.setLocation();
    snake.setLocation();

    // // Let the game begin! :P
    int turns =0;
    int num = 0;
    while (true){
        snake.move();
        rabbit.move();
        turns++;
        if (snake.getLocation("x") == rabbit.getLocation("x") &&
            snake.getLocation("y") == rabbit.getLocation("y") ){
            System.out.println("Game over!");
            break;
        }
        // num++;
    
        // System.out.println("Snake is at:  " + snake.getLocation("x") + ", " + snake.getLocation("y"));
        // System.out.println("Rabbit is at: " + rabbit.getLocation("x") + ", " + rabbit.getLocation("y"));

        // if (num > 10){
        //     System.out.println("Now we are done!");
        //     break;
        // } else {
        //     System.out.println("Not done yet");
        // }
    }
    System.out.println("The game took " + turns + " turns");

    }
}