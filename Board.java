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
    String victor = "";
    int turns = 0;
    while (true){
        snake.move();
        rabbit.move();
        turns++;
        // // If snake and rabbit are adjecent, print a relevant dialog!
        // if (snake.getLocation("x") == rabbit.getLocation("x") -1 ||
        //     snake.getLocation("x") == rabbit.getLocation("x") +1 ||
        //     snake.getLocation("y") == rabbit.getLocation("y") -1 ||
        //     snake.getLocation("y") == rabbit.getLocation("y") +1 ){
        //     System.out.println("Wha' you frontin'?!");
        // } else{
        //     System.out.println("Yo, where you at?");
        // }

        // // If on the same coordinate, fight! and declare a victor!
        if (snake.getLocation("x") == rabbit.getLocation("x") &&
            snake.getLocation("y") == rabbit.getLocation("y") ){
                if(gp.getRandom(2) == 1){  // if X
                    victor = "rabbit";
                } else {
                    victor = "snake";
                }
            System.out.println("Game over!");
            System.out.println("The " + victor + " won!");
            break;
        }
        // Stops the game if it has been over a 1000 turns
        if (turns >= 1000){
            System.out.println("The game is a tie");
            break;
        }
    }
    System.out.println("The game took " + turns + " turns");
    }
}