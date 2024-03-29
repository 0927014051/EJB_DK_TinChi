/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Session;

import java.util.List;
import javax.ejb.Remote;
import modal.DangKyTinChi;

/**
 *
 * @author thanh
 */
@Remote
public interface DangKyTinChiRemote {
    
    public List<DangKyTinChi> danhSachDangKyTinChi();
    
    public void dangKyTinChi(String idLopTinChi);
    
    
    
}
