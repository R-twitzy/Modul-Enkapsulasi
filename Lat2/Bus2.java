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
public class Bus2 {
    private int penumpang, maxpenumpang;

    //komstruktor
    public Bus2 (int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    
    //metgod mutator
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload Penumpang");
            System.out.println("=====================================");
        }
        else {
            this.penumpang=temp;
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah = "+maxpenumpang);
        System.out.println("=====================================");
    }
    public void tutup(){
            System.out.println("----------------OKE------------------");
        }
}
