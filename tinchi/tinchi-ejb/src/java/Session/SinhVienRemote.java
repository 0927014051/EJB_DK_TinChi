/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Session;

import java.util.List;
import javax.ejb.Remote;
import modal.SinhVien;

/**
 *
 * @author thanh
 */
@Remote
public interface SinhVienRemote {
    
    public void insertSinhVien(SinhVien sv);
    
    public void editSinhVien(String id, SinhVien sv);
    
    public void deleteSinhVien(String id);
    
    public SinhVien findSinhVien(String id);
    
    public List<SinhVien> getAllSinhVien();
    
    public void init();
}
