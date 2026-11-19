/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.formbiodata;



import javax.swing.*;
import java.awt.*;

public class FormBiodata extends JFrame {

    JTextField txtNama, txtKelas, txtHobi;
    JTextArea txtHasil;
    JButton btTampilkan, btBersihkan;

    public FormBiodata() {

        // Mengatur JFrame
        setTitle("Form Biodata Siswa");
        setSize(600, 350);
        setLocation(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));

        // Bagian NORTH (Judul)
        JLabel judul = new JLabel("FORM BIODATA SISWA", JLabel.CENTER);
        judul.setForeground(Color.WHITE);
        judul.setBackground(Color.BLUE);
        judul.setOpaque(true);
        add(judul, BorderLayout.NORTH);

        // Bagian CENTER (Form Input)
        JPanel panelForm = new JPanel(new GridLayout(3, 2, 10, 10));

        panelForm.add(new JLabel("Nama"));
        txtNama = new JTextField();
        panelForm.add(txtNama);

        panelForm.add(new JLabel("Kelas"));
        txtKelas = new JTextField();
        panelForm.add(txtKelas);

        panelForm.add(new JLabel("Hobi"));
        txtHobi = new JTextField();
        panelForm.add(txtHobi);

        add(panelForm, BorderLayout.CENTER);

        // Bagian EAST (Hasil)
        txtHasil = new JTextArea();
        txtHasil.setEditable(false);
        add(new JScrollPane(txtHasil), BorderLayout.EAST);

        // Bagian SOUTH (Tombol)
        JPanel panelTombol = new JPanel(new FlowLayout());

        btTampilkan = new JButton("Tampilkan");
        btBersihkan = new JButton("Bersihkan");

        panelTombol.add(btTampilkan);
        panelTombol.add(btBersihkan);

        add(panelTombol, BorderLayout.SOUTH);

        // ActionListener tombol Tampilkan
        btTampilkan.addActionListener(e -> {
            String nama = txtNama.getText();
            String kelas = txtKelas.getText();
            String hobi = txtHobi.getText();

            txtHasil.setText(
                "Nama : " + nama +
                "\nKelas : " + kelas +
                "\nHobi : " + hobi
            );
        });

        // ActionListener tombol Bersihkan
        btBersihkan.addActionListener(e -> {
            txtNama.setText("");
            txtKelas.setText("");
            txtHobi.setText("");
            txtHasil.setText("");
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FormBiodata().setVisible(true);
        });
    }
}
