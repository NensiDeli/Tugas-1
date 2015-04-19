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
public class Pegawai {
    private String nama;
    private String id;
    private String penugasan;
    private Alamat alamat = new Alamat();
    
    void setNama (String nama)throws Exception{
            if(nama.length()<30){
                for (int i = 0; i < nama.length(); i++) {
                    if(!Character.isLetter(nama.charAt(i))&&!Character.isSpaceChar(nama.charAt(i))){
                        throw new Exception ("Nama Harus Berupa Huruf");
                    }
                }
                this.nama = nama;
            } else {
                throw new Exception ("Nama terlalu panjang");
            }
    }
    
    void setId(String id)throws Exception{
        if(id.length()==6){
                for (int i = 0; i < id.length(); i++) {
                    if(!Character.isDigit(id.charAt(i))){
                        throw new Exception ("ID Harus Berupa Huruf");
                    }
                }
                this.id = id;
            } else {
                throw new Exception ("ID harus 6 digit");
            }
    }
    
    void setPenugasan (String penugasan){
        this.penugasan = penugasan;
    }
    
    void setAlamat (String jalan, String kota, String provinsi){
        alamat.setJalan(jalan);
        alamat.setKota(kota);
        alamat.setProvinsi(provinsi);
    }
    
    String getNama(){
        return nama;
    }
    String getId(){
        return id;
    }
    String getPenugasan(){
        return penugasan;
    }
    void getAlamat(){
        System.out.println("Jalan "+alamat.getJalan()+", Kab/Kota "+alamat.getKota()+", Provinsi "+alamat.getProvinsi());
    }
}
