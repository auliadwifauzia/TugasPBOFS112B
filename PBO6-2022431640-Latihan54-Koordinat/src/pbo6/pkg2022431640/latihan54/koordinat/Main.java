/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022431640.latihan54.koordinat;

/**
 *
 * Nama : Aulia dwi fauzia
 * Kelas : PBO FS112B
 * NIM : 2022431640
 */
public class Main {
     public static void main(String[] args) { 
        warnaKoordinat wk = new warnaKoordinat(10, 4, "Jingga");
        Koordinat k = new Koordinat(10, 4);
        System.out.println("Warna Koordinat : " + wk.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + k.x + ", " + " y : " + k.y);
    }
}
