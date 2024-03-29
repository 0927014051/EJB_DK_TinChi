package Session;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import modal.LopTinChi;

/**
 *
 * @author thanh
 */
@Stateless
public class LopTinChiBean implements LopTinChiRemote {
    List<LopTinChi> loptinchi = new ArrayList<>();
        List<LopTinChi> danhSach = new ArrayList<>();

    @Override
    public void dangKyTinChi() {
        
    }

    @Override
    public void insertTinChi(LopTinChi tc) {
        LopTinChi tinChi = new LopTinChi();
        tinChi.setHocKy(tc.getHocKy());
        tinChi.setId_lopTinChi(tc.getId_lopTinChi());
        tinChi.setNhom(tc.getNhom());
        tinChi.setNienKhoa(tc.getNienKhoa());
        tinChi.setSoLuongSV(tc.getSoLuongSV());
        tinChi.setThoiGianBatDau(tc.getThoiGianBatDau());
        tinChi.setThoiGianKetThuc(tc.getThoiGianKetThuc());
        loptinchi.add(tinChi);
    }

    
    
    @Override
    public List<LopTinChi> danhSachTinChi() {
        danhSach = new ArrayList<>();
        danhSach.add(new LopTinChi("1","Chuyen de cong nghe phan mem", "2023-2024", 1, "Hoc Ky 1", "50", new Date(), new Date()));
        danhSach.add(new LopTinChi("2","Dam bao chat luong phan mem", "2023-2024", 2, "Hoc Ky 1", "40", new Date(), new Date()));
        danhSach.add(new LopTinChi("3","Xay dung cac he thong nhung", "2023-2024", 3, "Hoc Ky 2", "30", new Date(), new Date()));
        danhSach.add(new LopTinChi("4", "Kien truc va thiet ke phan mem","2024-2025", 1, "Hoc Ky 1", "60", new Date(), new Date()));
        danhSach.add(new LopTinChi("5","Phat trien ung dung cho cac thiet bi di dong", "2024-2025", 2, "Hoc Ky 2", "55", new Date(), new Date()));
        danhSach.add(new LopTinChi("5","Phat trien phan mem huong dich vu", "2024-2025", 2, "Hoc Ky 2", "55", new Date(), new Date()));

        return danhSach;
    }

    @Override
    public List<LopTinChi> findLopTinChiById(String id) {
        List<LopTinChi> ds = new ArrayList<>();
        for(LopTinChi item : danhSach ){
            if(item.getId_lopTinChi().equals(id)){
                 ds.add(item);
            }
        }
        return  ds;
    }

}
