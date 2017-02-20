public class Board {
    public static void main(String[] args){
    
    // We make the animals
    Animals snake = new Animals();
    Animals rabbit = new Animals();

    
    // We place the animals in a 10x10
    rabbit.setLocation(3,5);
    snake.setLocation(8,4);

    // Yo, where you at?!
    System.out.println("Snake is at " + snake.getLocation());
    System.out.println("Rabbit is at " + rabbit.getLocation());

    // The animals move on the board (10x10)
    snake.move(1,0);
    rabbit.move(0,1);
    System.out.println("Snake is at " + snake.getLocation());
    System.out.println("Rabbit is at " + rabbit.getLocation());

    
     }
}