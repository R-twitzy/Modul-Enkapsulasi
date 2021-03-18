/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2.Lat2;

/**
 *
 * @author LENOVO
 */
public class Ujibus2 {
    public static void main(String[] args){
        
        Bus2 busmini = new Bus2(10);
        busmini.cetak();
        
        busmini.pluspenumpang(3);
        busmini.cetak();
        
        busmini.pluspenumpang(1);
        busmini.cetak();
        
        busmini.pluspenumpang(1);
        busmini.cetak();
        
        busmini.pluspenumpang(8);
        busmini.cetak();
        busmini.tutup(); 
    }
}
