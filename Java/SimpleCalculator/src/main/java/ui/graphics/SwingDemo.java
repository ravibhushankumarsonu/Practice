package ui.graphics;

import javax.swing.*;

/**
 * created by ravibhushan.k on 05/12/18
 */
public class SwingDemo {

    public SwingDemo() {
        JFrame jFrame = new JFrame("A simple Swing Application.");
        jFrame.setSize(275,100);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Swings means powerfull GUI.");
        jFrame.add(jLabel);
        jFrame.setVisible(true);
    }
}
