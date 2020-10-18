// not compulsory for different directories
package buttons;

// importing libraries
import javax.swing.*;
import java.awt.*;


// using inheritance for better performance and use
public class Checkers extends JFrame {

    // constructors calling constructors
    private Checkers(){}  // calling default one
    private Checkers(String s){ super(s); }   // for name of the board

    // buttons positions and colors
    public void setComponents(){
        // using JButton
        JButton b[] = new JButton[8 * 9];

        // iterating for buttons positions
        for(int i=0; i<(8*9); i++){

            // for filling colors in button or in board
            if(i % 2 == 0){
                // mention the directory of blue circle
                Icon icon = new ImageIcon("bluecoin.png");
                b[i] = new JButton(icon);
                add(b[i]);
                b[i].setBackground(Color.BLACK);
                b[i].setOpaque(true);
                b[i].setBorderPainted(false);
            }
            else{
                // mention the directory of brown circle
                Icon icon = new ImageIcon("browncoin.png");
                b[i] = new JButton(icon);
                add(b[i]);
                // you can use different color
                 b[i].setBackground(Color.WHITE);
                b[i].setOpaque(true);
                b[i].setBorderPainted(false);
            }
        }
    }

    // program starts from here
    public static void main(String[] args){
        Checkers board = new Checkers("Checker");    // creating objects of JFrame
        board.setLayout(new GridLayout(8, 9));   // using Layout
        board.setSize(450, 400);

        // for icon mention a perfect path in parameter of 'ImageIcon'
        ImageIcon icon = new ImageIcon("/Users/pan/desktop/bluecoin.png");
        board.setIconImage(icon.getImage());

        // some compulsory needs
        board.setVisible(true);
        board.setComponents();
        board.setDefaultCloseOperation(Checkers.EXIT_ON_CLOSE);
    }
}
