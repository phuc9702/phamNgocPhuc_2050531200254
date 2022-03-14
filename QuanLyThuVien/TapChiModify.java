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
public class TapChiModify {
    public static List<TapChi> getTapChiList(String s){
        List<TapChi> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
         
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "select * from TapChi";
            if(s != null && !s.isEmpty()) {
                sql += " where IdTapChi like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                TapChi tapchi = new TapChi(
                        resultSet.getString("IdTapChi"),
                        resultSet.getString("TenNhaXuatBan"),
                        resultSet.getString("SoBanPhatHanh"),
                        resultSet.getString("SoPhatHanh"),
                        resultSet.getString("ThangPhatHanh")
                );
                dataList.add(tapchi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(TapChi tapchi) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "insert into TapChi(IdTapChi,TenNhaXuatBan,SoBanPhatHanh,SoPhatHanh,ThangPhatHanh) "
                    + "values (?, ?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, tapchi.getIdTapChi());
            statement.setString(2, tapchi.getTenNhaXuatBan());
            statement.setString(3, tapchi.getSoBanPhatHanh());
            statement.setString(4, tapchi.getSoPhatHanh());
            statement.setString(5, tapchi.getThangPhatHanh());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(TapChi tapchi) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "update TapChi set IdTapChi = ?, TenNhaXuatBan = ?, SoBanPhatHanh = ?, SoPhatHanh = ?, ThangPhatHanh = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, tapchi.getIdTapChi());
            statement.setString(2, tapchi.getTenNhaXuatBan());
            statement.setString(3, tapchi.getSoBanPhatHanh());
             statement.setString(4, tapchi.getSoPhatHanh());
            statement.setString(5, tapchi.getThangPhatHanh());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String IdTapChi) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "delete from TapChi where IdTapChi = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, IdTapChi);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(TapChiModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
