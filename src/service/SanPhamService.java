
package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import repository.DBConnect;
import repository.SanPham;

public class SanPhamService {
    Connection connect = DBConnect.getConnection();
    
    public ArrayList<SanPham> getToAllSanPham() {
        ArrayList<SanPham> listSanPham = new ArrayList<>();
        String query = "SELECT Id_SanPham, Ma_SanPham, Ten_SanPham, Loai_Id, NhaSanXuat_Id, DeGiay_Id, ThuongHieu_Id, HinhAnh_Id FROM SanPham";
        try {
            PreparedStatement ps = connect.prepareStatement(query);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                listSanPham.add(new SanPham(
                    rs.getInt("Id_SanPham"),
                    rs.getString("Ma_SanPham"),
                    rs.getString("Ten_SanPham"),
                    rs.getInt("Loai_Id"),
                    rs.getInt("NhaSanXuat_Id"),
                    rs.getInt("DeGiay_Id"),
                    rs.getInt("ThuongHieu_Id"),
                    rs.getInt("HinhAnh_Id")
                ));
            }
        } catch (Exception e) {
            System.out.println("Error at get to all SanPham: " + e.getMessage());
        }
        return listSanPham;
    }
}
