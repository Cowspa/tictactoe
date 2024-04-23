import java.util.ArrayList;
import java.util.*;

class Project{
    public static void main(String[] args) {
        Game game = new Game(0, 0);
        System.out.println("--------------------------------------------");
        System.out.println("            Welcome to TicTacToe            ");
        System.out.println("--------------------------------------------");
        System.out.println("How many players is playing?");
        System.out.println("1. 1 Player"); //Against AI
        System.out.println("2. 2 Players");
        System.out.print("Enter your choice: ");
        int choice = In.nextInt();
        if (choice == 1){
            game.gameGrid();
        }else if (choice == 2){
            game.gameGrid();
        }else {
            System.out.println("INVALID OUTPUT!!!!");
        }
    }
}

class Game{
    private int x;
    private int y;
    int[] grid = new int[8];
    Game(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX(){
        return this.x;
    }
    int getY(){
        return this.y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    void playerInput(){
        
    }
    void gameOutput(){

    }
    void gameGrid(){
        System.out.println("      |       |       ");   //first square is 0, second square is 1, third square is 2
        System.out.println("      |       |       ");   //fourth square is 3, fifth square is 4, sixth square is 5
        System.out.println("----------------------");   //seventh square is 6, eighth square is 7, ninth square is 8
        System.out.println("      |       |       ");   
        System.out.println("      |       |       ");
        System.out.println("----------------------");
        System.out.println("      |       |       ");
        System.out.println("      |       |       ");
    }

}

class Player extends Game{
    Player(int x, int y){
        super(x,y);
    }
}

class TicTacToe{
    ArrayList<Player> newPlayers;
    TicTacToe(int newPlayers){
        this.newPlayers = new ArrayList<>();
        for (int i = 0; i < newPlayers; i++) {
            // this.newPlayers.add(new Player());
        }
    }
}

class In {
    private static Scanner in = new Scanner(System.in);

    public static String nextLine() {
        return in.nextLine();
    }

    public static char nextChar() {
        return in.nextLine().charAt(0);
    }

    public static char nextUpperChar() {
        return in.nextLine().toUpperCase().charAt(0);
    }

    public static int nextInt() {
        int i = in.nextInt();
        in.nextLine();
        return i;
    }

    public static double nextDouble() {
        double d = in.nextDouble();
        in.nextLine();
        return d;
    }
}