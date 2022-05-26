package com.pemesanan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIpesan extends JFrame {
    private JTextField boxNama;
    private JTextField boxTanggal;
    private JButton buttonLanjut;
    private JButton buttonKembali;
    private JLabel nama;
    private JTextField boxLama;
    private JComboBox plhKamar;
    private JLabel lama;
    private JLabel tanggal;
    private JPanel panel1;
    private JTextField boxTotal;
    private JComboBox boxTambah;
    private JLabel fasTambah;
    private JLabel bayar;
    private JTextField boxBayar;
    private JButton buttonTotal;
    private JTextField hargaKamar;
    private JTextField hargaFasilitas;
    private JButton buttonBayar;
    private JTextField boxKembalian;
    private JTextArea textHasil;
    private JButton buttonPesan;
    private JTextField jmlTambah;
    private JLabel noTelp;
    private JTextField boxNoTelp;
    private JButton buttonHapus;
    private JComboBox boxFasBermain;
    private JLabel fasBermain;
    private JTextField hargaFasBermain;
    private JLabel jenisKamar;

    int harga, hargaTambah, Harga, HargaTambah, HargaLama, totalHarga, a, b, c, hargaMain, HargaMain;
    String pilih, tambah, tambahMain;

    public GUIpesan() {

        add(panel1);                                       //harus ada untuk ditambilkan diatas form lain
        setSize(700,750);
        setTitle("Waikiki Guest House");

        buttonKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                  //untuk menutup jendela ini saja
            }
        });
        plhKamar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pilih = (String) plhKamar.getSelectedItem();
                switch (pilih){
                    case "Standard Room":
                        harga = 100000;
                        break;
                    case "Double Room":
                        harga = 200000;
                        break;
                    case "Family Room":
                        harga = 300000;
                        break;
                    default:
                        harga = 0;
                        break;
                }
                hargaKamar.setText("" +Integer.toString(harga));
            }
        });
        boxTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambah = (String) boxTambah.getSelectedItem();
                switch (tambah){
                    case "Bantal":
                        hargaTambah = 50000;
                        break;
                    case "Guling":
                        hargaTambah = 70000;
                        break;
                    case "Makan Malam":
                        hargaTambah = 100000;
                        break;
                    case "Sarapan":
                        hargaTambah = 100000;
                        break;
                    case "Termos Elektrik":
                        hargaTambah = 40000;
                        break;
                    case "Selimut":
                        hargaTambah = 25000;
                        break;
                    default:
                        hargaTambah = 0;
                        break;
                }
                hargaFasilitas.setText(""+Integer.toString(hargaTambah));
            }
        });

        buttonTotal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Harga = Integer.parseInt(hargaKamar.getText());
                HargaTambah = Integer.parseInt(hargaFasilitas.getText());
                HargaMain = Integer.parseInt(hargaFasBermain.getText());
                HargaLama = Integer.parseInt(boxLama.getText());
                totalHarga = ((Harga+HargaTambah+HargaMain)*HargaLama);
                boxTotal.setText(""+totalHarga);
            }
        });
        buttonLanjut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(boxNama.getText().isEmpty() || boxNoTelp.getText().isEmpty() || boxTanggal.getText().isEmpty()
                        || plhKamar.getSelectedItem().equals("") || boxLama.getText().isEmpty() || boxTotal.getText().isEmpty()
                        || boxBayar.getText().isEmpty() || boxKembalian.getText().isEmpty()){
                    JOptionPane.showMessageDialog(panel1, "Data Anda Belum Lengkap!!!");
                }else{
                    GUIprogressBar pb = new GUIprogressBar();
                    pb.setVisible(true);
                    dispose();
                }



            }
        });
        buttonBayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Integer.parseInt(boxTotal.getText());
                b = Integer.parseInt(boxBayar.getText());
                if (b<a){
                    JOptionPane.showMessageDialog(panel1, "MAAF, UANG ANDA KURANG!!!");
                }else {
                    c = b-a;
                    boxKembalian.setText(""+c);
                }


            }
        });
        buttonPesan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textHasil.setText("Anda akan memesan dengan rincian sebagai berikut: "+ "\n" +
                        "Nama: "+ boxNama.getText() + "\n" +
                        "Jenis Kamar: " + plhKamar.getSelectedItem() + "\n" +
                        "Fasilitas Tambahan: " + boxTambah.getSelectedItem() + "\n" +
                        "Fasilitas Bermain: " + boxFasBermain.getSelectedItem() + "\n" +
                        "Lama Menginap: " + boxLama.getText() + "\n" +
                        "Tanggal: " + boxTanggal.getText() + "\n" +
                        "Total Harga: " + boxTotal.getText() + "\n" +
                        "Lanjutkan pemesanan jika Anda yakin data diatas telah sesuai!!");


            }
        });
        buttonHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boxNama.setText("");
                boxNoTelp.setText("");
                boxLama.setText("");
                boxTanggal.setText("");
                boxTotal.setText("");
                boxBayar.setText("");
                boxKembalian.setText("");
                hargaKamar.setText("");
                hargaFasilitas.setText("");
                jmlTambah.setText("");
                textHasil.setText(null);
            }
        });
        boxFasBermain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahMain = (String) boxFasBermain.getSelectedItem();
                switch (tambahMain){
                    case "Tenis Meja":
                        hargaMain = 50000;
                        break;
                    case "Uno Stacko":
                        hargaMain = 10000;
                        break;
                    case "Billiard":
                        hargaMain = 100000;
                        break;
                    case "Catur":
                        hargaMain = 20000;
                        break;
                    case "Monopoli":
                        hargaMain = 15000;
                        break;
                    case "Ludo":
                        hargaMain = 10000;
                        break;
                    case "Puzzle":
                        hargaMain = 10000;
                        break;
                    default:
                        hargaMain = 0;
                        break;
                }
                hargaFasBermain.setText(""+Integer.toString(hargaMain));
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new GUIpesan().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(true);
    }
}
