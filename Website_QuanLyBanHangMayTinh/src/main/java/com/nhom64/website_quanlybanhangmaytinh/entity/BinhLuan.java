package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "BinhLuans")
@AllArgsConstructor
@NoArgsConstructor
public class BinhLuan implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maBinhLuan;  // Comment ID

    @ManyToOne
    @JoinColumn(name = "TenDangNhap")
    private TaiKhoan taiKhoan;  // Account

    @ManyToOne
    @JoinColumn(name = "MaSanPham")
    private SanPham sanPham;  // Product

    private String moTa;  // Description
}
