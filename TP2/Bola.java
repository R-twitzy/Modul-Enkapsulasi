/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul2.TP2;

/**
 *
 * @author LENOVO
 */
public class Bola {
    private double jarijari, diameter, luaspermukaan,volume;
    
    public void SetJarijari(){
        jarijari = 10;
        System.out.println("Jari-jari Bola adalah = "+jarijari);
    }
    public void showDiameter(){
        diameter = 2*jarijari;
        System.out.println("Diameter Bola adalah = "+ diameter);
    }
    public void showLuaspermukaan(){
        luaspermukaan = 4*Math.PI*jarijari*jarijari;
        System.out.println("Luas Permukaan Bola adalah = "+luaspermukaan);
    }
    public void showVolume(){
        volume = Math.PI*4/3*jarijari*jarijari*jarijari;
        System.out.println("Volume Bola adalah = "+volume);
        System.out.println("=====================================");
    }
}
