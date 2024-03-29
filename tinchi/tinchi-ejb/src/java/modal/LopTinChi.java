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
public class LopTinChi {
    
    private String id_lopTinChi;
    private String tenLopTinChi;
    private String nienKhoa;
    private int nhom;
    private String hocKy;
    private String soLuongSV;
    private Date thoiGianBatDau;
    private Date thoiGianKetThuc;

    public String getId_lopTinChi() {
        return id_lopTinChi;
    }

    public void setId_lopTinChi(String id_lopTinChi) {
        this.id_lopTinChi = id_lopTinChi;
    }

    public String getNienKhoa() {
        return nienKhoa;
    }

    public void setNienKhoa(String nienKhoa) {
        this.nienKhoa = nienKhoa;
    }

    public int getNhom() {
        return nhom;
    }

    public void setNhom(int nhom) {
        this.nhom = nhom;
    }

    public String getHocKy() {
        return hocKy;
    }

    public void setHocKy(String hocKy) {
        this.hocKy = hocKy;
    }

    public String getSoLuongSV() {
        return soLuongSV;
    }

    public void setSoLuongSV(String soLuongSV) {
        this.soLuongSV = soLuongSV;
    }

    public Date getThoiGianBatDau() {
        return thoiGianBatDau;
    }

    public void setThoiGianBatDau(Date thoiGianBatDau) {
        this.thoiGianBatDau = thoiGianBatDau;
    }

    public Date getThoiGianKetThuc() {
        return thoiGianKetThuc;
    }

    public void setThoiGianKetThuc(Date thoiGianKetThuc) {
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    public String getTenLopTinChi() {
        return tenLopTinChi;
    }

    public void setTenLopTinChi(String tenLopTinChi) {
        this.tenLopTinChi = tenLopTinChi;
    }

    public LopTinChi(String id_lopTinChi, String tenLopTinChi, String nienKhoa, int nhom, String hocKy, String soLuongSV, Date thoiGianBatDau, Date thoiGianKetThuc) {
        this.id_lopTinChi = id_lopTinChi;
        this.tenLopTinChi = tenLopTinChi;
        this.nienKhoa = nienKhoa;
        this.nhom = nhom;
        this.hocKy = hocKy;
        this.soLuongSV = soLuongSV;
        this.thoiGianBatDau = thoiGianBatDau;
        this.thoiGianKetThuc = thoiGianKetThuc;
    }

    

    public LopTinChi() {
    }
    
    
}
