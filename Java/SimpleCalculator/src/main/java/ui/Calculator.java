package ui;

import ui.graphics.SwingDemo;

import javax.swing.*;

/**
 * created by ravibhushan.k on 05/12/18
 */
public class Calculator {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SwingDemo();
            }
        });
    }
}
