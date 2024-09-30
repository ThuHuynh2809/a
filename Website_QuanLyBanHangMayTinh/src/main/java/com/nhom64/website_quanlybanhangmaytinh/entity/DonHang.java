package com.nhom64.website_quanlybanhangmaytinh.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
@Entity
@Table(name = "DonHangs")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonHang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maDonHang;  // Order ID
    private String ngayTao;  // Create day
    private String soDienThoai;  // Telephone
    private String diaChi;  // Address
    private String hoTen;  // Name
    private String email;  // Email
    private Integer tongTien;  // Total
    private String trangThai;  // Status

    @ManyToOne
    @JoinColumn(name = "TenDangNhap")
    TaiKhoan taiKhoan;  // Account

    @JsonIgnore
    @OneToMany(mappedBy = "donHang")
    List<ChiTietDonHang> chiTietDonHangs;  // Order details
}
