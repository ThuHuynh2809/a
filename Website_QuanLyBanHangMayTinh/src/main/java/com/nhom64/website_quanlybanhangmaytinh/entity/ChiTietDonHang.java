package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@SuppressWarnings("serial")
@Data
@Entity
@Table(name = "ChiTietDonHangs")
@AllArgsConstructor
@NoArgsConstructor
public class ChiTietDonHang implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maChiTietDonHang;  // Order Detail ID

    @ManyToOne
    @JoinColumn(name = "MaDonHang")
    private DonHang donHang;  // Order

    @ManyToOne
    @JoinColumn(name = "MaSanPham")
    private SanPham sanPham;  // Product

    private Integer gia;  // Price
    private Integer giamGia;  // Discount
    private Integer soLuong;  // Quantity
    private String moTa;  // Description
    private Integer thanhTien;  // Amount

}
