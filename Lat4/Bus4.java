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
public class Bus4 {
    private int penumpang, maxpenumpang;
    
    //konstruktor
    public Bus4 (int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    //method mutator
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
    public void getPassword(int password){
        if (password==90){
            System.out.println("-Password Benar-");
        }
        else{
            System.out.println("!!password Salah!!");
            System.out.println("=====================================");
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
