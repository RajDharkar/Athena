import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
public class GameGUI {
    Piece[] board;

    public GameGUI(Piece[] board){
        this.board = board;
    }
    
    public void runGUI(){
        JFrame frame = new JFrame();
        frame.setLayout(new GridBagLayout());
        frame.getContentPane().setBackground(new Color(31, 31, 31));
        frame.setMinimumSize(new Dimension(1000, 1000));
        frame.setLocationRelativeTo(null);

       

        Board bd = new Board(board);
        frame.add(bd);
        frame.setVisible(true);
    }
    // public static void main(String[] args) {
    //     runGUI(null);
    // }
}