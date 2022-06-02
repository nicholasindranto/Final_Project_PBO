/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class ViewDetailHarga extends JFrame{
    JLabel lNoResi = new JLabel("No Resi");
    JLabel lTanggal = new JLabel("Tanggal");
    JLabel lPengirim = new JLabel("Pengirim");
    JLabel lPenerima = new JLabel("Penerima");
    JLabel lIsi = new JLabel("Isi");
    JLabel lJumlah = new JLabel("Jumlah");
    JLabel lBerat = new JLabel("Berat");
    JLabel lBiaya = new JLabel("Biaya");      
    
    public JLabel l2NoResi = new JLabel();
    public JLabel l2Tanggal = new JLabel();
    public JLabel l2Pengirim = new JLabel();
    public JLabel l2Penerima = new JLabel();
    public JLabel l2Isi = new JLabel();
    public JLabel l2Jumlah = new JLabel();
    public JLabel l2Berat = new JLabel();
    public JLabel l2Biaya = new JLabel();
          
    JButton btnKembali = new JButton("Kembali");   
    

    public ViewDetailHarga() {    
        
        setTitle("Data");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(700,600);   
        setLocationRelativeTo(null);
        
        add(lNoResi);
        lNoResi.setBounds(530, 20, 90, 20);
        add(l2NoResi);
        l2NoResi.setBounds(530, 40, 130, 20);
        
        add(lTanggal);
        lTanggal.setBounds(530, 60, 90, 20);
        add(l2Tanggal);
        l2Tanggal.setBounds(530, 80, 130, 20);
        
        add(lPengirim);
        lPengirim.setBounds(530, 100, 90, 20);
        add(l2Pengirim);
        l2Pengirim.setBounds(530, 120, 130, 20);
        
        add(lPenerima);
        lPenerima.setBounds(530, 140, 90, 20);
        add(l2Penerima);
        l2Penerima.setBounds(530, 160, 130, 20);
        
        add(lIsi);
        lIsi.setBounds(530, 180, 90, 20);
        add(l2Isi);
        l2Isi.setBounds(530, 200, 130, 20);
        
        add(lJumlah);
        lJumlah.setBounds(530, 220, 90, 20);
        add(l2Jumlah);
        l2Jumlah.setBounds(530, 240, 130, 20);
        
        add(lBerat);
        lBerat.setBounds(530, 260, 90, 20);
        add(l2Berat);
        l2Berat.setBounds(530, 280, 130, 20);
        
        add(lBiaya);
        lBiaya.setBounds(530, 300, 90, 20);
        add(l2Biaya);
        l2Biaya.setBounds(530, 320, 130, 20); 
        
        add(btnKembali);
        btnKembali.setBounds(110, 220, 90, 20);
    }
}
