
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;

public class SudokuSheet extends JFrame {
    SudokuSheet(){}
    SudokuSheet(String s){ super(s);}


    public static Border createLineBorder(Color color) {
        return new LineBorder(color, 3);
    }


    public static void main(String[] args){

        Border blackline = createLineBorder(Color.black);
        Border bl2 = BorderFactory.createLineBorder(Color.BLACK);


        SudokuSheet sudoku = new SudokuSheet("Sudoku");
        sudoku.setSize(700, 450);
        sudoku.setLayout(new GridLayout(1, 0));


        JPanel board = new JPanel();
        board.setLayout(new GridLayout(3, 3));
        board.setSize(450, 450);
        board.setBorder(bl2);
        sudoku.add(board);

        JPanel bs = new JPanel();
        bs.setLayout(new GridLayout(0, 1));
        bs.setSize(50, 50);
        sudoku.add(bs);


        JPanel sheet[][] = new JPanel[3][3];
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                sheet[a][b] = new JPanel();
                sheet[a][b].setLayout(new GridLayout(3, 3));
                sheet[a][b].setSize(150, 150);
                sheet[a][b].setBorder(blackline);
                board.add(sheet[a][b]);
                JTextField t[][] = new JTextField[3][3];
                for(int i=0;i<3;i++)
                {
                    for(int j=0;j<3;j++){
                        t[i][j] = new JTextField();
                        t[i][j].setBackground(Color.WHITE);
                        t[i][j].setSize(40, 40);
                        sheet[a][b].add(t[i][j]);
                    }
                }
            }
        }


        JButton b[] = new JButton[4];
        String s[] = {"Reset", "Solve", "Hint", "New Puzzle"};
        for(int i=0;i<4;i++){
            b[i] = new JButton(s[i]);
            b[i].setBackground(Color.BLUE);
            bs.add(b[i]);
        }
        JLabel p = new JLabel("Name: Andrea Rose");
        bs.add(p, BorderLayout.CENTER);



        sudoku.setVisible(true);
        sudoku.setDefaultCloseOperation(SudokuSheet.EXIT_ON_CLOSE);
    }
}
