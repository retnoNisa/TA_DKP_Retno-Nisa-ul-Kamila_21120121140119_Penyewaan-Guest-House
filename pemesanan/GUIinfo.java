package com.pemesanan;

import javax.swing.*;
import java.awt.event.*;

public class GUIinfo extends javax.swing.JFrame{
    private JLabel buttonAnakPanel1;
    private JPanel mainPanel;
    private JTabbedPane tabbedPane1;
    private JButton buttonStandard;
    private JButton buttonDouble;
    private JButton buttonFamily;
    private JTextArea textHasil;
    private JTextArea textContact;
    private JTextPane textAdd1;
    private JTextPane textAdd2;
    private JButton buttonKembali;
    private JPanel roomPanel;
    private JLabel jenisKamarYangTersediaLabel;
    private JPanel additionPanel;
    private JLabel LabelFasTamb;
    private JLabel labelFasMain;
    private JPanel contactPanel;
    private JLabel judulKontak;

    public GUIinfo() {

        add(mainPanel);
        setSize(950, 700);
        setTitle("Waikiki Guest House");


        buttonStandard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textHasil.setText("Fasilitas yang akan Anda dapatkan dari standard room yaitu: " +
                        "\n- 1 single bed"+
                        "\n- Lemari kecil" +
                        "\n- AC" +
                        "\n- Kamar mandi luar" +
                        "\n- 1 bantal" +
                        "\n- Wifi bersama");

            }
        });
        buttonDouble.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textHasil.setText("Fasilitas yang Anda dapatkan dari double room yaitu: " +
                        "\n- 2 single bed dan 1 kasur lantai"+
                        "\n- Lemari sedang" +
                        "\n- AC" +
                        "\n- Kamar mandi dalam" +
                        "\n- 2 bantal" +
                        "\n- Wifi bersama");
            }
        });
        buttonFamily.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textHasil.setText("Fasilitas yang akan Anda dapatkan dari family room yaitu:" +
                        "\n- 1 kasur king size dan 1 single bed"+
                        "\n- Lemari besar" +
                        "\n- AC" +
                        "\n- Kamar mandi dalam" +
                        "\n- 4 bantal" +
                        "\n- Wifi bersama");
            }
        });


        tabbedPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                textContact.setText("WA: +6289756633877" + "\nLine: waikikiguesthouse" + "\nInstagram: @waikiki_guesthouse" +
                        "\nemail: waikikiguesthouse11@gmail.com");
            }
        });

        tabbedPane1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
                textAdd1.setText("- Bantal (50000)" + "\n- Guling (70000)" + "\n- Makan Malam (100000)" +
                        "\n- Sarapan (100000)" + "\n- Termos Elektrik (40000)" + "\n- Selimut (25000)");
                textAdd2.setText("- Tenis Mejas (50000) " + "\n- Uno Stacko (10000)" + "\n- Billiard (100000)" +
                        "\n- Catur (20000)" + "\n- Monopoli(15000)" + "\n- Ludo (10000)" + "\n- Puzzle (10000)");
            }
        });
        buttonKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new GUIinfo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);

    }



}
