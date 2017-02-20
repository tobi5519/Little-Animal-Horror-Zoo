public class Board {
    public static void main(String[] args){
    
    // We make the animals
    Animals snake = new Animals();
    Animals rabbit = new Animals();
    
    // We place the animals in a 10x10
    rabbit.setLocation(3,3);
    snake.setLocation(3,3);

    // Yo, where you at?!
    // System.out.println("Snake is at " + snake.getLocation());
    // System.out.println("Rabbit is at " + rabbit.getLocation());


    fight(snake, rabbit);
     }
    public static void fight(Animals snake, Animals rabbit){
        if (snake.getLocation("x") == (rabbit.getLocation("x")) &&
            snake.getLocation("y") == (rabbit.getLocation("y")) ){
            System.out.println("Game over!");
        } 

    System.out.println(snake.getLocation("x") + ", " + snake.getLocation("y"));
    }
}