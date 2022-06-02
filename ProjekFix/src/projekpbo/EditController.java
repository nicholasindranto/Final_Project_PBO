/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author ACER
 */
public class EditController {
    ViewInputBarang vib;
    ModelBarang mb;
    String nomor_resi;

    public EditController(ViewInputBarang vib, ModelBarang mb, String nomor_resi) {
        this.vib = vib;
        this.mb = mb;
        this.nomor_resi = nomor_resi;
        
        String detailBarang[]=mb.detailBarang(nomor_resi);
        
            vib.tfNoResi.setText(nomor_resi);
            vib.tfTanggal.setText(detailBarang[1]);
            vib.tfPengirim.setText(detailBarang[2]);
            vib.tfPenerima.setText(detailBarang[3]);
            vib.tfIsi.setText(detailBarang[4]);
            vib.tfJumlah.setText(detailBarang[5]);
            vib.tfBerat.setText(detailBarang[6]);
            vib.tfBiaya.setText(detailBarang[7]);
            
            
        vib.btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {   
                double jumlah = Double.parseDouble(vib.tfJumlah.getText());
                double berat = Double.parseDouble(vib.tfBerat.getText());
                double biaya = Double.parseDouble(vib.tfBiaya.getText()); 
                mb.updateData(nomor_resi,vib.getTanggal(),vib.getPengirim(),vib.getPenerima(),vib.getIsi(),jumlah,berat,biaya);   
                ViewLihatBarang vlb=new ViewLihatBarang();
                vib.setVisible(false);
                LihatBarangController Start=new LihatBarangController(vlb, mb);
            }
        });
    }
    
    
}
