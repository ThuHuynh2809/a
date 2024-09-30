package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sanPhams")
public class SanPham implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maSanPham;  // Product ID
    private String ten;  // Name
    private int soLuong;  // Quantity
    private int donGia;  // Unit Price
    private int giaCu;  // Old Price
    private int giamGia;  // Discount
    private String hang;  // Publishing
    private String tacGia;  // Author
    private String nhaCungCap;  // Provider
    private String hinhAnh1;  // Image 1
    private String hinhAnh2;  // Image 2
    private String hinhAnh3;  // Image 3
    private String hinhAnh4;  // Image 4
    private String hinhAnh5;  // Image 5
    private String moTa;  // Description
    private String ngayNhap;  // Entered Day
    private String giamGiaHot;  // Hot Sale

    @ManyToOne
    @JoinColumn(name = "maDanhMuc")
    private DanhMuc danhMuc;  // Category

    @JsonIgnore
    @OneToMany(mappedBy = "sanPham", cascade = CascadeType.ALL)
    private List<ChiTietDonHang> chiTietDonHangs;  // Order Details

    @JsonIgnore
    @OneToMany(mappedBy = "sanPham")
    private List<BinhLuan> binhLuans;  // Comments
}
