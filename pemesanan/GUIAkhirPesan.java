package com.pemesanan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIAkhirPesan extends JFrame {
    private JTextPane textHasil1;
    private JPanel panel2;
    public  JButton buttonSelesai;
    private JLabel text1;
    private JLabel text2;
    private JLabel text3;
    private JLabel text4;


    public GUIAkhirPesan() {

        add(panel2);
        setSize(600, 300);
        setTitle("Waikiki Guest House");

        buttonSelesai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new GUIAkhirPesan().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);


    }



}
