/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;

/**
 *
 * @author LTC
 */
public class SanPham {
    private int idSanPham;
    private String maSanPham;
    private String tenSanPham;
    private int loaiId;
    private int nhaSanXuatId;
    private int deGiayId;
    private int thuongHieuId;
    private int hinhAnhId;
    private int trangThai;
    private String tenLoai;
    private String tenNhaSanXuat;
    private String tenDeGiay;
    private String tenThuongHieu;
    private String tenHinhAnh;

    public int getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(int idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public int getLoaiId() {
        return loaiId;
    }

    public void setLoaiId(int loaiId) {
        this.loaiId = loaiId;
    }

    public int getNhaSanXuatId() {
        return nhaSanXuatId;
    }

    public void setNhaSanXuatId(int nhaSanXuatId) {
        this.nhaSanXuatId = nhaSanXuatId;
    }

    public int getDeGiayId() {
        return deGiayId;
    }

    public void setDeGiayId(int deGiayId) {
        this.deGiayId = deGiayId;
    }

    public int getThuongHieuId() {
        return thuongHieuId;
    }

    public void setThuongHieuId(int thuongHieuId) {
        this.thuongHieuId = thuongHieuId;
    }

    public int getHinhAnhId() {
        return hinhAnhId;
    }

    public void setHinhAnhId(int hinhAnhId) {
        this.hinhAnhId = hinhAnhId;
    }

    public String getTrangThaiDisplay() {
        return trangThai == 1 ? "Còn hàng" : "Hết hàng";
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getTenNhaSanXuat() {
        return tenNhaSanXuat;
    }

    public void setTenNhaSanXuat(String tenNhaSanXuat) {
        this.tenNhaSanXuat = tenNhaSanXuat;
    }

    public String getTenDeGiay() {
        return tenDeGiay;
    }

    public void setTenDeGiay(String tenDeGiay) {
        this.tenDeGiay = tenDeGiay;
    }

    public String getTenThuongHieu() {
        return tenThuongHieu;
    }

    public void setTenThuongHieu(String tenThuongHieu) {
        this.tenThuongHieu = tenThuongHieu;
    }

    public String getTenHinhAnh() {
        return tenHinhAnh;
    }

    public void setTenHinhAnh(String tenHinhAnh) {
        this.tenHinhAnh = tenHinhAnh;
    }

    public SanPham(int idSanPham, String maSanPham, String tenSanPham, int loaiId, int nhaSanXuatId, int deGiayId, int thuongHieuId, int hinhAnhId, int trangThai, String tenLoai, String tenNhaSanXuat, String tenDeGiay, String tenThuongHieu, String tenHinhAnh) {
        this.idSanPham = idSanPham;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loaiId = loaiId;
        this.nhaSanXuatId = nhaSanXuatId;
        this.deGiayId = deGiayId;
        this.thuongHieuId = thuongHieuId;
        this.hinhAnhId = hinhAnhId;
        this.trangThai = trangThai;
        this.tenLoai = tenLoai;
        this.tenNhaSanXuat = tenNhaSanXuat;
        this.tenDeGiay = tenDeGiay;
        this.tenThuongHieu = tenThuongHieu;
        this.tenHinhAnh = tenHinhAnh;
    }

    public SanPham() {
    }

    @Override
    public String toString() {
        return "SanPham{" + "idSanPham=" + idSanPham + ", maSanPham=" + maSanPham + ", tenSanPham=" + tenSanPham + ", loaiId=" + loaiId + ", nhaSanXuatId=" + nhaSanXuatId + ", deGiayId=" + deGiayId + ", thuongHieuId=" + thuongHieuId + ", hinhAnhId=" + hinhAnhId + ", trangThai=" + trangThai + ", tenLoai=" + tenLoai + ", tenNhaSanXuat=" + tenNhaSanXuat + ", tenDeGiay=" + tenDeGiay + ", tenThuongHieu=" + tenThuongHieu + ", tenHinhAnh=" + tenHinhAnh + '}';
    }


    
    
    
}
