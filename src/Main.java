import javax.swing.JFrame; //will be used to create window



public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Goose!");

        //determine window size first with w/h
        //dividing into tiles 19x21 and each tile is 32px

        //create tile map
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        //create window
        JFrame frame = new JFrame("Pac Man");//() is for window title
        frame.setSize(boardWidth, boardHeight);
        frame.setVisible(true);//create
        frame.setLocation(null); //sets in middle
        frame.setResizable(false);//stops from reSizing
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//terminates when clicking x









    }
}