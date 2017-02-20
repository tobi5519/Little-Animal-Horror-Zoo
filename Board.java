public class Board {
    public static void main(String[] args){
    
    // We make the animals
    Animals snake = new Animals();
    Animals rabbit = new Animals();
    
    // We place the animals in a 10x10
    rabbit.setLocation(5,6);
    snake.setLocation(5,2);
    snake.move(0,1);
    rabbit.move(0,-2);
    dialog(snake, rabbit);
    rabbit.move(0,-1);
    
  
    // Yo, where you at?!
    // System.out.println("Snake is at " + snake.getLocation());
    // System.out.println("Rabbit is at " + rabbit.getLocation());

    System.out.println(snake.getLocation("x") + ", " + snake.getLocation("y"));
    System.out.println(rabbit.getLocation("x") + ", " + rabbit.getLocation("y"));

    fight(snake, rabbit);
     }
    public static void fight(Animals snake, Animals rabbit){
        if (snake.getLocation("x") == rabbit.getLocation("x") &&
            snake.getLocation("y") == rabbit.getLocation("y") ){
            System.out.println("Game over!");
        } 

   
    }
    public static void dialog(Animals snake, Animals rabbit){

        if (snake.getLocation("x") == rabbit.getLocation("x") -1 ||
            snake.getLocation("x") == rabbit.getLocation("x") +1 ||
            snake.getLocation("y") == rabbit.getLocation("y") -1 ||
            snake.getLocation("y") == rabbit.getLocation("y") +1 ){
            System.out.println("hej med dig");
        } else{
            System.out.println("mums");
        }
    }
}