/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

import javax.swing.*;

/**
 *
 * @author HP
 */
public class ViewBanyakBarang extends JFrame{
    JLabel lNoResi = new JLabel("No Resi :");
    JLabel lTanggal = new JLabel("Tanggal :");
    JLabel lPengirim = new JLabel("Pengirim :");
    JLabel lPenerima = new JLabel("Penerima :");
    JLabel lIsi = new JLabel("Isi :");
    JLabel lJumlah = new JLabel("Jumlah :");
    JLabel lBerat = new JLabel("Berat :");
    JLabel lBiaya = new JLabel("Biaya :");     
    
    JLabel l2NoResi = new JLabel();
    JLabel l2Tanggal = new JLabel();
    JLabel l2Pengirim = new JLabel();
    JLabel l2Penerima = new JLabel();
    JLabel l2Isi = new JLabel();
    JLabel l2Jumlah = new JLabel();
    JLabel l2Berat = new JLabel();
    JLabel l2Biaya = new JLabel();
   
    
    JButton btnEdit = new JButton("Edit");   
    JButton btnKembali = new JButton("Kembali");   
    JButton btnHapus = new JButton("Hapus");
     

    public ViewBanyakBarang() {    
        
        setTitle("Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400,500);   
        setLocationRelativeTo(null);
        
        add(lNoResi);
        lNoResi.setBounds(150, 20, 90, 20);
        add(l2NoResi);
        l2NoResi.setBounds(220, 20, 90, 20);
        
        add(lTanggal);
        lTanggal.setBounds(150, 60, 90, 20);
        add(l2Tanggal);
        l2Tanggal.setBounds(220, 60, 90, 20);
        
        add(lPengirim);
        lPengirim.setBounds(150, 100, 90, 20);
        add(l2Pengirim);
        l2Pengirim.setBounds(220, 100, 90, 20);
        
        add(lPenerima);
        lPenerima.setBounds(150, 140, 90, 20);
        add(l2Penerima);
        l2Penerima.setBounds(220, 140, 90, 20);
        
        add(lIsi);
        lIsi.setBounds(150, 180, 90, 20);
        add(l2Isi);
        l2Isi.setBounds(220, 180, 90, 20);
        
        add(lJumlah);
        lJumlah.setBounds(150, 220, 90, 20);
        add(l2Jumlah);
        l2Jumlah.setBounds(220, 220, 90, 20);
        
        add(lBerat);
        lBerat.setBounds(150, 260, 90, 20);
        add(l2Berat);
        l2Berat.setBounds(220, 260, 90, 20);
        
        add(lBiaya);
        lBiaya.setBounds(150, 300, 90, 20);
        add(l2Biaya);
        l2Biaya.setBounds(220, 300, 90, 20);
        
        add(btnEdit);
        btnEdit.setBounds(100, 350, 90, 20);
        
        add(btnKembali);
        btnKembali.setBounds(150, 380, 90, 20);
                     
        
        add(btnHapus);
        btnHapus.setBounds(180, 350, 90, 20);
                
    }   

    
    
}
