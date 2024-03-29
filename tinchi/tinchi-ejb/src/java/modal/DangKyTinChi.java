/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modal;

/**
 *
 * @author thanh
 */
public class DangKyTinChi {
    
    private String id;
    private String id_lopTinChi;
    private LopTinChi lopTinChi;

    public DangKyTinChi(String id, String id_lopTinChi,  LopTinChi lopTinChi) {
        this.id = id;
        this.id_lopTinChi = id_lopTinChi;
        this.lopTinChi = lopTinChi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId_lopTinChi() {
        return id_lopTinChi;
    }

    public void setId_lopTinChi(String id_lopTinChi) {
        this.id_lopTinChi = id_lopTinChi;
    }

    public LopTinChi getLopTinChi() {
        return lopTinChi;
    }

    public void setLopTinChi(LopTinChi lopTinChi) {
        this.lopTinChi = lopTinChi;
    }

   

    public DangKyTinChi() {
    }
    
    
    
}
