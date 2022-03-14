/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyThuVien;

/**
 *
 * @author kvan2
 */
public class TapChi {
    String IdTapChi,TenNhaXuatBan,SoBanPhatHanh,SoPhatHanh,ThangPhatHanh;

    public TapChi() {
    }

    public TapChi(String IdTapChi, String TenNhaXuatBan, String SoBanPhatHanh, String SoPhatHanh, String ThangPhatHanh) {
        this.IdTapChi = IdTapChi;
        this.TenNhaXuatBan = TenNhaXuatBan;
        this.SoBanPhatHanh = SoBanPhatHanh;
        this.SoPhatHanh = SoPhatHanh;
        this.ThangPhatHanh = ThangPhatHanh;
    }

    public String getIdTapChi() {
        return IdTapChi;
    }

    public void setIdTapChi(String IdTapChi) {
        this.IdTapChi = IdTapChi;
    }

    public String getTenNhaXuatBan() {
        return TenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String TenNhaXuatBan) {
        this.TenNhaXuatBan = TenNhaXuatBan;
    }

    public String getSoBanPhatHanh() {
        return SoBanPhatHanh;
    }

    public void setSoBanPhatHanh(String SoBanPhatHanh) {
        this.SoBanPhatHanh = SoBanPhatHanh;
    }

    public String getSoPhatHanh() {
        return SoPhatHanh;
    }

    public void setSoPhatHanh(String SoPhatHanh) {
        this.SoPhatHanh = SoPhatHanh;
    }

    public String getThangPhatHanh() {
        return ThangPhatHanh;
    }

    public void setThangPhatHanh(String ThangPhatHanh) {
        this.ThangPhatHanh = ThangPhatHanh;
    }

    
}
