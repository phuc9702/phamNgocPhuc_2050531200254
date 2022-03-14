/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuanLyThuVien;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author kvan2
 */
public class SachModify {
    public static List<Sach> getSachList(String s){
        List<Sach> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
         
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "select * from Sach";
            if(s != null && !s.isEmpty()) {
                sql += " where IdSach like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Sach sach = new Sach(
                        resultSet.getString("IdSach"),
                        resultSet.getString("TenNhaXuatBan"),
                        resultSet.getString("SoBanPhatHanh"),
                        resultSet.getString("TenTacGia"),
                        resultSet.getString("SoTrang")
                );
                dataList.add(sach);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(Sach sach) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "insert into sach(IdSach,TenNhaXuatBan,SoBanPhatHanh,TenTacGia,SoTrang) "
                    + "values (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, sach.getIdSach());
            statement.setString(2, sach.getTenNhaXuatBan());
            statement.setString(3, sach.getSoBanPhatHanh());
            statement.setString(4, sach.getTenTacGia());
            statement.setString(5, sach.getSoTrang());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(Sach sach) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "update sach set IdSach = ?, TenNhaXuatBan = ?, SoBanPhatHanh = ?, TenTacGia = ?, SoTrang = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, sach.getIdSach());
            statement.setString(2, sach.getTenNhaXuatBan());
            statement.setString(3, sach.getSoBanPhatHanh());
             statement.setString(4, sach.getTenTacGia());
            statement.setString(5, sach.getSoTrang());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String IdSach) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "delete from Sach where IdSach = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, IdSach);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(SachModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
