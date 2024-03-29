/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Session;

/**
 *
 * @author thanh
 */

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import modal.DangKyTinChi;

@Stateless
public class DangKyTinChiBean implements DangKyTinChiRemote{
    
    List<DangKyTinChi> ds = new ArrayList<>();

    @Override
    public List<DangKyTinChi> danhSachDangKyTinChi() {
        return ds;
    }

    @Override
    public void dangKyTinChi(String idLopTinChi) {
        DangKyTinChi tc = new DangKyTinChi();
        tc.setId_lopTinChi(idLopTinChi);
        ds.add(tc);
    }
    
    
}
