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
public class RumahSakit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Identitas Dokter1
        Pegawai dokter1 = new Pegawai();
        try{
            dokter1.setNama("Nensi");
        } catch (Exception e){
            System.out.println("Terjadi error : "+e.getMessage());
        }
        try{
            dokter1.setId("123456");
        } catch (Exception e){
            System.out.println("Terjadi error : "+e.getMessage());
        }
        dokter1.setPenugasan("Dokter Bedah");
        dokter1.setAlamat("Sensus 2", "JakTim", "DKI Jakarta");
        
        //Identitas Pasien1
        Pasien pasien1 = new Pasien();
        try{
            pasien1.setNama("Si ABC");
        } catch (Exception e){
            System.out.println("Terjadi error : "+e.getMessage());
        }
        try{
            pasien1.setId("654321");
        } catch (Exception e){
            System.out.println("Terjadi error : "+e.getMessage());
        }
        pasien1.setAlamat("Cederawasih No.12", "JakPus", "DKI Jakarta");
        pasien1.setPenyakit("Patah tulang");
        pasien1.setObat("abcdefg", "ABC123", 10);
        pasien1.setKamar("VIP", "VIP 3", 5);
        
       
        cetakPegawai(dokter1);
        cetakPasien(pasien1);
        
        
    }
    static void cetakPegawai(Pegawai pegawai){
        System.out.println("**Identitas Pegawai**");
        System.out.println("Nama        : "+pegawai.getNama());
        System.out.println("ID          : "+pegawai.getId());
        System.out.println("Penugasan   : "+pegawai.getPenugasan());
        System.out.print  ("Alamat      : ");pegawai.getAlamat();
    }
    static void cetakPasien(Pasien pasien){
        System.out.println("**Identitas Pasien**");
        System.out.println("Nama                : "+pasien.getNama());
        System.out.println("ID                  : "+pasien.getId());
        System.out.print  ("Alamat              : ");pasien.getAlamat();
        System.out.println("Informasi perawatan  ");pasien.getKamar();
        System.out.print  ("Obat yang dibutuhkan: ");pasien.getObat();
    }
}
