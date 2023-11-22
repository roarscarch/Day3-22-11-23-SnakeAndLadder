public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int start_position = 0;
        int current_position=0;
        System.out.println("Start Position is: " + start_position);
        int roll = (int) Math.floor(Math.random() * 6) + 1;
        System.out.println("Random Dice Number is: " + roll);

        int box = (int) Math.floor(Math.random() * 3) + 1;
        // box === 3 no play
        // box==1 (play till roll)
        // box==2 (snake go backwards)

        if (box == 1) {
            current_position = current_position+ roll;
            System.out.println("Go Ahead " + roll + " steps");
        } else if (box == 2) {
            current_position = current_position- roll;
            System.out.println("Snake go backwards " + roll + " steps");
        } else {
             current_position = current_position+0;
            System.out.println("No Play");
        }

        System.out.println("Current Position is: " + current_position);
    }
}
