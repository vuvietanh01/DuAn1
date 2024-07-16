
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
    String query = "SELECT SP.Id_SanPham, SP.Ma_SanPham, SP.Ten_SanPham, SP.Loai_Id, SP.NhaSanXuat_Id, SP.DeGiay_Id, SP.ThuongHieu_Id, SP.HinhAnh_Id, SP.TrangThai, " +
                   "L.Ten_Loai, NSX.Ten_NhaSanXuat, CLDG.Ten_Chat_Lieu, TH.Ten_ThuongHieu, HA.Hinh_Anh " +
                   "FROM SanPham SP " +
                   "JOIN Loai L ON SP.Loai_Id = L.Id_Loai " +
                   "JOIN NhaSanXuat NSX ON SP.NhaSanXuat_Id = NSX.Id_NhaSanXuat " +
                   "JOIN ChatLieuDeGiay CLDG ON SP.DeGiay_Id = CLDG.Id_DeGiay " +
                   "JOIN ThuongHieu TH ON SP.ThuongHieu_Id = TH.Id_ThuongHieu " +
                   "JOIN HinhAnh HA ON SP.HinhAnh_Id = HA.Id_HinhAnh";

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
                rs.getInt("HinhAnh_Id"),
                rs.getInt("TrangThai"),
                rs.getString("Ten_Loai"),
                rs.getString("Ten_NhaSanXuat"),
                rs.getString("Ten_Chat_Lieu"), // Đảm bảo tên cột đúng
                rs.getString("Ten_ThuongHieu"),
                rs.getString("Hinh_Anh")
            ));
        }
    } catch (Exception e) {
        System.out.println("Error at get to all SanPham: " + e.getMessage());
    }
    return listSanPham;
}

}
