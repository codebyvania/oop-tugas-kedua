/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BandaraProject;

/**
 *
 * @author ASUS
 */
public class PesawatKomersial extends Pesawat implements Persiapan, Penerbangan, Pelayanan {

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

    public PesawatKomersial(String maskapai, int kapasitas) {
        super(maskapai, kapasitas);
        this.maskapai = maskapai;
        this.kapasitas = kapasitas;
    }
    
    public void boarding(){
        System.out.println("1. Penumpang naik ke pesawat " + maskapai + ".");
    }
    
    public void isiBahanBakar(){
        System.out.println("2. Pesawat " + maskapai + " sedang di-isi bahan bakar.");
    }
    
    public void cekMesin(){
        System.out.println("3. Mesin pesawat " + maskapai + " diperiksa.");
    }
    
    public void lepasLandas(){
        System.out.println("4. Pesawat " + maskapai + " lepas landas.");
    }
    
    public void terbang(){
        System.out.println("5. Pesawat " + maskapai + " sedang terbang di udara.");
    }
    
    public void sajikanMakanan(){
        System.out.println("6. Pramugari menyajikan makanan kepada penumpang.");
    }
    
    public void hiburanPesawat(){
        System.out.println("7. Penumpang menikmati hiburan di layar pesawat.");
    }
    
    public void umumkanInfo(){
        System.out.println("8. Kapten mengumumkan informasi bahwa pesawat akan mendarat.");
    }
    
    public void mendarat(){
        System.out.println("9. Pesawat berhasil mendarat.");
    }
    
    public static void main(String []args){
        
        PesawatKomersial citilink = new PesawatKomersial("Citilink",180 );
        
        System.out.println("Maskapai : " + citilink.getMaskapai() + ", Kapasitas : " + citilink.getKapasitas());
        System.out.println("=== Simulasi Penerbangan ===");
        
        citilink.boarding();
        citilink.isiBahanBakar();
        citilink.cekMesin();
        citilink.lepasLandas();
        citilink.terbang();
        citilink.sajikanMakanan();
        citilink.hiburanPesawat();
        citilink.umumkanInfo();
        citilink.mendarat();
        
    }
}
