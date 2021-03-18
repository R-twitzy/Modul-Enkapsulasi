/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2.TP1;

/**
 *
 * @author LENOVO
 */
public class UjiBus {
    public static void main(String[] args){
        
        Bus busmini = new Bus(300);
        busmini.cetak();
        
        busmini.getPenumpang(40);
        busmini.getPenumpang(90);
        busmini.addpenumpang(66);
        busmini.cetak();
        
        busmini.getPenumpang(90);
        busmini.addpenumpang(70);
        busmini.cetak();
        
        busmini.getPenumpang(90);
        busmini.addpenumpang(48);
        busmini.cetak();
        
        busmini.getPenumpang(90);
        busmini.addpenumpang(53);
        busmini.cetak();
        
        busmini.getPenumpang(70);
        busmini.getPenumpang(90);
        busmini.addpenumpang(75);
        busmini.cetak();
        busmini.tutup();
    }
}
