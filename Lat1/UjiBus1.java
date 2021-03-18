/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2.Lat1;

/**
 *
 * @author user
 */
public class UjiBus1 {
    public static void main(String[] args){
        //membuat objek busmini darikelas Bus
        Bus1 busmini = new Bus1();
        //memasukan nilai ke objek busMini
        busmini.penumpang = 5;
        busmini.maxpenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busmini.cetak();
        //menambah penumpang pada busmini
        busmini.penumpang=busmini.penumpang+5;
        //memanggil method cetak pada kelas Bus
        busmini.cetak();
        //mengurangi penumpang pada busmini
        busmini.penumpang=busmini.penumpang-2;
        //memanggil method cetak pada kelas Bus
        busmini.cetak();
        //menambah penumpang pada busmini
        busmini.penumpang=busmini.penumpang+8;
        //memanggil method cetak pada kelas Bus
        busmini.cetak();
        
        busmini.tutup();
        
    }
}
