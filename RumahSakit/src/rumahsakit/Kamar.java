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

public class Kamar {
    private String tipeKamar;
    private String noKamar;
    private long hargaKamar;
    private long lamaPerawatan;//lamanya dalam hari
    
    
    void setTipeKAmar(String tipeKamar) throws Exception{
        if (tipeKamar=="VIP"||tipeKamar=="bangsal"){
            this.tipeKamar = tipeKamar;
        }else{
            throw new Exception ("Tipe kamar salah, harus VIP/bangsal 1/bangsal 2");
        }
    }
    void setnoKamar(String noKamar)throws Exception{
        if (tipeKamar=="VIP"){
            if(noKamar=="VIP 1"||noKamar=="VIP 2"||noKamar=="VIP 3"){
                this.noKamar = noKamar;
            }else{
                throw new Exception ("No kamar salah. Pilihan kamar VIP : Vip 1, VIP 2, VIP 3");
            }
        }
        else {
            if (noKamar.length()==3){
                int nomor=000;
                try{
                    nomor = Integer.parseInt(noKamar);
                }catch(Exception e){
                    throw new Exception ("Nomor kamar untuk bangsal harus dalam bentuk angka");
                }
                if ((nomor>=201&&nomor<=208)||(nomor>=301&&nomor<=308)||(nomor>=401&&nomor<=408)){
                    this.noKamar = noKamar;
                }
            }else{
                throw new Exception ("Nomor kamar untuk bangsal harus 3 digit");
            }
        }
    }
    
    void setLamaPerawatan (long lamaPerawatan){
        this.lamaPerawatan = lamaPerawatan;
    }
    
    long getBiaya(){
        long biaya;
        hargaKamar = 0;
        if (tipeKamar=="VIP"){
            hargaKamar = 200000;
        }
        else {
            hargaKamar = 100000;
        }
        return biaya = hargaKamar*lamaPerawatan;
    }
    String getTipeKamar(){
        return tipeKamar;
    }
    String getNoKamar(){
        return noKamar;
    }
    long getLamaPerawatan(){
        return lamaPerawatan;
    }
    
}
