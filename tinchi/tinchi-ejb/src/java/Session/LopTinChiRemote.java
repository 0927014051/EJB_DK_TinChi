/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Session;

import java.util.List;
import javax.ejb.Remote;
import modal.LopTinChi;

/**
 *
 * @author thanh
 */
@Remote
public interface LopTinChiRemote {
    
    public void insertTinChi(LopTinChi tc);
    
    public void dangKyTinChi();
        
    public List<LopTinChi> danhSachTinChi();
    
    public List<LopTinChi> findLopTinChiById(String id);
    
    
}
