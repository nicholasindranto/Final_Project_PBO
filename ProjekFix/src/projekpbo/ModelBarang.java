/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekpbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ModelBarang {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/project";
    static final String USER = "root";
    static final String PASS = "";
    
    Connection koneksi;
    Statement statement;

    public ModelBarang() {
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println("Koneksi Gagal");
        }
    }
    
    public String[][] readBarang(){
        try{
            int jmlData = 0;
            
            String data[][] = new String[getBanyakData()][8]; 
            
            String query = "SELECT * FROM resi"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("nomor_resi"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("tanggal");
                data[jmlData][2] = resultSet.getString("pengirim");             
                data[jmlData][3] = resultSet.getString("penerima");
                data[jmlData][4] = resultSet.getString("isi");
                data[jmlData][5] = String.valueOf(resultSet.getDouble("jumlah"));
                data[jmlData][6] = String.valueOf(resultSet.getDouble("berat"));
                data[jmlData][7] = String.valueOf(resultSet.getDouble("biaya"));
                jmlData++;
            }
            return data;
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    
    public void insertData(String nomor_resi, String tanggal, String pengirim, String penerima, String isi, double jumlah, double berat, double biaya){
        int jmlData=0;
        
        try {
           String query = "SELECT * FROM `resi` WHERE nomor_resi='" +nomor_resi+"'"; 
           statement = koneksi.createStatement();
           System.out.println(nomor_resi + " " + tanggal + " " + pengirim + " " + penerima + " " + isi + " " + jumlah + " " + berat + " " + biaya);
           ResultSet resultSet = statement.executeQuery(query);
           
            while (resultSet.next()){ 
                jmlData++;
            }
            statement.close();
            if (jmlData==0) {
                query = "INSERT INTO `resi` (`nomor_resi`,`tanggal`,`pengirim`,`penerima`,`isi`,`jumlah`,`berat`,`biaya`) VALUES('"+nomor_resi+"','"+tanggal+"','"+pengirim+"','"+penerima+"','"+isi+"','"+jumlah+"','"+berat+"','"+biaya+"')";
           
                statement = koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage()); 
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateData(String nomor_resi, String tanggal, String pengirim, String penerima, String isi, double jumlah, double berat, double biaya){
        int jmlData=0;
         try {
           String query = "SELECT * FROM resi WHERE nomor_resi='" + nomor_resi +"'"; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE resi SET tanggal='"+tanggal+"', pengirim='" +pengirim+ "', penerima='" +penerima+ "',isi='" +isi+ "',jumlah='" +jumlah+ "',berat='" +berat+ "',biaya='" +biaya+ "' WHERE nomor_resi='" + nomor_resi+"'"; 
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public int getBanyakData(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "SELECT * FROM resi";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public String[] detailBarang(String nomor_resi) {
        try{
            String data[] = new String[8];
            String query = "SELECT * FROM resi WHERE nomor_resi = '"+nomor_resi+"'";            
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[0] = resultSet.getString("nomor_resi"); //harus sesuai nama kolom di mysql
                data[1] = resultSet.getString("tanggal");
                data[2] = resultSet.getString("pengirim");
                data[3] = resultSet.getString("penerima");
                data[4] = resultSet.getString("isi");
                data[5] = Double.toString(resultSet.getDouble("jumlah"));
                data[6] = Double.toString(resultSet.getDouble("berat")); 
                data[7] = Double.toString(resultSet.getDouble("biaya"));
            }
            return data;
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public void deleteData (String nomor_resi) {
        try{
            String query = "DELETE FROM resi WHERE nomor_resi = '"+nomor_resi+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
}
