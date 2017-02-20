public class Board {
    public static void main(String[] args){
    
    // We make the animals
    Animals snake = new Animals();
    Animals rabbit = new Animals();
    
    // We place the animals in a 10x10
    rabbit.setLocation();
    snake.setLocation();

    // Yo, where you at?!
    System.out.println("Snake is at " + snake.getLocation());
    System.out.println("Rabbit is at " + rabbit.getLocation());

    // The animals move on the board (10x10)
    snake.move();
    rabbit.move();
    System.out.println("Snake is at " + snake.getLocation());
    System.out.println("Rabbit is at " + rabbit.getLocation());
     }
}