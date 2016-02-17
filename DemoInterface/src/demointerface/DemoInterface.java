/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demointerface;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author TrungNT
 */
public class DemoInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // hien thi giao dien Giai phuong trinh bac hai
        JFrame frame = new JFrame();
        // Set title
        frame.setTitle("JFrame Demo");
        // Set location
        frame.setLocation(300, 300);
        // Set resizable
        frame.setResizable(false);
        // Add a window listner for close button
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        // Add a JLabel
        JLabel label = new JLabel("A JLabel in JFrame");
        label.setPreferredSize(new Dimension(220, 100));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        // Set visible
        frame.setVisible(true);
        
    }
    
}
