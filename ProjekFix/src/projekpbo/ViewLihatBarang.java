/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class ViewLihatBarang extends JFrame{
    JButton btnKembali = new JButton("Kembali");  
    public JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"No Resi", "Tanggal", "Pengirim", "Penerima", "Isi", "Jumlah", "Berat", "Biaya"};

    public ViewLihatBarang() {
        dtm = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data ");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(600,500);
        setLocationRelativeTo(null);
        
        add(scrollPane);
        scrollPane.setBounds(20, 20, 480, 300);
              
        add(btnKembali);
        btnKembali.setBounds(20, 420, 90, 20);
    }   
}
