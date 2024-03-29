/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

import java.util.Date;


/**
 *
 * @author thanh
 */
public class SinhVien {
    
    private String Id_SV;
    private String Ho;
    private String Ten;
    private String GioiTinh;
    private String Ngay_Sinh;
    private String Dia_chi;
    private String SDT;
    private String Id_lop;

    public String getId_SV() {
        return Id_SV;
    }

    public void setId_SV(String Id_SV) {
        this.Id_SV = Id_SV;
    }

    public String getHo() {
        return Ho;
    }

    public void setHo(String Ho) {
        this.Ho = Ho;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getNgay_Sinh() {
        return Ngay_Sinh;
    }

    public void setNgay_Sinh(String Ngay_Sinh) {
        this.Ngay_Sinh = Ngay_Sinh;
    }

    public String getDia_chi() {
        return Dia_chi;
    }

    public void setDia_chi(String Dia_chi) {
        this.Dia_chi = Dia_chi;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getId_lop() {
        return Id_lop;
    }

    public void setId_lop(String Id_lop) {
        this.Id_lop = Id_lop;
    }

    public SinhVien(String Id_SV, String Ho, String Ten, String GioiTinh, String Ngay_Sinh, String Dia_chi, String SDT, String Id_lop) {
        this.Id_SV = Id_SV;
        this.Ho = Ho;
        this.Ten = Ten;
        this.GioiTinh = GioiTinh;
        this.Ngay_Sinh = Ngay_Sinh;
        this.Dia_chi = Dia_chi;
        this.SDT = SDT;
        this.Id_lop = Id_lop;
    }

    public SinhVien() {
    }
    
    
    
}
