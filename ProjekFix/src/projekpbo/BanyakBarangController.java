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
public class BanyakBarangController {
    ViewBanyakBarang vbb;
    String nomor_resi;
    ModelBarang mb;

    public BanyakBarangController(ViewBanyakBarang vbb, String nomor_resi, ModelBarang mb) {
        this.vbb = vbb;
        this.nomor_resi = nomor_resi;
        this.mb = mb;
        String detailBarang[]=mb.detailBarang(nomor_resi);
                
                vbb.l2NoResi.setText(nomor_resi);
                vbb.l2Tanggal.setText(detailBarang[1]);
                vbb.l2Pengirim.setText(detailBarang[2]);
                vbb.l2Penerima.setText(detailBarang[3]); 
                vbb.l2Isi.setText(detailBarang[4]);
                vbb.l2Jumlah.setText(detailBarang[5]);
                vbb.l2Berat.setText(detailBarang[6]);
                vbb.l2Biaya.setText(detailBarang[7]);
                
        vbb.btnKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewLihatBarang vlb=new ViewLihatBarang();
                vbb.setVisible(false);
                LihatBarangController Start=new LihatBarangController(vlb, mb);
            }
        });
        vbb.btnHapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                int input = JOptionPane.showConfirmDialog(null,
                        "Apa anda ingin menghapus data Resi dengan Nomor " + nomor_resi + "?", "Pilih Opsi...", JOptionPane.YES_NO_OPTION);

                if (input == 0) {
                    mb.deleteData(nomor_resi);    
                    ViewLihatBarang vlb=new ViewLihatBarang();
                    vbb.setVisible(false);
                    LihatBarangController lbc=new LihatBarangController(vlb, mb);
                } else {
                    JOptionPane.showMessageDialog(null, "Tidak Jadi Dihapus");
                }
            }
        });
        
        vbb.btnEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {                               
                ViewInputBarang vib=new ViewInputBarang();
                vbb.setVisible(false);
                EditController editController=new EditController(vib,mb,nomor_resi);
            }
        });
    }
    
    
}
