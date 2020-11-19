/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116415.latihan59.detectiveconan;

/**
 *
 * @author Server SMKS AL QUDSY
 */
class TokohUtama extends Tokoh {
    
    protected String Tujuan;
    protected String Tim;

    public TokohUtama(String Tujuan, String Tim, String nama, String peran) {
        super(nama, peran);
        this.Tujuan = Tujuan;
        this.Tim = Tim;
    }

    public String getTujuan() {
        return Tujuan;
    }

    public String getTim() {
        return Tim;
    }
    
    public void tampilTokohUtama() {
        System.out.println("Nama   : " + getNama());
        System.out.println("Peran  : " + getPeran());
        System.out.println("Tim    : " + getTim());
        System.out.println("Tujuan : " + getTujuan());
        System.out.println("");
    }
}