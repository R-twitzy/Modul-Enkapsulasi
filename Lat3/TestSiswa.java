/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2.Lat3;

/**
 *
 * @author user
 */
public class TestSiswa {
    public static void main(String[] args){
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Walyul'ahdi");
        siswa.setAddress("Tulungagung");
        siswa.setKelas("XR1");
        siswa.setAbsen(39);
        
        System.out.println("Nama : "+siswa.getName());
        System.out.println("Kelas : "+siswa.getKelas());
        System.out.println("Absen : "+siswa.getAbsen());
        System.out.println("Alamat : "+siswa.getAddress());
    }
}
