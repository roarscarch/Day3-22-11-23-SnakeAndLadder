public class SnakeAndLadder {

    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
    
        int current_position1 = 0;
        int current_position2 = 0;
        int count = 0; // Initialize the count variable
        boolean flag = false;

        while (current_position1 < 100 && current_position2 < 100) {
            int roll = (int) Math.floor(Math.random() * 6) + 1;
            int box = (int) Math.floor(Math.random() * 4); 

            if (!flag) {// player 1
                if (box == 1) {// normal
                    current_position1 = current_position1 + roll;
                    if (current_position1 > 100) {
                        current_position1 -= roll;
                    }
                    flag = true;
                } else if (box == 2) {// ladder
                    current_position1 = current_position1 + roll;
                    if (current_position1 > 100) {
                        current_position1 -= roll;
                    }
                    flag = false; // Extra chance for ladder
                } else if (box == 3) {// snake
                    current_position1 = current_position1 - roll;
                    if (current_position1 < 0) {
                        current_position1 = 0;
                    }
                    flag = true;
                } else {// no play
                    flag = true;
                }
            } else {
                if (box == 1) {// normal
                    current_position2 = current_position2 + roll;
                    if (current_position2 > 100) {
                        current_position2 -= roll;
                    }
                    flag = false;
                } else if (box == 2) {// ladder
                    current_position2 = current_position2 + roll;
                    if (current_position2 > 100) {
                        current_position2 -= roll;
                    }
                    flag = true; // Extra chance for ladder
                } else if (box == 3) {// snake
                    current_position2 = current_position2 - roll;
                    if (current_position2 < 0) {
                        current_position2 = 0;
                    }
                    flag = false;
                } else {// no play
                    flag = false;
                }
            }
            count++;

        }

        System.out.println(current_position1 + " " + current_position2);

        if (current_position1 == 100) {
            System.out.println("Player 1 Wins");
        } else {
            System.out.println("Player 2 Wins");
        }
        System.out.println("Number of turns: " + count); // Optional: Print the number of turns
    }
}
