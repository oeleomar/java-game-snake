package br.com.eleomardorneles.java.games.snake;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
  GameFrame() {
    this.add(new GamePanel());
    this.setTitle("Snake");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    // Appear in the middel off screen
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
