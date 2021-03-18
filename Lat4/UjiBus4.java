/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2.Lat4;

/**
 *
 * @author LENOVO
 */
public class UjiBus4 {
    public static void main(String[] args){
        
        Bus4 busmini = new Bus4(10);
        busmini.cetak();
        
        busmini.getPassword(40);
        busmini.getPassword(90);
        busmini.pluspenumpang(3);
        busmini.cetak();
        
        busmini.getPassword(90);
        busmini.pluspenumpang(1);
        busmini.cetak();
        
        busmini.getPassword(66);
        busmini.getPassword(90);
        busmini.pluspenumpang(1);
        busmini.cetak();
        
        busmini.getPassword(90);
        busmini.pluspenumpang(8);
        busmini.cetak();
        busmini.tutup();
    }
}