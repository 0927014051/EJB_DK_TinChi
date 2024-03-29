/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Session;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import modal.SinhVien;

/**
 *
 * @author thanh
 */
@Stateless
public class SinhVienBean implements  SinhVienRemote{
    List<SinhVien> listSinhVien = new ArrayList<>();
    
    
    @Override
    public void insertSinhVien(SinhVien sv) {
        SinhVien sinhVien = new SinhVien();
        sinhVien.setDia_chi(sv.getDia_chi());
        sinhVien.setGioiTinh(sv.getGioiTinh());
        sinhVien.setHo(sv.getHo());
        sinhVien.setId_SV(sv.getId_SV());
        sinhVien.setId_lop(sv.getId_lop());
        sinhVien.setNgay_Sinh(sv.getNgay_Sinh());
        sinhVien.setSDT(sv.getSDT());
        sinhVien.setTen(sv.getTen());
        listSinhVien.add(sinhVien);
        
    }

    @Override
    public void editSinhVien(String id, SinhVien sv) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteSinhVien(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public SinhVien findSinhVien(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     @Override
    public void init() {
        listSinhVien = new ArrayList<>();
        listSinhVien.add(new SinhVien("N20DCCN134", "Trinh Thanh ", "Son", "Nam", "25-07-2002", "DakLak", "0363000451", "D20CQCNPM02-N"));
        listSinhVien.add(new SinhVien("N20DCCN142", "Nguyen Huynh Truc ", "Thanh", "Nu", "01-05-2002", "Ca Mau", "0363000451", "D20CQCNPM02-N"));
        listSinhVien.add(new SinhVien("N20DCCN143", "Le Viet ", "Thanh", "Nam", "04-02-2002", "Binh Duong", "0363000451", "D20CQCNPM02-N"));
        listSinhVien.add(new SinhVien("N20DCCN154", "Tran Thi ", "Thuy", "Nu", "03-04-2002", "Gia Lai", "0363000451", "D20CQCNPM02-N"));
    }

    @Override
    public List<SinhVien> getAllSinhVien() {
        return listSinhVien;
    }

   
}
