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
public class ViewInputBarang extends JFrame{
  
    JLabel lNoResi = new JLabel("No Resi");
    JLabel lTanggal = new JLabel("Tanggal");
    JLabel lPengirim = new JLabel("Pengirim");
    JLabel lPenerima = new JLabel("Penerima");
    JLabel lIsi = new JLabel("Isi");
    JLabel lJumlah = new JLabel("Jumlah");
    JLabel lBerat = new JLabel("Berat");
    JLabel lBiaya = new JLabel("Biaya");
    
    public JTextField tfNoResi = new JTextField();
    public JTextField tfTanggal = new JTextField();
    public JTextField tfPengirim = new JTextField();
    public JTextField tfPenerima = new JTextField();
    public JTextField tfIsi = new JTextField();
    public JTextField tfJumlah = new JTextField();
    public JTextField tfBerat = new JTextField();
    public JTextField tfBiaya = new JTextField();
    
    public JButton btnSubmit = new JButton("Submit");
    public JButton btnReset = new JButton("Reset");
    public JButton btnKembali = new JButton("Kembali");
    
    

    public ViewInputBarang() {
        setTitle("Main Menu");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        setLayout(null);
        setSize(400,500);
        setLocationRelativeTo(null);
        
        
        
        add(lNoResi);
        lNoResi.setBounds(120, 20, 90, 20);
        add(tfNoResi);
        tfNoResi.setBounds(120, 40, 160, 20);
        
        add(lTanggal);
        lTanggal.setBounds(120, 60, 90, 20);
        add(tfTanggal);
        tfTanggal.setBounds(120, 80, 160, 20);
        
        add(lPengirim);
        lPengirim.setBounds(120, 100, 90, 20);
        add(tfPengirim);
        tfPengirim.setBounds(120, 120, 160, 20);
        
        add(lPenerima);
        lPenerima.setBounds(120, 140, 90, 20);
        add(tfPenerima);
        tfPenerima.setBounds(120, 160, 160, 20);
        
        add(lIsi);
        lIsi.setBounds(120, 180, 90, 20);
        add(tfIsi);
        tfIsi.setBounds(120, 200, 160, 20);
        
        add(lJumlah);
        lJumlah.setBounds(120, 220, 90, 20);
        add(tfJumlah);
        tfJumlah.setBounds(120, 240, 160, 20);
        
        add(lBerat);
        lBerat.setBounds(120, 260, 90, 20);
        add(tfBerat);
        tfBerat.setBounds(120, 280, 160, 20);
        
        add(lBiaya);
        lBiaya.setBounds(120, 300, 90, 20);
        add(tfBiaya);
        tfBiaya.setBounds(120, 320, 160, 20);
        
        add(btnSubmit);
        btnSubmit.setBounds(120, 370, 80, 20);
        
        add(btnReset);
        btnReset.setBounds(200, 370, 80, 20);
        
        add(btnKembali);
        btnKembali.setBounds(120, 400, 160, 20);
    }

    public String getNoResi(){
        return tfNoResi.getText();
    }
    
    public String getTanggal(){
        return tfTanggal.getText();
    }
    
    public String getPengirim(){
        return tfPengirim.getText();
    }
    
    public String getPenerima(){
        return tfPenerima.getText();
    }
    
    public String getIsi(){
        return tfIsi.getText();
    }
    
    public String getJumlah(){
        return tfJumlah.getText();
    }
    
    public String getBerat(){
        return tfBerat.getText();
    }
    
    public String getBiaya(){
        return tfBiaya.getText();
    }
    
    
    
}
