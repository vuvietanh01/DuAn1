
package repository;

public class ChiTietSanPham {
    private int idChiTietSanPham;
    private int namSx;
    private double giaNhap;
    private double giaBan;
    private int soLuong;
    private String moTa;
    private int sanPhamId;
    private int sizeId;
    private int mauSacId;

    public int getIdChiTietSanPham() {
        return idChiTietSanPham;
    }

    public void setIdChiTietSanPham(int idChiTietSanPham) {
        this.idChiTietSanPham = idChiTietSanPham;
    }

    public int getNamSx() {
        return namSx;
    }

    public void setNamSx(int namSx) {
        this.namSx = namSx;
    }

    public double getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(double giaNhap) {
        this.giaNhap = giaNhap;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSanPhamId() {
        return sanPhamId;
    }

    public void setSanPhamId(int sanPhamId) {
        this.sanPhamId = sanPhamId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public int getMauSacId() {
        return mauSacId;
    }

    public void setMauSacId(int mauSacId) {
        this.mauSacId = mauSacId;
    }

    public ChiTietSanPham(int idChiTietSanPham, int namSx, double giaNhap, double giaBan, int soLuong, String moTa, int sanPhamId, int sizeId, int mauSacId) {
        this.idChiTietSanPham = idChiTietSanPham;
        this.namSx = namSx;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.moTa = moTa;
        this.sanPhamId = sanPhamId;
        this.sizeId = sizeId;
        this.mauSacId = mauSacId;
    }

    public ChiTietSanPham() {
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "idChiTietSanPham=" + idChiTietSanPham + ", namSx=" + namSx + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + ", soLuong=" + soLuong + ", moTa=" + moTa + ", sanPhamId=" + sanPhamId + ", sizeId=" + sizeId + ", mauSacId=" + mauSacId + '}';
    }
    
    
}
