public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game");
        int start_position = 0;
        int current_position=0;
        System.out.println("Start Position is: " + start_position);
     
        
        // box === 3 no play
        // box==1 (play till roll)
        // box==2 (snake go backwards)
        int count=0;
        while(current_position<100){
            int roll = (int) Math.floor(Math.random() * 6) + 1;
            int box = (int) Math.floor(Math.random() * 3) + 1;

        if (box == 1) {
            current_position = current_position+ roll;

           // System.out.println("Go Ahead " + roll + " steps");
        } else if (box == 2) {

            current_position = current_position- roll;

            if(current_position < 0){
                current_position = 0;
            }
            //System.out.println("Snake go backwards " + roll + " steps");
        } else {

             current_position = current_position+0;
            //System.out.println("No Play");
        }
        if(current_position >100) {
            current_position -=roll;

        }
        count++;
    }

        System.out.println("Player Wins Finally ,his position currently is " + current_position+" and after " + count + " rolls");
    }
}
