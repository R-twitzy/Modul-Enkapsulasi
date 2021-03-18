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
public class EncapSiswa {
    private String name, address, kelas;
    private int absen;
    
    //assesor method
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getKelas() {
        return kelas;
    }

    public int getAbsen() {
        return absen;
    }
    
}
