/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6.pkg2022431640.latihan55.handphone;

/**
 *
 * @author 
 * Nama : Aulia dwi fauzia
 * Kelas : PBO FS112B
 * NIM : 2022431640
 */
public class Android extends Handphone {
    private String keyStore;
    
    public Android (String man, String os, String model, int harga) {
        super(man, os, model, harga);
    }
    public String getKeyStore() {
        return keyStore;
    }
    public void setKeyStrore(String keyStore) {
        this.keyStore = keyStore;
    }
}
