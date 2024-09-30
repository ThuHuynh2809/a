package com.nhom64.website_quanlybanhangmaytinh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "yeuThichs")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class YeuThich implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long maYeuThich;  // Favorite ID
    private String tenDangNhap;  // Username

    @ManyToOne
    @JoinColumn(name = "maSanPham")
    private SanPham sanPham;  // Product
}
