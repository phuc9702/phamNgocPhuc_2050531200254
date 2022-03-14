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
public class Bao {
    String IdBao,TenNhaXuatBan,SoBanPhatHanh, NgayPhatHanh;
    
    public Bao() {
    }

    public Bao(String IdBao, String TenNhaXuatBan, String SoBanPhatHanh, String NgayPhatHanh) {
        this.IdBao = IdBao;
        this.TenNhaXuatBan = TenNhaXuatBan;
        this.SoBanPhatHanh = SoBanPhatHanh;
        this.NgayPhatHanh=NgayPhatHanh;
    }

    public String getIdBao() {
        return IdBao;
    }

    public void setIdBao(String IdBao) {
        this.IdBao = IdBao;
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
    public String getNgayPhatHanh() {
        return NgayPhatHanh;
    }

    public void setNgayPhatHanh(String NgayPhatHanh) {
        this.NgayPhatHanh = NgayPhatHanh;
    }
}
