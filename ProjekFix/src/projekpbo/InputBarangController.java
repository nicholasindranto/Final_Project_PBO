/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class InputBarangController {
    ViewInputBarang viewinputbarang;
    ModelBarang modelbarang;

    public InputBarangController(ViewInputBarang viewinputbarang, ModelBarang modelbarang) {
        this.viewinputbarang = viewinputbarang;
        this.modelbarang = modelbarang;
        
        viewinputbarang.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewMainMenu viewmainmenu =new ViewMainMenu();
                viewinputbarang.setVisible(false);
                MainMenuController Start=new MainMenuController(viewmainmenu);
            }
        });
        
        viewinputbarang.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(viewinputbarang.getNoResi().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nama Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getTanggal().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Harga Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getPengirim().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getPenerima().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getIsi().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getJumlah().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getBerat().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                else if(viewinputbarang.getBiaya().isEmpty()){
                    JOptionPane.showMessageDialog(null, "Massa Tidak Boleh Kosong");
                }
                
                else{
                    double jumlah = Double.parseDouble(viewinputbarang.getJumlah());
                    double berat = Double.parseDouble(viewinputbarang.getBerat());
                    double biaya = Double.parseDouble(viewinputbarang.getBiaya());
                    
                    modelbarang.insertData(viewinputbarang.getNoResi(),viewinputbarang.getTanggal(),viewinputbarang.getPengirim(),viewinputbarang.getPenerima(),viewinputbarang.getIsi(),jumlah,berat,biaya);
                }
                
            }
        });
        
        viewinputbarang.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                viewinputbarang.tfNoResi.setText("");
                viewinputbarang.tfTanggal.setText("");
                viewinputbarang.tfPengirim.setText("");
                viewinputbarang.tfPenerima.setText("");
                viewinputbarang.tfIsi.setText("");
                viewinputbarang.tfJumlah.setText("");
                viewinputbarang.tfBerat.setText("");
                viewinputbarang.tfBiaya.setText("");
            }
        });
    }
    
}
