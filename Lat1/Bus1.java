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
public class Bus1 {
        public int penumpang;
        public int maxpenumpang;
        
        public void cetak(){
            System.out.println("Penumpang sekarang adalah "+penumpang);
            System.out.println("Penumpang maksimum seharusnya  adalah "+maxpenumpang);
            System.out.println("=====================================");
        }
        public void tutup(){
            System.out.println("----------------OKE------------------");
        }
    }
