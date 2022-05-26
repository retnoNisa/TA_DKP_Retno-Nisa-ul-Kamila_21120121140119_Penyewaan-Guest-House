package com.pemesanan;

import javax.swing.*;

public class GUIprogressBar extends JFrame implements Runnable{
    private JProgressBar progressBar1;
    private JPanel panelProgressBar;
    private JLabel counter;


    public GUIprogressBar() {


        Thread thread = new Thread(this);
        thread.start();

        add(panelProgressBar);
        setSize(300, 100);
        setTitle("Waikiki Guest House");

    }

    @Override
    public void run() {


        for (int i = 0; i <= 100; i++){
            try {
                Thread.sleep(20);
            }catch (Exception e){
                e.printStackTrace();
            }
            counter.setText(i + "%");
            progressBar1.setValue(i);
        }
        GUIAkhirPesan guiAkhirPesan = new GUIAkhirPesan();
        guiAkhirPesan.setVisible(true);
        dispose();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new GUIprogressBar().panelProgressBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
    }


}
