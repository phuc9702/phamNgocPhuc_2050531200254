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
public class BaoModify {
    public static List<Bao> getBaoList(String s){
        List<Bao> dataList = new ArrayList<>();
        Connection conn=null;
        PreparedStatement statement=null;
         
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "select * from Bao";
            if(s != null && !s.isEmpty()) {
                sql += " where IdBao like ?";
            }
            statement = conn.prepareStatement(sql);
            if(s != null && !s.isEmpty()) {
                statement.setString(1, s);
            }
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Bao bao = new Bao(
                        resultSet.getString("IdBao"),
                        resultSet.getString("TenNhaXuatBan"),
                        resultSet.getString("SoBanPhatHanh"),
                        resultSet.getString("NgayPhatHanh")
                );
                dataList.add(bao);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return dataList;
    }
    public static void insert(Bao bao) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "insert into Bao(IdBao,TenNhaXuatBan,SoBanPhatHanh,NgayPhatHanh) "
                    + "values (?, ?, ?, ?)";
            statement = conn.prepareStatement(sql);
            statement.setString(1, bao.getIdBao());
            statement.setString(2, bao.getTenNhaXuatBan());
            statement.setString(3, bao.getSoBanPhatHanh());
            statement.setString(4, bao.getNgayPhatHanh());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void update(Bao bao) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "update Bao set IdBao = ?, TenNhaXuatBan = ?, SoBanPhatHanh = ?, NgayPhatHanh = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, bao.getIdBao());
            statement.setString(2, bao.getTenNhaXuatBan());
            statement.setString(3, bao.getSoBanPhatHanh());
            statement.setString(4, bao.getNgayPhatHanh());
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    public static void delete(String IdBao) {
        Connection conn = null;
        PreparedStatement statement = null;
        
        try {
            conn = DriverManager.getConnection(KetNoiSQLServer.URL, KetNoiSQLServer.USERNAME, KetNoiSQLServer.PASSWORD);
            
            String sql = "delete from Bao where IdBao = ?";
            statement = conn.prepareStatement(sql);
            statement.setString(1, IdBao);
            
            statement.execute();
        } catch (SQLException ex) {
            Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(BaoModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
