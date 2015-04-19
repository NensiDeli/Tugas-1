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
public class Alamat {
    private String jalan;
    private String kota;
    private String provinsi;
    
    void setJalan(String jalan){
        this.jalan = jalan;
    }
    void setKota (String kota){
        this.kota = kota;
    }
    void setProvinsi (String provinsi){
        this.provinsi = provinsi;
    }
    String getJalan(){
        return jalan;
    }
    String getKota(){
        return kota;
    }
    String getProvinsi(){
        return provinsi;
    }
}
