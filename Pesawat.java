/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BandaraProject;

/**
 *
 * @author ASUS
 */
public class Pesawat {

    /**
     * @return the maskapai
     */
    protected String getMaskapai() {
        return maskapai;
    }

    /**
     * @return the kapasitas
     */
    protected int getKapasitas() {
        return kapasitas;
    }
    
    private String maskapai;
    private int kapasitas;

    public Pesawat(String maskapai, int kapasitas) {
        this.maskapai = maskapai;
        this.kapasitas = kapasitas;
    }
    
}
