/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumahsakit;
/**
 *
 * @author Nensi Fitria Deli
 */
public class Obat {
    private String kodeProduk;
    private String namaProduk;
    private int jmlPemakaian;
    
    void setKodeProduk (String kodeProduk){
        this.kodeProduk = kodeProduk;
    }//no produk boleh kombinasi huruf dan angka
    void setNamaProduk (String namaProduk){
        this.namaProduk = namaProduk;
    }
    void setJmlPemakaian (int jmlPemakaian){
        this.jmlPemakaian = jmlPemakaian;
    }
    String getKodeProduk(){
        return kodeProduk;
    }
    String getNamaProduk(){
        return namaProduk;
    }
    int getJmlPemakaian(){
        return jmlPemakaian;
    }
    
}
