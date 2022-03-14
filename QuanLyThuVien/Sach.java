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
public class Sach {
    String IdSach,TenNhaXuatBan,SoBanPhatHanh,TenTacGia;
    String SoTrang;

    public Sach() {
    }

    public Sach(String IdSach, String TenNhaXuatBan, String SoBanPhatHanh, String TenTacGia, String SoTrang) {
        this.IdSach = IdSach;
        this.TenNhaXuatBan = TenNhaXuatBan;
        this.SoBanPhatHanh = SoBanPhatHanh;
        this.TenTacGia = TenTacGia;
        this.SoTrang = SoTrang;
    }

    public String getIdSach() {
        return IdSach;
    }

    public void setIdSach(String IdSach) {
        this.IdSach = IdSach;
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

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String TenTacGia) {
        this.TenTacGia = TenTacGia;
    }

    public String getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(String SoTrang) {
        this.SoTrang = SoTrang;
    }

    @Override
    public String toString() {
        return "Sach{" + "IdSach=" + IdSach + ", TenNhaXuatBan=" + TenNhaXuatBan + ", SoBanPhatHanh=" + SoBanPhatHanh + ", TenTacGia=" + TenTacGia + ", SoTrang=" + SoTrang + '}';
    }

    
}
