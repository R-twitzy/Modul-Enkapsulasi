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
public class Bus {
    private double penumpang, maxpenumpang, penumpangbaru;
    private int counter;
    
    public Bus (int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang=0;
    }
    
    public void addpenumpang(int penumpang){
        double temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload Penumpang");
            System.out.println("===============================================");
        }
        else {
            this.penumpang=temp;
            counter++;
        }
    }
    
    public void getPenumpang(int password){
        if (password==90){
            System.out.println("-Password Benar-");
        }
        else{
            System.out.println("!!password Salah!!");
            System.out.println("===============================================");
        }
    }
    
    public void cetak(){
        System.out.println("Jumlah Penumpang Bus Sekarang adalah = " + counter);
        System.out.println("Berat Seluruh Penumpang Bus Sekarang adalah = " + penumpang);
        System.out.println("Berat Maksimum Seluruh Penumpang Bus adalah = " + maxpenumpang);
        System.out.println("Rata-rata Berat Penumpang Bus Sekarang adalah = "+penumpang/counter);
        System.out.println("===============================================");
    }   
    
    public void tutup(){
            System.out.println("---------------------OKE-----------------------");
        }
}
