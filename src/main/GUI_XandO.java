package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GUI_XandO implements ActionListener{

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel button_panel = new JPanel();
    JButton[] buttons = new JButton[9];
    JButton restartButton = new JButton("Restart");
    boolean player1_turn;


    GUI_XandO(){

        restartButton.setFont(new Font("Ink free", Font.BOLD, 30));
        restartButton.addActionListener(e -> restartGame());



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,150));

        for (int i=0; i<9; i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("mv Boli",Font.BOLD,100));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);

        }


        frame.add(button_panel);

        frame.add(restartButton, BorderLayout.SOUTH);

        firstturn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i<9; i++){
            if (e.getSource()==buttons[i]){
                if(player1_turn){
                    if (buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(230,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;

                        checkWin();

                    }
                }
                else {
                    if (buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("O");
                        player1_turn=true;
                        checkWin();

                    }
                }

            }
        }

    }


    public void firstturn(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (random.nextInt(2)==0){
            player1_turn=true;

        }
        else{
            player1_turn=false;

        }

    }


    private void restartGame() {

        for (JButton button : buttons) {
            button.setText("");
            button.setBackground(null);
            button.setEnabled(true);
        }
        player1_turn = true;
    }


    public void checkWin(){

        if (
                (buttons[0].getText()=="X")&&
                        (buttons[1].getText()=="X")&&
                        (buttons[2].getText()=="X")
        ){
            xWins(0,1,2);
        }
        if (
                (buttons[3].getText()=="X")&&
                        (buttons[4].getText()=="X")&&
                        (buttons[5].getText()=="X")
        ){
            xWins(3,4,5);
        }
        if (
                (buttons[6].getText()=="X")&&
                        (buttons[7].getText()=="X")&&
                        (buttons[8].getText()=="X")
        ){
            xWins(6,7,8);
        }
        if (
                (buttons[0].getText()=="X")&&
                        (buttons[3].getText()=="X")&&
                        (buttons[6].getText()=="X")
        ){
            xWins(0,3,6);
        }
        if (
                (buttons[1].getText()=="X")&&
                        (buttons[4].getText()=="X")&&
                        (buttons[7].getText()=="X")
        ){
            xWins(1,4,7);
        }
        if (
                (buttons[2].getText()=="X")&&
                        (buttons[5].getText()=="X")&&
                        (buttons[8].getText()=="X")
        ){
            xWins(2,5,8);
        }
        if (
                (buttons[0].getText()=="X")&&
                        (buttons[4].getText()=="X")&&
                        (buttons[8].getText()=="X")
        ){
            xWins(0,4,8);
        }
        if (
                (buttons[2].getText()=="X")&&
                        (buttons[4].getText()=="X")&&
                        (buttons[6].getText()=="X")
        ){
            xWins(2,4,6);
        }

        if (
                (buttons[0].getText()=="O")&&
                        (buttons[1].getText()=="O")&&
                        (buttons[2].getText()=="O")
        ){
            oWins(0,1,2);
        }
        if (
                (buttons[3].getText()=="O")&&
                        (buttons[4].getText()=="O")&&
                        (buttons[5].getText()=="O")
        ){
            oWins(3,4,5);
        }
        if (
                (buttons[6].getText()=="O")&&
                        (buttons[7].getText()=="O")&&
                        (buttons[8].getText()=="O")
        ){
            oWins(6,7,8);
        }
        if (
                (buttons[0].getText()=="O")&&
                        (buttons[3].getText()=="O")&&
                        (buttons[6].getText()=="O")
        ){
            oWins(0,3,6);
        }
        if (
                (buttons[1].getText()=="O")&&
                        (buttons[4].getText()=="O")&&
                        (buttons[7].getText()=="0")
        ){
            oWins(1,4,7);
        }
        if (
                (buttons[2].getText()=="0")&&
                        (buttons[5].getText()=="0")&&
                        (buttons[8].getText()=="0")
        ){
            oWins(2,5,8);
        }
        if (
                (buttons[0].getText()=="0")&&
                        (buttons[4].getText()=="0")&&
                        (buttons[8].getText()=="0")
        ){
            oWins(0,4,8);
        }
        if (
                (buttons[2].getText()=="O")&&
                        (buttons[4].getText()=="O")&&
                        (buttons[6].getText()=="O")
        ){
            oWins(2,4,6);
        }

    }
    public void xWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i<9; i++){
            buttons[i].setEnabled(false);
        }

    }
    public void oWins(int a, int b, int c) {
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i<9; i++){
            buttons[i].setEnabled(false);
        }




    }
}

