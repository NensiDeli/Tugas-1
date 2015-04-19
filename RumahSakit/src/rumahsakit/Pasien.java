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
public class Pasien {
    private String nama;
    private String id;
    private Alamat alamat = new Alamat();
    private String penyakit;
    private Obat obat = new Obat();
    private Kamar kamarInap = new Kamar();
    
    void setNama (String nama)throws Exception{
            if(nama.length()<30){
                for (int i = 0; i < nama.length(); i++) {
                    if(Character.isDigit(nama.charAt(i))&&!Character.isSpaceChar(nama.charAt(i))){
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
    
    void setAlamat (String jalan, String kota, String provinsi){
        alamat.setJalan(jalan);
        alamat.setKota(kota);
        alamat.setProvinsi(provinsi);
    }
    
    void setKamar (String tipeKamar, String noKamar, long lamaPerawatan){
        try{
            kamarInap.setTipeKAmar(tipeKamar);
        }catch(Exception e){
            System.out.println("Terjadi Error : "+e.getMessage());
        }
        try{
            kamarInap.setnoKamar(noKamar);
        }catch(Exception e){
            System.out.println("Terjadi Error : "+e.getMessage());
        }
        kamarInap.setLamaPerawatan(lamaPerawatan);
    }
   
    void setPenyakit(String penyakit){
        this.penyakit = penyakit;
    }
    void setObat(String namaProduk,String kodeProduk, int jmlPemakaian){
        obat.setNamaProduk(namaProduk);
        obat.setKodeProduk(kodeProduk);
        obat.setJmlPemakaian(jmlPemakaian);
    }
    
    String getNama(){
        return nama;
    }
    String getId(){
        return id;
    }
    void getAlamat(){
        System.out.println("Jalan "+alamat.getJalan()+", Kab/Kota "+alamat.getKota()+", Provinsi "+alamat.getProvinsi());
    }
    String getPenyakit(){
        return penyakit;
    }
    void getKamar(){
        System.out.println("    Tipe Kamar              : "+kamarInap.getTipeKamar());
        System.out.println("    No Kamar                : "+kamarInap.getNoKamar());
        System.out.println("    Lama Rawat Inap         : "+kamarInap.getLamaPerawatan()+" hari");
        System.out.println("    Biaya                   : Rp "+kamarInap.getBiaya());
    }
    void getObat(){
        System.out.println("    Nama Obat   : "+obat.getNamaProduk());
        System.out.println("    Kode Produk : "+obat.getKodeProduk());
        System.out.println("    Jumlah      : "+obat.getJmlPemakaian());
    }
}
