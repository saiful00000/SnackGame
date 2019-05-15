package MainPackage;

import javax.swing.*;

public class MainClass {

    public MainClass() {
        JFrame frame = new JFrame();
        GamePanel gamePanel = new GamePanel();

        frame.add(gamePanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Snacke Game");
        frame.setLocationRelativeTo(null);

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new MainClass();
    }
}
