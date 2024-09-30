package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "TaiKhoan")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TaiKhoan implements Serializable {
    @Id
    private String tenDangNhap;  // Username
    private String matKhau;       // Password
    private String hoTen;         // Fullname
    private String email;         // Email
    private String hinhAnh;       // Image
    private String diaChi;        // Address
    private String soDienThoai;   // Telephone
    private String datLaiMatKhau; // Reset password

    @JsonIgnore
    @OneToMany(mappedBy = "taiKhoan")
    List<DonHang> donHangs;  // Orders

    @JsonIgnore
    @OneToMany(mappedBy = "taiKhoan", fetch = FetchType.EAGER)
    List<PhanQuyen> quyenHans;  // Authorities

    @JsonIgnore
    @OneToMany(mappedBy = "taiKhoan")
    List<BinhLuan> binhLuans;  // Comments

    @JsonIgnore
    @OneToMany(mappedBy = "taiKhoan")
    List<PhanHoi> phanHois;  // Feedbacks
}
