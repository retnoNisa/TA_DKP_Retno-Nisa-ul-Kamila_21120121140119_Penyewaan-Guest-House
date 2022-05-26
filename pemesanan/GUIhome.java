package com.pemesanan;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIhome {
    private JButton buttonPesanKmr;
    private JButton buttonInfo;
    private JLabel textGreeting;
    private JPanel panel;
    private JLabel texGreeting1;

    public GUIhome() {


        buttonPesanKmr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent awt) {
                GUIpesan guiPesan = new GUIpesan();         //untuk menampilkan form lain
                guiPesan.setVisible(true);                  //sepasang diatas

            }
        });
        buttonInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                       //untuk menampilkan form lain
                GUIinfo GI = new GUIinfo();
                GI.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Waikiki Guest House");
        frame.setContentPane(new GUIhome().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 300);
        frame.setResizable(true);

    }


}
