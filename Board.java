public class Board {
    public static void main(String[] args){
    
    // We make the animals
    GamePiece snake = new GamePiece();
    GamePiece rabbit = new GamePiece();
    
    // We place the animals in a 10x10
    rabbit.setLocation(5,6);
    snake.setLocation(5,2);
    // // Let the game begin! :P
    // boolean gameOver = false;
    // while (!gameOver){
    //     fight testtest = new fight();


    //     if (testtest = true){
    //         break;
    //     }
    // }


    // snake.move(0,1);
    // rabbit.move(0,-2);
    // dialog(snake, rabbit);
    // rabbit.move(0,-1);
    

    System.out.println(snake.getLocation("x") + ", " + snake.getLocation("y"));
    System.out.println(rabbit.getLocation("x") + ", " + rabbit.getLocation("y"));

    
     }
    
        
   
}